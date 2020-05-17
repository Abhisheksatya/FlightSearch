package com.nagarro.flightSearch.model;

import java.time.LocalDate;

public class flightPojo {
	String flight_No;
	String dep_Loc;
	String arr_Loc;
	LocalDate valid_Till;
	int flight_Time;
	float flight_Dur;
	float fare;
	char seat_Avalibality;
	char clas;
	@Override
	public String toString() {
		return "flightPojo [flight_No=" + flight_No + ", dep_Loc=" + dep_Loc + ", arr_Loc=" + arr_Loc + ", valid_Till="
				+ valid_Till + ", flight_Time=" + flight_Time + ", flight_Dur=" + flight_Dur + ", fare=" + fare
				+ ", seat_Avalibality=" + seat_Avalibality + ", clas=" + clas + "]";
	}
	public String getFlight_No() {
		return flight_No;
	}
	public void setFlight_No(String flight_No) {
		this.flight_No = flight_No;
	}
	public String getDep_Loc() {
		return dep_Loc;
	}
	public void setDep_Loc(String dep_Loc) {
		this.dep_Loc = dep_Loc;
	}
	public String getArr_Loc() {
		return arr_Loc;
	}
	public void setArr_Loc(String arr_Loc) {
		this.arr_Loc = arr_Loc;
	}
	public LocalDate getValid_Till() {
		return valid_Till;
	}
	public void setValid_Till(LocalDate valid_Till) {
		this.valid_Till = valid_Till;
	}
	public int getFlight_Time() {
		return flight_Time;
	}
	public void setFlight_Time(int flight_Time) {
		this.flight_Time = flight_Time;
	}
	public float getFlight_Dur() {
		return flight_Dur;
	}
	public void setFlight_Dur(float flight_Dur) {
		this.flight_Dur = flight_Dur;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	public char getSeat_Avalibality() {
		return seat_Avalibality;
	}
	public void setSeat_Avalibality(char seat_Avalibality) {
		this.seat_Avalibality = seat_Avalibality;
	}
	public char getClas() {
		return clas;
	}
	public void setClas(char clas) {
		this.clas = clas;
	}
}
