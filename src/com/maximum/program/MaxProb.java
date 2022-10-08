package com.maximum.program;

import java.util.Scanner;

public class MaxProb {
	public void MaxInteg() {
		// Create the Array For comparing
		Scanner sc =new Scanner(System.in);
		String[] arr=new String[3];
		//  Fill The Array
		for (int i=0; i < arr.length;i++) {
			System.out.println("Enter The String");
			arr[i]=sc.next();
		}
		// compare the String Array
		int num = arr[0].compareTo(arr[1]);
		if (num < 0) {
			num = arr[1].compareTo(arr[2]);
			if (num <= 0) {
				System.out.println("The Largest Word is  "+ arr[2] ); 
			}
			else  {
				System.out.println("The Largest Word is  "+ arr[1] );	
			}
		}  
		else {
			num=(arr[0].compareTo(arr[2]));
			if (num <= 0) {				
				System.out.println("The Largest Word is  "+ arr[2] ); 
			}
			else {
				System.out.println("The Largest Word is  "+ arr[0] );
			}
		}
		sc.close();
	}
	public static void main(String[] args) {

		MaxProb obj=new MaxProb();
		obj.MaxInteg();
	}	 
}

