// Thirteenth series
//1 -2 5 -15 25 -41 125 -80 

package org.all;

import java.util.Scanner;

public class Thirteenth {
	public static void main(String[] args) {
		int k;
		int num1 = 1;
		int num2 = -2;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();

		for (int n = 1; n <= k; n++) {

			if (n % 2 != 0) {
				System.out.print(num1 + " ");
				num1 *= 5;

			} else {

				System.out.print(num2 + " ");
				num2 -= 13 * (int) (n / 2);
			}

		}
	}
}