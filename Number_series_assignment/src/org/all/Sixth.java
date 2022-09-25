// Sixth series
// 1, -4, 5, -7, 10

package org.all;

import java.util.Scanner;

public class Sixth {
	public static void main(String[] args) {
		int k;
		int a = 1;
		int d = 3;
		int mul = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();

		for (int n = 1; n <= k; n++) {
			// alternate numbers are negative...
			System.out.print(a * mul + " ");
			mul *= -1;
			a += d;
		}
	}
}