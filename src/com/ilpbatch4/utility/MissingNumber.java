package com.ilpbatch4.utility;

public class MissingNumber {

	public static void main(String[] args) {
		float input = 10;
		missingNumber(input);

	}

	private static void missingNumber(float input) {
		int[] arr = { 1, 6, 8, 9, 3 };
		int l;
		for (int i = 1; i <=input; i++) {
			l = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					l = 1;
				}
			}
			if (l == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
