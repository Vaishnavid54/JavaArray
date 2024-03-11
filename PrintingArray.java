package com.arrayexercise;

public class PrintingArray {
	public static void main(String[] args) {
		
		//ways to declare an array
		int[] arr= new int [] {1,2,3,4,5,};
		
		int arr1[]= {10,20,30,40,50};
		System.out.println("for-loop is used to print an array");
		for(int i=0;i<arr.length;i++) {
			//System.out.print(arr); this statement prints hash code
		    System.out.println(arr[i]);
		}
		System.out.println("forEach loop is used to print an array");
		for(int i:arr1) { 
		//if we write i<=arr1.length --arrayIndexOutOfBoundException is thrown
			System.out.println(i);
			
			//prints i only
		}
	}
}
