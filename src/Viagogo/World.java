package Viagogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class World {
	ArrayList<Event> events = new ArrayList<Event>();
	static ArrayList<Event> temp = new ArrayList<Event>();
	ArrayList<Event> closestEvents = new ArrayList<Event>();
	int x = 0;
	int y = 0;
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
	public void loadDemoData() {
		Event e1 = new Event(10,10,001);
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
		e4.addTicket(1);
		e4.addTicket(3263.67);
		e4.addTicket(3000);
		Event e5 = new Event(-2,-2,005);
		e5.addTicket(100);
		e5.addTicket(200);
		e5.addTicket(300);
		Event e6 = new Event(0,0,006);
		e6.addTicket(500);
		e6.addTicket(600);
		e6.addTicket(300);
		events.add(e1);
		events.add(e2);
		events.add(e3);
		events.add(e4);
		events.add(e5);
		events.add(e6);
	}
	public void findEventandTickets() {
		for(Event e:events) {
	    	e.setDistance(x, y);
	    }
	    Collections.sort(events);
	    for(int i = 0;i<5 && i<events.size();i++) {
	    	
	    	Event c = events.get(i);
	    	System.out.println(c + "- $" + c.getCheapestTicket() +", Distance "+ c.getDistance());
	    }
	}

}
