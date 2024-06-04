package com.ilpbatch4.utility;

public class SumOfSeries2 {

	public static void main(String[] args) {
		int input = 3;
		sumOfTheSeries(input);

	}

	private static void sumOfTheSeries(int input) {

		int sum = 0,f=0, s=1, n=0;

		for (int i = 1; i <= input; i++) {
			n= f+s;
			sum = sum + (n*n*n);
			f = s;
			s = n;
		}
		System.out.println("sum = " + sum);
	}
}
