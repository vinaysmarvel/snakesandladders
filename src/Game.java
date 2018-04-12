import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author vinay.shivanna
 *
 */
public class Game {
	
	public static void main(){
		Player player1 = new Player();
		Player player2 = new Player();
		List playerList = new ArrayList<Player>();
		playerList.add(player1);
		playerList.add(player2);
		Board board = new Board();
		GameManager game = new GameManager(board, playerList);
		List <Player> finishedPlayerList = game.start();
		for(int i=0; i < finishedPlayerList.size();i++){
			System.out.println((i+1)+": "+finishedPlayerList.get(i));
		}
	}
}
