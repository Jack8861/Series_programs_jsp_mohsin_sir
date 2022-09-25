// 11th number series
// 1 2 4 8 16 32 64 128 256  

package org.all;

import java.util.Scanner;

public class Eleventh {

	public static void main(String[] args) {
		int k;
		int val = 2; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();
		
		// to decrease the multiplication we can use this instead of 2**(n-1)
		if (k == 1) {
			System.out.print(1 + " ");
			return;
		}
		System.out.print(1 + " ");
		
		for(int n=1; n<=k; n++) {
			System.out.print(val + " ");
			val *= 2;
		}
	}

}
