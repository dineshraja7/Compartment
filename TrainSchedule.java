package Compartment;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
public class TrainSchedule{
	public static void main(String[] args){
		ArrayList trainList = new ArrayList<Train>();
		 ArrayList stationList = new ArrayList<Station>();
		 HashSet<String> stationFacility = new HashSet<>();
		 LinkedList<ITrainUnit>compartmentList = new LinkedList<>();
		 
		 TrainSchedule trainSchedule= new TrainSchedule();
		trainSchedule.createTrain(trainList,stationList,stationFacility,compartmentList);
		 
		 //System.out.println("Hello World");
		 //System.out.println("I have made a change here chitapa");
		 System.out.println("Please enter your Destination-------->");
		Scanner destinationPoint = new Scanner(System.in);
		String dest = destinationPoint.next();
		
		
		
		System.out.println("Please enter  the facility of a station----->");
		Scanner trainStops = new Scanner(System.in);
		String cde = trainStops.nextLine();	
		
			
		for(int i=0;i<trainList.size();i++){
			Train currentTrain = (Train)trainList.get(i);
			boolean facilityExists = false;
			if(currentTrain.destination.equals(dest)){
				
				
				
				
	        for( int j=0;j<currentTrain.stationList.size();j++){
				Station currentStation = (Station)currentTrain.stationList.get(j);
				
				
				
				
					 if(currentStation.stationFacility.contains(cde)){
						  facilityExists = true;
					 System.out.println("The station that has "+cde+" facility is as follows......");
					 currentStation.print();
                                         System.out.println("The following train goes through this station......");
					 currentTrain.print();
					    }

				}
				
			    if(!facilityExists){
					System.out.println("Error Please Enter the Destination and Facility correctly!!!!");
				}
				
			}
			
			
		
		}	
		 
		
	}	

		
				
				
	
