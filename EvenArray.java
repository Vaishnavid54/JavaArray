package com.arrayexercise;

public class EvenArray {
	//java program to print even elements in an array
	public static void main(String[] args) {
		//declaring an array
		int[]arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println("original array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(); //next line
		System.out.println("even elements in an array");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("odd elements in an array");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}
}
