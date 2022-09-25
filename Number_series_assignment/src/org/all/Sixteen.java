// 16th number series
// 0 2 8 14 24 34 48 62 

package org.all;

import java.util.Scanner;

public class Sixteen {

	public static void main(String[] args) {
		int k;
		int num = 0;
		int sum = 2;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();

		for (int n = 1; n <= k; n++) {

			if (n % 2 != 0) {
				System.out.print(num + " ");
				num += sum;
			} else {
				System.out.print(num + " ");
				sum += 4;
				num += sum;
				
			}

		}
	}

}
