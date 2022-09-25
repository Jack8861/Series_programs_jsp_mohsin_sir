// 12th number series
// 1 3 7 15 31 63 127 255 

package org.all;

import java.util.Scanner;

public class Twelveth {

	public static void main(String[] args) {
		int k;
		int val = 1;
		int sum = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();

		for (int n = 1; n <= k; n++) {
			System.out.print(sum + " ");
			val *= 2;
			sum += val;
		}
	}

}
