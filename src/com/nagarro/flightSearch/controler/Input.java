package com.nagarro.flightSearch.controler;
import com.nagarro.flightSearch.view.userInput;

public class Input {
	public String[] inputSearch(){
		userInput userinput=new userInput();
		return userinput.user_Input();
	}

}
