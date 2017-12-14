package Viagogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class World {
	
	ArrayList<Event> events = new ArrayList<Event>();
	static ArrayList<Event> temp = new ArrayList<Event>();
	ArrayList<Event> closestEvents = new ArrayList<Event>();
	/*
	 * The coordinates entered by the user are to be put 
	 * in these variables.
	 */
	private int x = 0;
	private int y = 0;
	private static final int MAX_EVENTS_RETURNED = 5;
	
	public static void main(String[] args) {
		World w1 = new World();
		System.out.println("Please input coordinates");
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		String[] input = in.split(",");
		w1.x = Integer.parseInt(input[0]);
		w1.y = Integer.parseInt(input[1]);
	    w1.loadDemoData();
	    w1.findEventandTickets();
	    }
	
	public void findEventandTickets() {
		/*This function finds the nearest events in the world
		 * and also return the tickets as required by the problem i.e.
		 * at the cheapest price.
		 */
		/*
		 * First i modify the distance instance variable for the list
		 * of events that we have.
		 */
		for(Event e:events) {
	    	e.setDistance(x, y);
	    }
		/*
		 * The list is sorted and since the comparator has the 
		 * distance metric, it is sorted by distance.
		 */
	    Collections.sort(events);
	    int max_events = MAX_EVENTS_RETURNED;
	    for(int i = 0;i<max_events && i<events.size();i++) {
	    	
	    	Event c = events.get(i);
	    	if(c.getCheapestTicket()<0) {
	    		max_events++;
	    		continue;
	    	}
	    	System.out.println(c + "- $" + c.getCheapestTicket() +", Distance "+ c.getDistance());
	    }
	}
	
	public void loadDemoData() {
		/*
		 * for demo purposes i have loaded my code with data to work with.
		 * This data can be fed from the user as well if needed.
		 */
		Event e1 = new Event(0,0,001);
		e1.addTicket(100);
		e1.addTicket(200);
		e1.addTicket(300);
		Event e2 = new Event(-2,-3,002);
		e2.addTicket(100);
		e2.addTicket(200);
		e2.addTicket(300);
		Event e3 = new Event(-1,-3,003);
		e3.addTicket(2000);
		e3.addTicket(300);
		Event e4 = new Event(-4,-9,004);
		e4.addTicket(100000);
		e4.addTicket(3263.67);
		e4.addTicket(30000);
		Event e5 = new Event(-2,-2,005);
		e5.addTicket(100);
		e5.addTicket(200);
		e5.addTicket(300);
		Event e6 = new Event(0,0,006);
		e6.addTicket(100);
		e6.addTicket(200);
		e6.addTicket(300);
		events.add(e1);
		events.add(e2);
		events.add(e3);
		events.add(e4);
		events.add(e5);
		events.add(e6);
	}

}
