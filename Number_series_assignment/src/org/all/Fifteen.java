// 12th number series
// 1 3 7 15 31 63 127 255 

package org.all;

import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		int k;
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();

		for (int i = 1; i <= k; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.print(" ");
			
			
		}
	}

}

