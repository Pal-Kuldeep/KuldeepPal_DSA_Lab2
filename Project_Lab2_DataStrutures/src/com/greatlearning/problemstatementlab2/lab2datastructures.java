package com.greatlearning.problemstatementlab2;

import java.util.Scanner;

public class lab2datastructures {
		
	
	public static void main(String[] args) {
		int amount;
		int size;
		int[] currdeno;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Size of Curreny Denominations: ");
		size=sc.nextInt();
		
		System.out.println("Enter the Currency Denomination Values: ");
		
		currdeno = new int[size];
		
		for(int i=0; i<size; i++) //Taking Currency denominations from the user 
		{
			currdeno[i] = sc.nextInt();
		}
		sortingValues(currdeno,size);
		
		System.out.println("Enter the Amount you want to Pay: ");
		amount=sc.nextInt();
		
		
		System.out.println("Your payment approach in order to give min no of notes will be ");
		calculatingCurrencydenominations(currdeno, size, amount);
		
		
		
		
		
	}

	public static void calculatingCurrencydenominations(int[] currdeno, int size, int amount) {
		int count=0;
		for(int i=0;i<size; i++) 
		{
			if(amount>=currdeno[i]) 
				{
				count = amount / currdeno [i];
				amount = amount % currdeno [i];
				System.out.println(currdeno [i]+ ":"+ count);
								
				}
			if(amount==0) 
			{
				break;
			}
		}
	}

	public static void sortingValues(int[] currdeno, int size) {
		
		for(int i=0; i<size; i++)  //printing Currency Denominations
		{
			int index=i;
			for(int j=i+1;j < size; j++) {
				if(currdeno[j]>currdeno[index]) {
					index = j;
				}
				
			}
			int greaterValue = currdeno[index];
			currdeno[index]= currdeno[i];
			currdeno[i] = greaterValue;

		
		}
	}

}
