package com.arrayexercise;

public class RightRotation {
	public static void main(String[] args) {
		//initializing an array
		int[]arr= new int[] {1,2,3,4,5};
		System.out.println("original array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();//next line
		
	int n=3;//no of rotations
	
	//outer loop for rotations
	for(int i=0;i<n;i++) {
		 int last= arr[arr.length-1];
		 int j;
		for( j=arr.length-1;j>0;j--) {
			arr[j]=arr[j-1];
		}
		arr[0]=last;
	}
	//Displays resulting array after rotation    
    System.out.println("Array after right rotation: ");    
    for(int i = 0; i< arr.length; i++){    
        System.out.print(arr[i] + " ");    
    }  
  }
}
