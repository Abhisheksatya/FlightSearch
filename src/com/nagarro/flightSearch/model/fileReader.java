package com.nagarro.flightSearch.model;

import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class fileReader extends TimerTask {
	public LinkedList<flightPojo> dataList = new LinkedList<>();
	public LinkedList<flightPojo> dataaa = new LinkedList<>();
	@Override
	public void run() {
		String location = "C:\\Users\\abhisheksharma09\\Downloads\\Assignment4\\Assignment Links\\Assignment Links";
		File address = new File(location);
		for (File fileAddress : address.listFiles()) {
				if (fileAddress.toString().contains(".csv")) {
					readcsv(fileAddress);
				}
		   	}
		}

	private void readcsv(File fileAddress) {
		Path filePath = Paths.get(fileAddress.toString());
		try (InputStream files = Files.newInputStream(filePath);
				BufferedReader reader = new BufferedReader(new InputStreamReader(files))) {
				String row = null;
				while ((row = reader.readLine()) != null) {
					flightPojo pojo=new flightPojo();
					String[] data = row.split("\\|");
					LocalDate id;
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					if (data[8].equalsIgnoreCase("CLASS")) {
					} else {
						id = LocalDate.parse(data[3], formatter);
						pojo.setFlight_No(data[0]);
						pojo.setDep_Loc(data[1]);
						pojo.setArr_Loc(data[2]);
						pojo.setValid_Till(id);
						pojo.setFlight_Time(Integer.parseInt(data[4]));
						pojo.setFlight_Dur(Float.parseFloat(data[5]));
						pojo.setFare(Float.parseFloat(data[6]));
						pojo.setSeat_Avalibality(data[7].charAt(data[7].length() - 1));
						pojo.setClas(data[8].charAt(data[8].length() - 1));
						dataList.add(pojo);
						checkduplicacy(pojo);
						
					}	
				}	
		} catch (IOException x) {
			System.err.println(x);
		}	
	}

	private void checkduplicacy(flightPojo pojo) {
		for(int i=0;i<dataList.size()-1;i++) {
			flightPojo old=dataList.get(i);
			if(old.flight_No.equalsIgnoreCase(pojo.getFlight_No())&&old.getDep_Loc().equalsIgnoreCase(pojo.getDep_Loc())
					&&old.getArr_Loc().equalsIgnoreCase(pojo.getArr_Loc())&&old.getValid_Till().equals(pojo.getValid_Till())
					&&old.getFlight_Time()==(pojo.getFlight_Time())&&old.flight_Dur==(pojo.getFlight_Dur())
					&&old.getFare()==(pojo.getFare())&&old.getClas()==pojo.getClas()) {
				dataList.remove(old);
				}
			
			else {
				
			}
			}
		
	}
}
