package com.ilpbatch4.utility;

public class SumOfSeries1 {

	public static void main(String[] args) {
		int input = 10;
		sumOfTheSeries(input);

	}

	private static void sumOfTheSeries(int input) {

		int sum = 0, j = 1;

		for (int i = 1; i <= input; i++) {
			if (i % 2 == 1)
				sum = sum + j;
			else
				sum = sum - j;
			j = j + 2;
		}
		System.out.println("sum = " + sum);
	}

}
