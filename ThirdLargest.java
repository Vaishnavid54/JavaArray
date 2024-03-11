package com.arrayexercise;

public class ThirdLargest {
	
	public static int getThirdLargest(int[]arr, int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];  //swapping
					arr[j]=temp;
				}
			}
		}
		return arr[total-3];
	}
	public static void main(String[] args) {
		int []arr1= new int[] {3,9,2,1,7,4,5};
		int []arr2= new int[] {32,90,11,71,42};
		System.out.println(getThirdLargest(arr1,7));
		System.out.println(getThirdLargest(arr2,5));
	}
}
