package Compartment;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
public class Train{
	int trainNo;
	String trainName;
	String startingLocation;
	String destination;
	String startingTime;
	String arrivalTime;
	ArrayList stationList = new ArrayList<Station>();
	LinkedList<ITrainUnit> compartmentList = new LinkedList<>();

	
	



public void initialize(int trNo,String trName,String strtngLoc,String arvlLoc,String strtTim, String arvlTim){
	this.trainNo = trNo;
	this.trainName = trName;
	this.startingLocation = strtngLoc;
	this.destination = arvlLoc;
	this.startingTime = strtTim;
	this.arrivalTime = arvlTim;
	
	}
	
	
	
	
public void print(){
	System.out.println("Train name:--->"+trainName);
	System.out.println("Train No:"+trainNo);
	System.out.println("Train Departure----->"+startingLocation);
	System.out.println("Train Destination---->"+destination);
	System.out.println("Time of departure--->"+startingTime);
	System.out.println("Time of Arrival at destination"+arrivalTime);
	
	
	
    
    
}




public void addStations(ArrayList stnList){
	stationList.addAll(stnList);
}

public void addCompartment(LinkedList cmpList){
	compartmentList.addAll(cmpList);
}




}
