/**
 * Assignement 2
 * 
 * @author Kyle Murphy <kwmurph2@asu.edu>
 * @date 10/09/2019
 */
package cse360assign2;


public class AddingMachine {

	private int total;
	private String transactions;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	// return total
	public int getTotal () {
		return total;
	}
	
	// update transaction string
	// add to total
	public void add (int value) {
		transactions += " + " + Integer.toString(value);
		total += value;
	}
	
	// update transaction string
	// subtract from total
	public void subtract (int value) {
		transactions += " - " + Integer.toString(value);
		total -= value;
	}
	
	// return transaction record string	
	public String toString () {
		return transactions;
	}

	// reset private data
	public void clear() {
		total = 0;
		transactions = "0";
	}
}
