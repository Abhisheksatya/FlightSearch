package com.nagarro.flightSearch.view;
import com.nagarro.flightSearch.model.inputSearch;

public class userInput {
	public String[] user_Input() {
		inputSearch input_Search = new inputSearch();
		String[] input = new String[5];
		System.out.print("Departure_Location =  ");
		input[0] = input_Search.dep_Loc();
		System.out.print("Arrival_Location =  ");
		input[1] = input_Search.arr_Loc();
		System.out.print("Flight_Date =  ");
		input[2] = input_Search.flight_Date();
		System.out.print("Flight_Class =  ");
		input[3] = input_Search.flight_Class();
		System.out.println("Output_Preference");
		System.out.println("For Flights sort by fare PRESS F");
		System.out.println("For Flights sort by fare and Flight Duraton PRESS D");
		System.out.print("Press - ");
		input[4] = input_Search.out_pref();
		return input;
	}
}