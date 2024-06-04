package com.ilpbatch4.utility;

public class Ascending_Descending_4numbers {

	public static void main(String[] args) {
		int input1 = 5, input2 = 7, input3 = 4, input4 = 6;
		AscendingOrder(input1, input2, input3, input4);
		DescendingOrder(input1, input2, input3, input4);

	}

	private static void AscendingOrder(int input1, int input2, int input3, int input4) {
			if(input1>input2)
			{
				input1 = input1 + input2;
				input2 = input1 - input2;
				input1 = input1 - input2;
			}
			if(input1>input3)
			{
				input1 = input1 + input3;
				input3 = input1 - input3;
				input1 = input1 - input3;
			}
			if(input1>input4)
			{
				input1 = input1 + input4;
				input4 = input1 - input4;
				input1 = input1 - input4;
			}
			if(input2>input3)
			{
				input2 = input2 + input3;
				input3 = input2 - input3;
				input2 = input2 - input3;
			}
			if(input2>input4)
			{
				input2 = input2 + input4;
				input4 = input2 - input4;
				input2 = input2 - input4;
			}
			if(input3>input4)
			{
				input3 = input3 + input4;
				input4 = input3 - input4;
				input3 = input3 - input4;
			}
			
			System.out.print("Ascending Order = " + input1 + " " + input2 + " " + input3 + " " + input4 + "\n");
	}
	
	private static void DescendingOrder(int input1, int input2, int input3, int input4) {
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
		if(input1<input4)
		{
			input1 = input1 + input4;
			input4 = input1 - input4;
			input1 = input1 - input4;
		}
		if(input2<input3)
		{
			input2 = input2 + input3;
			input3 = input2 - input3;
			input2 = input2 - input3;
		}
		if(input2<input4)
		{
			input2 = input2 + input4;
			input4 = input2 - input4;
			input2 = input2 - input4;
		}
		if(input3<input4)
		{
			input3 = input3 + input4;
			input4 = input3 - input4;
			input3 = input3 - input4;
		}
		
		System.out.print("Descending Order = " + input1 + " " + input2 + " " + input3 + " " + input4);
}

}