	 public void createTrain(ArrayList trainList,ArrayList stationList,  HashSet stationFacility ,LinkedList compartmentList){
			 Train mumbaiExpress = new Train();
			mumbaiExpress.initialize(123,"Mumbai Express","Chennai","Mumbai","06:00 AM","10:AM");
			
			Engine mumbai = new Engine();
		    compartmentList.add(mumbai);
			mumbaiExpress.addCompartment(compartmentList);
			System.out.println("This Train Has an Engine");
			compartmentList.clear();
			
			
			FirstAC comp1 = new FirstAC();
			comp1.capacity = 30;
			compartmentList.add(comp1);
			mumbaiExpress.addCompartment(compartmentList);
			System.out.println("This train has FirstAC Compartment");
			compartmentList.clear();
			
			SleeperClass comp2 = new SleeperClass();
			comp2.capacity = 35;
			compartmentList.add(comp2);
			mumbaiExpress.addCompartment(compartmentList);
			System.out.println("This Train has SleeperClass Compartment");
			compartmentList.clear();
			
			SleeperClass comp3 = new SleeperClass();
            comp3.capacity = 30;
			compartmentList.add(comp3);
			mumbaiExpress.addCompartment(compartmentList);
			System.out.println("This Train has another SleeperClass Compartment");
			compartmentList.clear();
			
			SleeperClass comp4 = new SleeperClass();
			comp4.capacity = 25;
			compartmentList.add(comp4);
			mumbaiExpress.addCompartment(compartmentList);
			System.out.println("This Train has 3rd SleeperClass Compartment");
			compartmentList.clear();
			
			Pantry comp5 = new Pantry();
			comp5.capacity = 2;
			compartmentList.add(comp5);
			mumbaiExpress.addCompartment(compartmentList);
			System.out.println("This Train has a Pantry Compartment");
			compartmentList.clear();
			
			Unreserved comp6 = new Unreserved();
			comp5.capacity = 50;
			compartmentList.add(comp6);
			mumbaiExpress.addCompartment(compartmentList);
			System.out.println("This Train has an Unreserved Compartment");
			compartmentList.clear();
			
			Unreserved comp7 = new Unreserved();
			comp6.capacity = 50;
			compartmentList.add(comp7);
			mumbaiExpress.addCompartment(compartmentList);
			System.out.println("This Train has an another Unreserved Compartment");
			compartmentList.clear();
			
			
			Station chennai = new Station();
			stationFacility.add("ATM");
			stationFacility.add("Kids Playing Area");
			chennai.initialize("MAA","Chennai",true);
			chennai.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(chennai);
			
	
		
			Station vijayawada = new Station();
			stationFacility.add("Electronic Ticket counter");
			stationFacility.add("Restrooms");
			vijayawada.initialize("VJD","Vijayawada",false);
			vijayawada.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(vijayawada);
	
	
			Station pune = new Station();
			stationFacility.add("Free Wifi Unlimited");
			stationFacility.add("Mobile charging Stations");
			pune.initialize("PUN","Pune",true);
			pune.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(pune);
	
	
			Station wadi = new Station();
			stationFacility.add("Free Cloak Room");
			stationFacility.add("Secured Baggage counters");
			wadi.initialize("WDI","Wadi",true);
			wadi.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(wadi);
		
		
			Station solapur = new Station();
			stationFacility.add("AI based ticket counter");
			stationFacility.add("Queueless PNR checking machine");
			solapur.initialize("SPR","Solapur",true);
			solapur.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(solapur);
			
			mumbaiExpress.addStations(stationList);
			trainList.add(mumbaiExpress);
			stationList.clear();
			
			
			Train maduraiExpress = new Train();
			maduraiExpress.initialize(456,"Madurai Express","Kovilpatti","Madurai","07:00 AM","10:29 AM");
			
			Engine maduraii = new Engine();
			maduraii.capacity = 2;
			compartmentList.add(maduraii);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train has an Engine");
			compartmentList.clear();
			
			
			FirstAC mducomp1 = new FirstAC();
			mducomp1.capacity = 25;
			compartmentList.add(mducomp1);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train has an FirstAC Compartment");
			compartmentList.clear();
			
			FirstAC mducomp2 = new FirstAC();
			mducomp2.capacity = 30;
			compartmentList.add(mducomp2);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train has an another FirstAC Compartment");
			compartmentList.clear();
			
			FirstAC mducomp3 = new FirstAC();
			mducomp3.capacity = 35;
			compartmentList.add(mducomp3);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train has 3rd FirstAC Compartment");
			compartmentList.clear();
			
			Pantry mducomp4 = new Pantry();
			mducomp4.capacity = 2;
			compartmentList.add(mducomp4);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train Has a Pantry Compartment");
			compartmentList.clear();
			
			Unreserved mducomp5 = new Unreserved();
			mducomp5.capacity = 50;
			compartmentList.add(mducomp5);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train has an Unreserved Compartment");
			compartmentList.clear();
			
			Unreserved mducomp6 = new Unreserved();
			mducomp6.capacity = 50;
			compartmentList.add(mducomp6);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train has an another Unreserved Compartment");
			compartmentList.clear();
			
			SleeperClass mducomp7 = new SleeperClass();
			mducomp7.capacity = 30;
			compartmentList.add(mducomp7);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train has an SleeperClass Compartment");
			compartmentList.clear();
			
			SleeperClass mducomp8 = new SleeperClass();
			mducomp8.capacity = 35;
			compartmentList.add(mducomp8);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train has an another SleeperClass Compartment");
			compartmentList.clear();
			
			SleeperClass mducomp9 = new SleeperClass();
			mducomp9.capacity = 33;
			compartmentList.add(mducomp9);
			maduraiExpress.addCompartment(compartmentList);
			System.out.println("This Train has 3rd SleeperClass Compartment");
			compartmentList.clear();
			
			
			Station madurai = new Station();
			stationFacility.add("Automated ticket machines");
			madurai.initialize("IXM","Madurai",false);
			madurai.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(madurai);
		
		
			Station sattur = new Station();
			stationFacility.add("Convenience Stores");
			sattur.initialize("STR","Sattur",true);
			sattur.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(sattur);
		
		
		
			Station thiruparangundram = new Station();
			stationFacility.add("Lost and Found centres");
			thiruparangundram.initialize("TPR","Thiruparangundram",false);
			thiruparangundram.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(thiruparangundram);
			
			maduraiExpress.addStations(stationList);
			trainList.add(maduraiExpress);
			stationList.clear();

			
			Train nagercoilExpress = new Train();
			nagercoilExpress.initialize(678,"Nagercoil Express","Virudhunagar","Nagercoil","08:00 AM","12:00 PM");
			
			Engine nagercoil = new Engine();
			nagercoil.capacity = 2;
			compartmentList.add(nagercoil);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has an Engine");
			compartmentList.clear();
			
			FirstAC ngcomp1 = new FirstAC();
			ngcomp1.capacity = 33;
			compartmentList.add(ngcomp1);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has a FirstAC Compartment");
			compartmentList.clear();
			
			FirstAC ngcomp2 = new FirstAC();
			ngcomp2.capacity = 24;
			compartmentList.add(ngcomp2);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has another FirstAC Compartment");
			compartmentList.clear();
			
			FirstAC ngcomp3 = new FirstAC();
			ngcomp3.capacity = 22;
			compartmentList.add(ngcomp3);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has 3rd FirstAC Compartment");
			compartmentList.clear();
			
			Pantry ngcomp4 = new Pantry();
			ngcomp4.capacity = 2;
			compartmentList.add(ngcomp4);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has an Pantry Compartment");
			compartmentList.clear();
			
			Pantry ngcomp5 = new Pantry();
			ngcomp5.capacity = 2;
			compartmentList.add(ngcomp5);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has an another Pantry");
			compartmentList.clear();
			
			Unreserved ngcomp6 = new Unreserved();
			ngcomp6.capacity = 50;
			compartmentList.add(ngcomp6);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has an Unreserved Compartment");
			compartmentList.clear();
			
			
			Unreserved ngcomp7 = new Unreserved();
			ngcomp7.capacity = 50;
			compartmentList.add(ngcomp7);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has an another Unreserved Compartment");
			compartmentList.clear();
			
			Unreserved ngcomp8 = new Unreserved();
			ngcomp8.capacity = 50;
			compartmentList.add(ngcomp8);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has 3rd Unreserved Compartment");
			compartmentList.clear();
			
			SleeperClass ngcomp9 = new SleeperClass();
			ngcomp9.capacity = 25;
			compartmentList.add(ngcomp9);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has an SleeperClass Compartment");
			compartmentList.clear();
			
			SleeperClass ngcomp10 = new SleeperClass();
			ngcomp10.capacity = 27;
			compartmentList.add(ngcomp10);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has an another SleeperClass Compartment");
			compartmentList.clear();
			
			SleeperClass ngcomp11 = new SleeperClass();
			ngcomp11.capacity = 22;
			compartmentList.add(ngcomp11);
			nagercoilExpress.addCompartment(compartmentList);
			System.out.println("This Train has 3rf SleeperClass Compartment");
			compartmentList.clear();
			
			Station virudhunagar = new Station();
			stationFacility.add("Arrival and Departure Boards Digitalized");
			virudhunagar.initialize("VNR","Virudhunagar",false);
			virudhunagar.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(virudhunagar);
		
		
			Station kovilpatti = new Station();
			stationFacility.add("Waiting rooms");
			kovilpatti.initialize("CVP","Kovilpatti",true);
			kovilpatti.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(kovilpatti);
		
		
			Station kayathar = new Station();
			stationFacility.add("Taxi Ranks");
			kayathar.initialize("KPY","Kayathar",false);
			kayathar.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(kayathar);
		
		
			Station aralvaiMozhi = new Station();
			stationFacility.add("Car Parking Paid ");
			aralvaiMozhi.initialize("AVL","AralvaiMozhi",false);
			aralvaiMozhi.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(aralvaiMozhi);
			
			
			nagercoilExpress.addStations(stationList);
			trainList.add(nagercoilExpress);
			stationList.clear();
      
		
			Train vaigaiExpress = new Train();
			vaigaiExpress.initialize(246,"Vaigai Express","Madurai","Trichy","09:00 AM","1:00 AM");
			Station kallupatti = new Station();
			stationFacility.add("Passenger Lounge");
			kallupatti.initialize("KPI","Kallupatti",true);
			kallupatti.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(kallupatti);
		
		
			Station malamadai = new Station();
			stationFacility.add("Left luggage finding Squads");
			malamadai.initialize("MDI","Malamadai",false);
			malamadai.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(malamadai);
		
		
			Station tiruchirapalli = new Station();
			stationFacility.add("Tourist guide from Railway Department");
			tiruchirapalli.initialize("TCY","Tiruchirapalli",false);
			tiruchirapalli.addFacility(stationFacility);
			stationFacility.clear();
			stationList.add(tiruchirapalli);
			
			vaigaiExpress.addStations(stationList);
			trainList.add(vaigaiExpress);
			stationList.clear();
			
			
			
		
		}
	}
	
	    




				
				

	
	
	



	
		
			
		
			


		
		
	
			
		
		
	

		
		
