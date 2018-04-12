import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author vinay.shivanna
 *
 */
public class Board {
	
	private int boardSize;
	
	private Map<Integer,Shifter> shifterPositionMap;
	private Map<Player,Integer> currentPlayerPositionMap;
	
	public void addPlayerList(List<Player> playerList){
		for(Player player :playerList){
			currentPlayerPositionMap.put(player, 1);
		}
	}
	
	public void initialize(Map<Integer,Shifter> shifterPositionMap){
		this.shifterPositionMap = shifterPositionMap;
		boardSize = 100;
	}
	
	
	public int movePlayer(int diceValue, Player player){
		int newPosition = currentPlayerPositionMap.get(player) + diceValue;
		if(newPosition > boardSize){
			return -1;
		}
		Shifter shifter = shifterPositionMap.get(newPosition);
		if(shifter != null){
			newPosition = shifter.shift(newPosition);
		}
		currentPlayerPositionMap.put(player, newPosition);
		return newPosition;
	}
	

	public Map<Integer, Shifter> getShifterPositionMap() {
		return shifterPositionMap;
	}

	public Map<Player, Integer> getCurrentPlayerPositionMap() {
		return currentPlayerPositionMap;
	}

	public void setShifterPositionMap(Map<Integer, Shifter> shifterPositionMap) {
		this.shifterPositionMap = shifterPositionMap;
	}

	public void setCurrentPlayerPositionMap(Map<Player, Integer> currentPlayerPositionMap) {
		this.currentPlayerPositionMap = currentPlayerPositionMap;
	}

	public int getBoardsize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}
}

