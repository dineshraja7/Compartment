package Compartment;
public class Unreserved implements ITrainUnit{
	int capacity = 50;
	public int getCapacity(){
		return capacity;
	}
	public void print(){
		System.out.println("This Train has an Unreserved Compartment");
		System.out.println("This Compartment has an maximum capacityof 50 people");
	}
}