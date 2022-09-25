// Tenth series
// 6 9 14 21 30 41 

package org.all;

import java.util.Scanner;

public class Tenth {
	public static void main(String[] args) {
		int k;
		int prime = 3;
		int sum = 6;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();
		
		for (int n = 1; n <= k; n++) {
			System.out.print(sum + " ");
			sum += prime;
			prime += 2;
			

		}
	}
}