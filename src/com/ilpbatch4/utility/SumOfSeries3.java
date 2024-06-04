package com.ilpbatch4.utility;

public class SumOfSeries3 {
	public static void main(String[] args) {
		int input = 5;
		sumOfTheSeries(input);

	}

	private static void sumOfTheSeries(int n) {
		int j = 1, sum = 0, newsum = 0;
		for (int i = 1; i <= n; i++) {
			sum = (int) Math.pow(j, i);
			if (i % 2 == 0) {
				newsum = newsum - sum;
			} else {
				newsum = newsum + sum;
			}
			j = j + 2;
		}
		System.out.println("Newsum: " + newsum);
	}

}
