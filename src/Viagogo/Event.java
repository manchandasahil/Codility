package Viagogo;

import java.util.TreeSet;

public class Event implements Comparable<Event>{
	private int x;
	private int y;
	private int id;
	private int distance;
	
	TreeSet<Ticket> tickets = new TreeSet<Ticket>();
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
		return this.distance - arg0.distance;
	}

}
