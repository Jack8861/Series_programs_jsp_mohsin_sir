// Eight series
// 10 5 60 15 110 25 160  

package org.all;

import java.util.Scanner;

public class Eighth {
	public static void main(String[] args) {
		int k;
		int num1 = 10;
		int num2 = 5;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();

		for (int n = 1; n <= k; n++) {

			if (n % 2 != 0) {
				System.out.print(num1 + " ");
				num1 += 50;
				
			} else {
				
				System.out.print(num2 + " ");
				num2 += 10;
			}

		}
	}
}