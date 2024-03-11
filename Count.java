package com.arrayexercise;

public class Count {
	//count of total elements of an array
	public static void main(String[] args) {
		int[] arr= new int[] {3,4,9};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		System.out.println(count);
	}
}
