package com.tnsif.assignments;

import java.util.Scanner;

public class HE_Occurance {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int len = sc.nextInt();
		
		int a[] = new int[len];
		for(int i = 0; i < len;i++)
		{
			 a[i] = sc.nextInt();
		}
		
	
		
		System.out.println("Enter the number of test cases");
		int q = sc.nextInt();
		while(q>0)
		{
			int count = 0;
			int q1 = sc.nextInt();
			for(int i = 0; i<len; i ++)
			{
					if(a[i]==q1)
					{
						count++;
					}
					
				
			}
			if(count==0)
			{
				System.out.println("NOT PRESENT");
			}
			else
			System.out.println(count);
		q--;	
		}
		
		
		// 1 1 0 2 1
		
		
		
		
		
		
		
	}
	
	
	
}
