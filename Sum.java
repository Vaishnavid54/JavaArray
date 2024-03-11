package com.arrayexercise;

public class Sum {
	//sum of all elements in an array
	public static void main(String[] args) {
		//declaring an array
		int[]arr=new int[] {5,9,3,7,6,1};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of all elements in an array");
		System.out.println(sum);
	}
}
