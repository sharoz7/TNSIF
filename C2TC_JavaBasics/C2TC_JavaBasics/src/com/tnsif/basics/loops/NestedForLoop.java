package com.tnsif.basics.loops;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		
		for(int i = start; i <=end; i++)
		{
			for(int j = 1; j<=10;j++)
			{
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println("-");
			System.out.println();
		
		}
		
//		for (int i = start; i <= end; i++) {
//			for (int j = 1; j <= 10; j++) {
//				System.out.println(i + "*" + j + "= " + i * j);
//			}
//			System.out.println();
//		    System.out.println("--------------");
//		}
		
	}
}
