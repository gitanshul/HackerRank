package com.anshul.hr.algo.arraysort;

import java.util.Scanner;

public class InsertionSort2 {

	
	public static void insertionSortPart2(int[] ar){
		
		int unsortednum = ar[ar.length-1];
		
		for(int i=1; i < ar.length; i++){
			int[] newArr = new int[i+1];
			System.arraycopy(ar, 0, newArr, 0, i+1);
			newArr = insertIntoSorted(newArr);
			System.arraycopy(newArr, 0, ar, 0, i+1);
			printArray(ar);
		}
		
    }  
	
    public static int[] insertIntoSorted(int[] ar) {
        int unsortednum = ar[ar.length-1];
        for(int i=(ar.length-2) ; i >=0; i--){
        	if(ar[i] > unsortednum){
        		ar[i+1] = ar[i];
        		//printArray(ar);
	        	if(i==0){
	        		ar[i] = unsortednum;
	        		//printArray(ar);
	        	}	        	
        	}else{
        		ar[i+1] = unsortednum;
        		//printArray(ar);
        		break;
        	}
        }	        
        return ar;
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
         
         insertionSortPart2(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
      System.out.println("");
   }

}
