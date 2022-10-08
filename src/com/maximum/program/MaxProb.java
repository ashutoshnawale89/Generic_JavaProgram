package com.maximum.program;

import java.util.Scanner;

public class MaxProb {
	public void MaxInteg() {
		// Create the Array For comparing
		Scanner sc =new Scanner(System.in);
		int[] arr=new int[3];
		for (int i=0; arr.length > i; i++) {
			System.out.println("Enter the array value ");
			arr[i] = sc.nextInt();
		}
//    Find The Maximum Program
		int max=arr[0];
		for (int i=0; i < arr.length; i++) {
			if (arr[i]> max) {
				max=arr[i];
			}	       
		}
		System.out.println("The Largest Number is  "+max); 
		sc.close();
	}
	public static void main(String[] args) {	
		MaxProb obj=new MaxProb();
		obj.MaxInteg();
	}	 
}

