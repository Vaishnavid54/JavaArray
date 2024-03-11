package com.arrayexercise;

public class LeftRotation {
	//each element of the array will be shifted to its left 
	//by one position and the first element of the array 
	//will be added to end of the list

	public static void main(String[] args) {
		//initialize array
		int[]arr= new int[] {1,2,3,4,5};
		//n determines number of time the array should be rotated
		int n=3; // if n=3 then output is 4 5 1 2 3
		System.out.println("original array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();//next line
		
		//rotate given array n times towards left
		 for(int i=0;i<n;i++){
			//stores first element of an array
			int first=arr[0];
			int j;
			for( j=0;j<arr.length-1;j++) {//shift to right means rotate to left
				arr[j]=arr[j+1];  //1 becomes 2 in list
			}
			//arr[j] become empty so put first in that
			arr[j]=first; //2 becomes first element in list
		}
		//Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
	}
}
