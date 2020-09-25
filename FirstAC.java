package Compartment;
public class FirstAC implements ITrainUnit{
	int capacity = 20;
	public int getCapacity(){
		return capacity;
	}
	public void print(){
		System.out.println("This Train has an FirstAC Compartment");
		System.out.println("This Compartment has an capacity of 20 peoples per compartment");
	}
}