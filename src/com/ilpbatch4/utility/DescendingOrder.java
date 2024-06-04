package com.ilpbatch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int input1 = 5, input2 = 7, input3 = 4;
		descendingOrder(input1, input2, input3);

	}

	private static void descendingOrder(int input1, int input2, int input3) {
			if(input1<input2)
			{
				input1 = input1 + input2;
				input2 = input1 - input2;
				input1 = input1 - input2;
			}
			if(input1<input3)
			{
				input1 = input1 + input3;
				input3 = input1 - input3;
				input1 = input1 - input3;
			}
			if(input2<input3)
			{
				input2 = input2 + input3;
				input3 = input2 - input3;
				input2 = input2 - input3;
			}
			
			System.out.print(input1 + " " + input2 + " " + input3);
	}

}
