package com.arrayexercise;

public class CloningArray {
	public static void main(String args[]){  
		int arr[]={2,3,4,5};  
		System.out.println("Printing original array:");  
		for(int i:arr)  
		System.out.println(i);  
		  
		System.out.println("Printing clone of the array:");  
		int carr[]=arr.clone();  
		for(int i:carr)  
		System.out.println(i);  
		  
		System.out.println("Are both equal?");  
		System.out.println(arr==carr);  
		System.out.println(arr.equals(carr));
		  
		}
	}  
