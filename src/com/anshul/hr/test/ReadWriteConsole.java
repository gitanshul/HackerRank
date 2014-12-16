package com.anshul.hr.test;
import java.util.Scanner;


public class ReadWriteConsole {

	public static void main(String[] args) {

		System.out.println("Starting ");
		
		String seriesStr = "";
		String[] seriesArr;
		int length = 0;
		int[] array; 
				
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
	    try {
	    	length = in1.nextInt();
	    	array = new int[length];
	    	
	    	seriesStr = in2.nextLine();
	    	seriesArr = seriesStr.split(" ");
	    	
	    	for(int i =0;i<seriesArr.length;i++){
	    		array[i] = Integer.parseInt(seriesArr[i].trim());
	    	}
	    	
	    	System.out.println("Length : "+length);
		    System.out.println("Series : "+array.toString());
		    
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally{
			in1.close();
			in2.close();
		}
	    
	    
	    System.out.println("End ");
	}
}
