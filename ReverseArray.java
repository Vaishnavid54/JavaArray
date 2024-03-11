package com.arrayexercise;

public class ReverseArray {
	//program to print array after reverse(traversing array)
	public static void main(String[] args) {
		//declaring an array
		int[] arr= new int[] {1,2,3,4,5};
		System.out.println("original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("array after reverse");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
