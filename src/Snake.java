/**
 * 
 */

/**
 * @author vinay.shivanna
 *
 */
public class Snake extends Shifter{

	public Snake(int start, int end){
		if (start <= end) throw new IllegalArgumentException("Start shoudnt be lesser or equal to end");
		this.finalPosition = end;
		this.startPosition = start;
	}
	
}
