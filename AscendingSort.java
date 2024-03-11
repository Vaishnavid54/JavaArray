package com.arrayexercise;

public class AscendingSort {
	//java program to sort elements in an array in ascending order
	public static void main(String[] args) {
		//initializing an array
		int [] arr= new int[] {3,8,4,6,1};
		//original array
		System.out.println("Original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();//next line
		int temp;
		//sort
		for(int i=0;i<arr.length;i++) {  //i
			for(int j=i+1;j<arr.length;j++) { //j+1 means after i
				if(arr[i]>arr[j]) {  //if first is greater than second element
					temp=arr[i];     //put it in a temp
					arr[i]=arr[j];   //arr[i] become empty so put arr[j] in that
					arr[j]=temp;     //put temp in arr[j]
				}
			}
		}
		System.out.println("Array after sorting in acsending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
