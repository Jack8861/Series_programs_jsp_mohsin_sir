// Ninth series
// 0 6 10 17 22 

package org.all;

import java.util.Scanner;

public class Ninth {
	public static void main(String[] args) {
		int k;
		int num = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();

		for (int n = 1; n <= k; n++) {

			if (n % 2 != 0) {
				System.out.print(num + " ");
				num += 6 + (int) (n / 2);

			} else {

				System.out.print(num + " ");
				num += 4 + ((int) (n / 2) - 1);
			}

		}
	}
}