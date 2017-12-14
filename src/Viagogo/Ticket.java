package Viagogo;




public class Ticket implements Comparable<Ticket> {
	/*
	 * The ticket class implements the comparable interface so that 
	 * it can be kept in a Treeset to be always sorted.
	 */
	private double price;
	
	public Ticket(double price) {
		this.price = price;
	}

	
	public double getTicketPrice() {
		return this.price;
	}


	@Override
	public int compareTo(Ticket o) {
		/*
		 * Since tickets have to be sorted by the price,
		 * the metric used for the compare function is price.
		 */
		return (int)(this.price - o.price);
	}

}
