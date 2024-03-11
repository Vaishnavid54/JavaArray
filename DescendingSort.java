package com.arrayexercise;

public class DescendingSort {
	public static void main(String[] args) {
		
		int [] arr= new int [] {6,9,1,3,5,0};
		System.out.println("Original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		int temp=0;
		//sort
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array after sorting in descending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
