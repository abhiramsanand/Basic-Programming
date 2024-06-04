package com.ilpbatch4.utility;
 
public class ZPattern {
 
	public static void main(String[] args) {
		int input=7;
		printPatternZ(input);
	}
	public static void printPatternZ(int input) {
		for(int i=1;i<=input;i++) {
			if(i==1 || i==input) {
				for(int j=1;j<=input;j++) {
					if(j==1 || j==input)
					{
						System.out.print("#");	
					}
					else
					System.out.print("*");
				}
				
			}
			else {
				for(int j=1;j<=input-i;j++) {
					System.out.print(" ");
				}
				if(i==(input/2)+1)
				{
					System.out.print("#");
				}
				else
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}
 
}