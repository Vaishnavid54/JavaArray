package com.arrayexercise;

public class AnonymousArray {
	//An array without name is anonymous array
	//it is used for just creating and using instantly.
	public static void sum(int []num) {
		int total=0;
		//for each loop
		for(int i:num) {  //i is index here
			total+=i;
		}
		System.out.println(total);
	}
    public static void main(String[] args) {
    	sum(new int [] {10,20,30});
	}
    //here we used array for addition purpose.
}
