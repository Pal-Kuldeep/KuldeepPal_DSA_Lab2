package com.greatlearning.problemstatementlab2;

import java.util.Scanner;


public class Lab2_DataStructures {
	
	public static void main(String[] args) {
		int size;
		int [] arrayValues;
		int noOfTarget;
		int valueOfTarget;
		System.out.println("Enter the Size of Transaction Array: ");
		Scanner sc= new Scanner(System.in);
		size = sc.nextInt();
		arrayValues = new int[size];
		System.out.println("Enter the Values of Array: ");
		
		for(int i = 0; i< size; i++) 
		{
			arrayValues[i]= sc.nextInt();
			
		}
		
		System.out.println("Enter total number of targets to be achieved: ");
		noOfTarget = sc.nextInt();
		
		System.out.println("Enter Value of Target: ");
		valueOfTarget = sc.nextInt();
		
		isTargetAchieved(arrayValues, size, noOfTarget, valueOfTarget);
		sc.close();
		
		
	}

	/**
	 * @param arrayValues
	 * @param size
	 * @param noOfTarget
	 * @param valueOfTarget
	 */
	public static void isTargetAchieved( int [] arrayValues, int size, int noOfTarget, int valueOfTarget) 
	{
		int sum=0;
		
		int count=0;
		
		
		
		for(int i = 0; i < size ; i++) 
		{
//			System.out.println(arrayValues[i]);
			count++;
		
			sum= sum + arrayValues[i];
				
				if(sum>=valueOfTarget)
				{
					System.out.println("Target Achieved in "+ count);
					break;
					
				}
			}
				
		if(valueOfTarget>sum)
		{
			System.out.println("TARGET IS NOT ACHIEVED.");
		}
	}
}
	

