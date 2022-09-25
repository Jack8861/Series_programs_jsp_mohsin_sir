// Seventh series
// 2 15 41 80 132 197 275 366 470 587 

package org.all;

import java.util.Scanner;

public class Seventh {
	public static void main(String[] args) {
		int k;
		int num = 2;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();

		for (int n = 1; n <= k; n++) {
			System.out.print(num + " ");
			num += n * 13;

		}
	}
}