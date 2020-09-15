package Compartment;
import java.util.*;
import java.util.ArrayList;
public class Station{
	String stationCode;
	String stationName;
	boolean isStop;
	 HashSet<String> stationFacility = new HashSet<>();
	
	
	


public void initialize(String statcde, String stnname,boolean flg){
	this.stationCode = statcde;
	this.stationName = stnname;
	this.isStop = flg;

	
	}
	
	
public void addFacility(HashSet fclity){
	stationFacility.addAll(fclity);
}


	
public void print(){
	System.out.println("Your Station Code is --->"+stationCode);
	System.out.println("Your Station name is----->"+stationName);
	System.out.println("Your station has facility of ----->"+stationFacility);
}



	
}
	
	
	
	

