package com.tnsif.basics.loops;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for(int i = 5; i <15; i++)
		{
			if(i%2!=0)
				//this particular iteration will be skipped to print i
//				break;
			continue;
			System.out.println(i);
		}
	}
}
