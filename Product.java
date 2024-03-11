package com.arrayexercise;

public class Product {
	//product of all elements in an array
	public static void main(String[] args) {
		//declaring an array
		int[] arr= new int[] {1,5,6};
		//product
		int product=1;
		for(int i=0;i<arr.length;i++) {
			product*=arr[i];
		}
		System.out.println(product);
	}
}
