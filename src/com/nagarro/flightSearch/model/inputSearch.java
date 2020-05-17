package com.nagarro.flightSearch.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class inputSearch {
	Scanner sc = new Scanner(System.in);
	public String dep_Loc() {
		try {
			String str = sc.next();
			if (str.length() == 3 && Pattern.matches("^[A-Za-z]+", str)) {
				return str;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("************Location Code not correct ********\n");
			System.out.println("Departure_Location =  ");
			return dep_Loc();
		}
	}

	public String arr_Loc() {
		try {

			String str = sc.next();
			if (str.length() == 3 && Pattern.matches("^[A-Za-z]+", str)) {
				return str;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("********Location Code not correct *********\n ");
			System.out.print("Arrival_Location =  ");
			return arr_Loc();
		}
	}

	public String flight_Date() {
		try {
			String str = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(str, formatter);
			return str;
		} catch (Exception e) {
			System.out.println("****************Format not Supported*******************");
			System.out.print("Flight_Date =  ");
			return flight_Date();
		}

	}

	public String flight_Class() {
		try {
			String str = sc.next();
			if (str.length() == 1 && str.equalsIgnoreCase("E") || str.equalsIgnoreCase("B")) {
				return str;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("*********This Class is not available in this Flight********");
			System.out.print("Flight_Class =  ");
			return flight_Class();
		}
	}

	public String out_pref() {
		try {
			String str = sc.next();
			if (str.equalsIgnoreCase("f") || str.equalsIgnoreCase("D")) {
				return str;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("*******************Wrong Input******************");
			System.out.println("Press - ");
			return flight_Class();
		}
	}

}
