package com.nagarro.flightSearch.controler;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import com.nagarro.flightSearch.model.flightPojo;

public class rawResult {
	public static LinkedList<flightPojo> rawData(LinkedList<flightPojo> flightList, String[] userInput,LocalDate date) {
		
		userInput[2]=userInput[2].replace('-','/'); 
		Predicate<flightPojo> dl = f -> f.getDep_Loc().equalsIgnoreCase(userInput[0]);
		Predicate<flightPojo> al = f -> f.getArr_Loc().equalsIgnoreCase(userInput[1]);
		Predicate<flightPojo> dateFilter = f -> f.getValid_Till().compareTo(date) >= 0;
		Predicate<flightPojo> availFilter = f -> f.getSeat_Avalibality()=='Y';
		
			
		LinkedList<flightPojo> result = (LinkedList<flightPojo>) flightList.stream()
				.filter(dl.and(al).and(dateFilter).and(availFilter)).collect(Collectors.toCollection(LinkedList::new));		
		return result;
	}

}
