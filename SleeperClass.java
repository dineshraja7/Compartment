package Compartment;
public class SleeperClass implements ITrainUnit{
	int capacity = 45;
	public int getCapacity(){
		return capacity;
	}
	public void print(){
		System.out.println("This Train has an SleeperClass Compartment");
		System.out.println("This Compartment gas an maximum capacity of 45 peoples");
	}
}