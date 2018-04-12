/**
 * 
 */

/**
 * @author vinay.shivanna
 *
 */
public abstract class Shifter implements Shiftable{
	
	int startPosition, finalPosition;
	
	@Override
	public final int shift(int position) {
		if(position == startPosition) return finalPosition;
		else return -1;
	}
	
}
