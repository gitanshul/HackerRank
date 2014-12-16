/**
--Problem Statement--

Isaac has to buy a new HackerPhone for his girlfriend Amy. He is exploring the shops in the town to compare the prices whereupon he finds a shop 
located on the first floor of a building, that has a unique pricing policy. There are N steps leading to the shop. A numbered ball is placed on 
each of the steps. The shopkeeper gives Isaac a fair coin and asks him to toss the coin before climbing each step. If the result of the toss is a 
'Heads', Isaac should pick up the ball, else leave it and proceed to the next step.

The shopkeeper then asks Isaac to find the sum of all the numbers he has picked up (let's say S). The price of the HackerPhone is then the expected 
value of S. Help Isaac find the price of the HackerPhone.

--Input Format-- 
The first line of the input contains an integer N, the number of steps. N lines follow, which are the numbers written on the ball on each step.

--Output Format-- 
A single line containing expected value.

Note : Expected value must be printed as a decimal number having exactly one digit after decimal. It is guaranteed that the correct answer will 
have at most one digit after decimal.

--Constraints-- 
1 <= N <= 40 
1 <= number on any ball <=10^9

Sample Input 1
3
1 
1
2
Output : 2.0

Sample Input 2
4
1 
2
2
2

Output : 3.5
 * */

package com.anshul.hr.algo.probability;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BirthdayGift {

	public static void main(String[] args) {
//		System.out.println("Starting");
		List<Long> origInput = new ArrayList<Long>();		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    String line;
	    int length = 0;
		try{
			if((line = bf.readLine())!=null){
				length = Integer.parseInt(line.trim());
			}else{
				System.out.println("Empty Input");
				return;
			}
			
			while((line = bf.readLine())!=null){				
				origInput.add(Long.parseLong(line.trim()));				
				if(length == 1)
					break;
				length--;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Double expectedVal = 0.0;
		for(long l : origInput){			
			expectedVal = expectedVal + Double.parseDouble(String.valueOf(l)) * 0.5d;
		}
		
		DecimalFormat df = new DecimalFormat("#");
        df.setMinimumFractionDigits(1);
        System.out.println(df.format(expectedVal));
		
	}
}
