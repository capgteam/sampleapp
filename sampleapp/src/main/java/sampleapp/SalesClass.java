package sampleapp;

public class SalesClass {
	
	public void display() {
		int[] arr= {23,45,56,78,6};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Array Size:" + arr.length);
		System.out.println("Summation:" + sum);
	}
	
	public void print() {
		System.out.println("Print All Array Number:");
		display();
	}

}
