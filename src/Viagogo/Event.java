package Viagogo;

import java.util.TreeSet;

public class Event implements Comparable<Event>{
	/*
	 * This class defines an event in the world space 
	 * which can be put into a sorted set and treeset
	 * Since this is an object type, it needs to be put 
	 * with the comparable or comparator interface.
	 */
	private int x;
	private int y;
	private int id;
	private int distance;
	
	
	TreeSet<Ticket> tickets = new TreeSet<Ticket>();
	/*
	 * Each event has a set of tickets with price ranging from 
	 * a minimum to a maximum values. For ease of our use,
	 * the tickets are always kept sorted, so that the min could be 
	 * returned instantly.
	 */
	public Event(int x, int y,int id) {
		this.id = id;
		this.x = x;
		this.y = y;
	}
	public int getXCoordinate() {
		return x;
	}
	public int getYCoordinate() {
		return y;
	}
	public String toString() {
		return "Event " + id;
		
	}
	public double getCheapestTicket() {
		if(tickets.isEmpty())
			return -1;
		return tickets.pollFirst().getTicketPrice();
	}
	
	public int manhattanDistance(int xcorr,int ycorr) {
		return Math.abs(xcorr-x) + Math.abs(ycorr-y);
		
	}
	public void setDistance(int xcorr, int ycorr) {
		distance = manhattanDistance(xcorr,ycorr);
	}
	public int getDistance() {
		return this.distance;
	}
	public void addTicket(double price) {
		tickets.add(new Ticket(price));
	}
	@Override
	public int compareTo(Event arg0) {
		// TODO Auto-generated method stub
		/*
		 * Since the events have to be sorted by the distance they have 
		 * from the user, this is used as a metric for the comparable class.
		 */
		return this.distance - arg0.distance;
	}

}
