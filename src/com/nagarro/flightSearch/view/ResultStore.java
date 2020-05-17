package com.nagarro.flightSearch.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;
import com.nagarro.flightSearch.controler.FlightMain;
import com.nagarro.flightSearch.controler.rawResult;
import com.nagarro.flightSearch.model.flightPojo;

public class ResultStore {
	public static void sortedData(String[] userInput, LinkedList<flightPojo> csvData) { 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(userInput[2], formatter);
		LinkedList<flightPojo> result=rawResult.rawData(csvData,userInput,date);
		
		if (result.isEmpty()) {
			System.out.println("\n\n**********NO Flight Available**********");
		} else {
			Flightresult flightresult = new Flightresult(result, userInput);
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.print("\nDo you Want to search more flight(Yes/No)   ");
		String search=sc.next();
		
		if (search.equalsIgnoreCase("Yes")) {
			FlightMain m = new FlightMain();
			m.main(userInput);
		} else if (search.equalsIgnoreCase("no")) {
			System.out.println("Thank you");
		} else {
			System.out.println("Wrong input");
		}
		System.exit(0);
	}

}
