/**
 * 
 * @author vinay.shivanna
 *
 */
public class Dice {

	public int roll(Player player) {
		Random rand = new Random();
		 
        // Generate random integers in range 0 to 5
        int rand_int1 = rand.nextInt(6);
        //add 1 and return
		return rand_int1+1;
	}
}