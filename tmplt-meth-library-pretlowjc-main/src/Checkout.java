/**
 * Checkout.java
 * 
 * @author Justin Pretlow
 * @version 8/2/2021
 */
class Checkout extends Library {

	/**
	 * Template Method.
	 */
    public final void checkout(String item, String name) {
		Patron p = patrons.get(name);

		boolean okayToCheckout = checkPatronAccount(p);

		if (okayToCheckout) {
	    	int days = getDuration(p);
	   		p.checkout(item);
	    	String s = getSuggestion(item);
	    	printReceipt(p, item, days, s);
		}
    }
}
