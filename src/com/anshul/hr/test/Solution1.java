package com.anshul.hr.test;
import java.io.*;

public class Solution1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int length = 0;
        String s;
        String str = "";
        
        BufferedReader in1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));

        while ((s = in1.readLine()) != null && s.length() != 0)
            length = Integer.parseInt(s);
        
        int[] array = new int[length];
        int[] diff = new int[length-1];
        
        int counter = 0;
        
        while ((s = in2.readLine()) != null && s.length() != 0)
            str = s;
        
        String[] strArr = str.split(" ");
        
        for(String st : strArr){
        	array[counter++] = Integer.parseInt(st);
        }
               
        counter = 0;
        for(int i =0; i < array.length-1 ; i++){
        	diff[counter++] = array[i+1] - array[i]; 
        }
        
        for(int i =1; i < diff.length-2 ; i++){
        	int x = diff[i]-diff[i-1] ;
        	int y = diff[i+1] - diff[i];
        	int z = diff[i+2] - diff[i+1];
        	
        	if (x==y) continue;
        }
    }
}