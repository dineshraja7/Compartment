package Compartment;
public class Engine implements ITrainUnit{
	int capacity = 2;
	public int getCapacity(){
		return capacity;
	}
	public void print(){
		System.out.println("Your Train has An Engine Compartment");
		System.out.println("This Engine has a capacity of 2 peoples per compartment");
	}
}