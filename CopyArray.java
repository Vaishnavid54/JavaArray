package com.arrayexercise;

public class CopyArray {
	
	public static void main(String[] args) {
		
		//declaring an array
		int[] arr1= new int []{1,2,3,4,5};
		//create another array arr2 with size of arr1
		int[] arr2=new int[arr1.length];
		//copying one array into another
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		//displaying arr1 array
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(); // next line
		//displaying arr2 array
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}	
		System.out.println(arr1==arr2);
		System.out.println(arr1.equals(arr2));
	}
}
