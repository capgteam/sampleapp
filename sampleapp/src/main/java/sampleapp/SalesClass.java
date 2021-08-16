package sampleapp;

public class SalesClass {
	
	public void display() {
		int[] arr= {23,45,56,78,6};
		for(int num:arr)
			System.out.println(num);
	}
	
	public void print() {
		System.out.println("Print All Array Number:");
		display();
	}

}
