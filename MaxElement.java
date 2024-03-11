package com.arrayexercise;

public class MaxElement {
	//java program to find maximum element in an array
	public static void main(String[] args) {
		int[] arr= new int [] {1,8,9,0,9,4,7,3};
		System.out.println("original array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		//maximum element
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("maximum element is " + max);
	}
}
