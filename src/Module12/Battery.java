/*
 * example of instance variables
 */

package Module12;

public class Battery {
	private int maxHours = 24;
	

	protected void setMaxHours(int max) {
		this.maxHours = max;
	}
	
	protected int getMaxHours() {
		return this.maxHours;
	}

}
