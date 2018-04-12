import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author vinay.shivanna
 *
 */
public class GameManager {
	
	List<Player> unfinishedPlayerList = new ArrayList<Player>(); 
	List<Player> finishedPlayerList = new ArrayList<Player>();
	private Board board;
	private Dice dice;
	
	public GameManager(Board board,List<Player> playerList){
		Map<Integer, Shifter> shifterPositionMap = new HashMap<Integer,Shifter>();
		board.initialize(shifterPositionMap);
		unfinishedPlayerList.addAll(playerList);
	}
	
	public List<Player> start() {
		int i=0;
		while(unfinishedPlayerList.size() > 1){
			Player current = unfinishedPlayerList.get(i);
//			current.rollDice(dice);
			int diceValue  = dice.roll(current);
			int newPosition = board.movePlayer(diceValue, current);
			boolean noChange = false;
			if(newPosition == -1){
				noChange = true;
			}
			boolean removed = false;
			if(!noChange){
				if(newPosition == board.getBoardsize()){
					finishedPlayerList.add(current);
					unfinishedPlayerList.remove(i);
					removed = true;
				}
			}
			if(!removed){
				i++;
			}
		}
		return finishedPlayerList;
	}

}
