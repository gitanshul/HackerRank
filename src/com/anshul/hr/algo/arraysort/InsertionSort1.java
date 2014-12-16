package com.anshul.hr.algo.arraysort;

import java.util.Scanner;

public class InsertionSort1 {

	    public static void insertIntoSorted(int[] ar) {
	        int unsortednum = ar[ar.length-1];
	        for(int i=(ar.length-2) ; i >=0; i--){
	        	if(ar[i] > unsortednum){
	        		ar[i+1] = ar[i];
	        		printArray(ar);
		        	if(i==0){
		        		ar[i] = unsortednum;
		        		printArray(ar);
		        	}	        	
	        	}else{
	        		ar[i+1] = unsortednum;
	        		printArray(ar);
	        		break;
	        	}
	        }	        
	    }
	    
	    
	    /* Tail starts here */
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         
	         insertIntoSorted(ar);
	    }
	    
	    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	      System.out.println("");
	   }
	    

}
