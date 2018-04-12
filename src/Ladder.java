/**
 * 
 */

/**
 * @author vinay.shivanna
 *
 */
public class Ladder extends Shifter{

	public Ladder(int start, int end){
		if (start >= end) throw new IllegalArgumentException("Start shoudnt be greater or equal to end");
		this.finalPosition = end;
		this.startPosition = start;
	}
	
}
