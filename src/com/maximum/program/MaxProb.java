package com.maximum.program;

import java.util.Arrays;
import java.util.Scanner;



public class MaxProb {
		public <E> void MaxInteg(E[] arr) {
			Arrays.sort(arr); 
			System.out.println(arr[arr.length-1]);   
		}
		public static void main(String[] args) {	
			MaxProb obj=new MaxProb();
			Integer [] intarr= {12,14,15,154,147,145};
			Double [] doublearr= {12.5,14.5,15.5,154.5,12.6};
			String[] str= {"Priyanka","Megha","Nikita","Ashvini","Ashu"};
			obj.MaxInteg(doublearr);
			obj.MaxInteg(intarr);
			obj.MaxInteg(str);
			
			
		}
			     
				
			}	 

