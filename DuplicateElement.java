package com.arrayexercise;

public class DuplicateElement {
	//java program to print duplicate elements in an array
	public static void main(String[] args) {
		//declaring an array
		int[] arr=new int[] {2,5,4,3,4,1,9,5,7,4,6,5};
		System.out.println("print original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("print duplicate elements in an array");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
	//j starts with i+1 it means take element after i th index
				if(arr[i]==arr[j]) { //then compare both elements 
					System.out.println(arr[j]); //print which is same as i
				}
			}
		}
	}
}
