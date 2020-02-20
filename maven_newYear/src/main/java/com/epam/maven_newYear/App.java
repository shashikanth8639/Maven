package com.epam.maven_newYear;

import java.io.*;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class App implements NewYear
{	static Map<String,Integer> nameToWeight=new HashMap();
	static Map<String,Integer> nameToPrice=new HashMap();
	
	static Scanner sc=new Scanner(System.in);
    public void inputChocolates( )
    { 
    	
        System.out.println("enter the number of chocolates in gifts:\n");
        int numberofchocolates=sc.nextInt();
        for(int chocoCount=1;chocoCount<=numberofchocolates;chocoCount++) {
        	System.out.println("Enter the chocolate type(Enter the number):\n1)Candy\n2)Wafer");
        	int chocolateType=sc.nextInt();
        	System.out.println("Enter the weight of the chocolate");
        	int chocolateWeight=sc.nextInt();
        	System.out.println("Enter the Price of chocolates");
        	int chocolatePrice=sc.nextInt();
        	if(chocolateType==1) {
        		System.out.println("Enter the name of the candy");
        		String candyName=sc.next();
        		if((nameToWeight).containsKey(candyName)) {
        			nameToWeight.put(candyName,(int)nameToWeight.get(candyName)+chocolateWeight);
        		}
        		else
        			nameToWeight.put(candyName,chocolateWeight);
        		if((nameToPrice).containsKey(candyName)) {
        			nameToPrice.put(candyName,(int)nameToWeight.get(candyName)+chocolatePrice);
        		}
        		else
        			nameToPrice.put(candyName,chocolatePrice);
        		
        	}
        	
        }
       
        
    }
    
    public void calcRange(int sortType) {
    	int lowerLimit,higherLimit;
    	
		
    	if(sortType==1) {
    		System.out.println("Enter the lowerlimt of the weight");
    		lowerLimit=sc.nextInt();
    		System.out.println("Enter the higherlimt of the weight");
    		higherLimit=sc.nextInt();
    		Set<Map.Entry<String,Integer>> candySet=nameToWeight.entrySet();
    		Iterator<Map.Entry<String,Integer>> candyIterator=candySet.iterator();
    		while(candyIterator.hasNext()) {
    			Map.Entry candyElement=(Map.Entry)candyIterator.next();
    			int currentWeight=(Integer) candyElement.getValue();
    			if(currentWeight>=lowerLimit && currentWeight<=higherLimit) {
    				System.out.println(candyElement.getKey());
    			}
    		}
    	}
    	else {
    		System.out.println("Enter the lowerlimt of the price");
    		lowerLimit=sc.nextInt();
    		System.out.println("Enter the higherlimt of the price");
    	
    		higherLimit=sc.nextInt();
    		Set<Map.Entry<String,Integer>> candySet=nameToPrice.entrySet();
    		Iterator<Map.Entry<String,Integer>> candyIterator=candySet.iterator();
    		while(candyIterator.hasNext()) {
    			Map.Entry candyElement=(Map.Entry)candyIterator.next();
    			int currentPrice=(Integer) candyElement.getValue();
    			if(currentPrice>=lowerLimit && currentPrice<=higherLimit) {
    				System.out.println(candyElement.getKey());
    			}
    		}
    	}
    }

	
}
