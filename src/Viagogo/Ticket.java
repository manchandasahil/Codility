package Viagogo;




public class Ticket implements Comparable<Ticket> {
	private double price;
	
	public Ticket(double price) {
		this.price = price;
	}

	
	public double getTicketPrice() {
		return this.price;
	}


	@Override
	public int compareTo(Ticket o) {
		// TODO Auto-generated method stub
		return (int)(this.price - o.price);
	}

}
