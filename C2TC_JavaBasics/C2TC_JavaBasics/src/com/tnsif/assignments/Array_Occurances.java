package com.tnsif.assignments;

import java.util.Scanner;

public class Array_Occurances {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int len = sc.nextInt();
		
		
		int a[] = new int[len];
		System.out.println("Enter the numbers");
		for(int i = 0; i <len; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number of queries");
		int q = sc.nextInt();
		System.out.println("Enter the queries");
		
		for(int i = q; i >0 ; i--)
		{
			
			int count = 0;
			int q1 = sc.nextInt();
			
			for(int j = 0; j <len; j++)
			{
				if(a[j]==q1)
				{
					count++;
				}
			}
			
			if(count!=0)
			{
				System.out.println(count);
			}
			else
				System.out.println("NOT PRESENT");
		}
		
		
		
	}
	
	
	
}
