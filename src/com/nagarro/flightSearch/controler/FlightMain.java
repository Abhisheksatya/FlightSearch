package com.nagarro.flightSearch.controler;
import java.util.LinkedList;
import java.util.Timer;
import com.nagarro.flightSearch.controler.Input;
import com.nagarro.flightSearch.model.fileReader;
import com.nagarro.flightSearch.model.flightPojo;
import com.nagarro.flightSearch.view.ResultStore;

public class FlightMain {
	public static void main(String[] args) {
		fileReader reader=new fileReader();
		Timer read=new Timer();							//Thread
		read.schedule(reader, 1, 5000);
		
		Input input=new Input();						//User Input
		String[] userInput=input.inputSearch();
		
		ResultStore sort=new ResultStore();				
		LinkedList<flightPojo> csvData=reader.dataList;//Read CSV files

		sort.sortedData(userInput,csvData);				//sort csv Data And print Flights
		
	}
	

}
