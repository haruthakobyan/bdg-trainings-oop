package com.bdg.vkaramyan.lesson_1_6;

public class App_251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 23, -1, 3, 4, 17, 13, 8, 9, 6 };

		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		System.out.println(" max : " + max);

	}

}
