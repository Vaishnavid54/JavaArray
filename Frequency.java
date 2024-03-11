package com.arrayexercise;

public class Frequency {
	//java program to find frequency of each element
	public static void main(String[] args) {
		
		int[] arr= new int[] {1,4,6,8,9,3,5,7,8,9,2,3,1};
		//array of frequency which stores frequencies of each element
		
		int[] frequency=new int[arr.length];
		int visited=-1;
		
		
		for(int i=0;i<arr.length;i++) {
			int count =1; 
		//why count=1 because if we have duplicate numbers 3 times in list
			//so we already count 1. if we find 2nd duplicate no. 
			//it will be 2 thats why we write count++. (1+1=2)
		
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
			     frequency[j]=visited; // to avoid counting of same element
				}
			}
			if(frequency[i]!=visited) {
				frequency[i]=count;
			}
		}//display frequency of of each element in list
		for(int i=0;i<arr.length;i++) {
			if(frequency[i]!=visited) {
				System.out.println(arr[i] + " = " + frequency[i]);
			}
		}
	}
}
