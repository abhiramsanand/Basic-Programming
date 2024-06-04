package com.ilpbatch4.utility;

public class SumOfSeries4 {
	public static void main(String[] args) {
		float input = 3;
		factorealOfANumber(input);
	}

	private static void factorealOfANumber(float input) {
		float sum = 0;
		for (int i = 1; i <= input; i++) {
			sum = sum + i / (float) factoreal(i);
		}
		System.out.println("result = " + sum);
	}

	private static int factoreal(float n) {
		int factoreal = 1;
		for (int i = 1; i <= n; i++) {
			factoreal = factoreal * i;
		}
		return factoreal;
	}
}
