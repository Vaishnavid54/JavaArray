package com.arrayexercise;

public class MimElement {
	//java program to find minimum element of an array
	public static void main(String[] args) {
		//declaring an array
		int [] arr= new int [] {5,6,8};
		
		System.out.println("original array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int min=arr[0];
		//minimum element
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Minimum Element " + min);
	}
}
