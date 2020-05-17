package com.nagarro.flightSearch.view;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import com.nagarro.flightSearch.model.flightPojo;

public class Flightresult {

	public Flightresult(LinkedList<flightPojo> result, String[] userInput) {
		
		if (userInput[4].equalsIgnoreCase("F")) {
			Collections.sort(result, new Sortbyfare());
		} else {
			Collections.sort(result, new Duration());
		}

		System.out.println("*******************************************************");
		System.out.println("       Available Flights");
		for (flightPojo flight : result) {
			char cl=userInput[3].toUpperCase().charAt(0);
			if(flight.getClas()==cl) {	
			String strDate = String.valueOf(flight.getValid_Till().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			System.out.println("*******************************************************");
				if(flight.getClas()=='B') {
				System.out.printf("Flight No - %-16s Class - %-6s \nDepatute Location-%-10s Arrival Location-%-10s "
						+ "\nFlight Time - %-14s Fare - %-10s \nFlight Duration - %-10s Seat Availablity - %-10s \n\n       Valid till Date  %-12s \n",
						flight.getFlight_No(), flight.getClas(), flight.getDep_Loc(), flight.getArr_Loc(),
						flight.getFlight_Time(), flight.getFare()*1.4, flight.getFlight_Dur(), flight.getSeat_Avalibality(),
						strDate);
				}
				else {
					System.out.printf("Flight No - %-16s Class - %-6s \nDepatute Location-%-10s Arrival Location-%-10s "
							+ "\nFlight Time - %-14s Fare - %-10s \nFlight Duration - %-10s Seat Availablity - %-10s \n\n       Valid till Date  %-12s \n",
							flight.getFlight_No(), flight.getClas(), flight.getDep_Loc(), flight.getArr_Loc(),
							flight.getFlight_Time(), flight.getFare(), flight.getFlight_Dur(), flight.getSeat_Avalibality(),
							strDate);
				}
			}
			else {
				System.out.println("Seat Not Available for this Class");
				break;
			}
		}
		System.out.println("*******************************************************");
	 }
}

class Sortbyfare implements Comparator<flightPojo> {
	@Override
	public int compare(flightPojo a, flightPojo b) {
		return (int) (a.getFare() - b.getFare());
	}
}

class Duration implements Comparator<flightPojo> {
	@Override
	public int compare(flightPojo o1, flightPojo o2) {
		if (o1.getFare() - o2.getFare() == 0) {
			return (int) (o1.getFlight_Dur() - o2.getFlight_Dur());
		} else {
			return (int) (o1.getFare() - o2.getFare());
		}
	}

}