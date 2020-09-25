package Compartment;
public class Pantry implements ITrainUnit{
	int capacity = 2;
	public int getCapacity(){
		return capacity;
	}
	public void print(){
		System.out.println("This Train has an pantry compartment");
		System.out.println("This Pantry has an maximum capacityof 2 peoples");
	}
}