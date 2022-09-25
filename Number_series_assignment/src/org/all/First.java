// ARTHIMETIC SERIES
// 1, 4, 7, 10

package org.all;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		int k;
		int a = 1;
		int d = 3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();
		
		for(int n=1; n<=k; n++) {
			// formula for generating a specific AP term: a+(n-1)d
			System.out.print(a + " ");
			a += d;
		}
	}
}
