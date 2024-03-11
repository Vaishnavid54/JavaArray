package com.arrayexercise;

public class ReturnArrayFromMethod {
	
	//create function which return type is array
	
	public static int[] get() {
		
		return new int [] {1,2,3,4,5};
	}
	public static void main(String[] args) {
		
		//call method
		int[] arr=get();
		//print array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
