// Fibonacci number series
// 1 1 2 3 5 8 13 

package org.all;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		int k;
		int l1 = 1;
		int l2 = 1;
		int temp = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();
		
		if (k==1) {
			System.out.println(1);
			return;
		}
		// assuming we never get -ve numbers
		System.out.print(1 + " " + 1 + " ");
		
		for(int n=2; n<=k-2; n++) {
			
			temp = l2;
			l2 = l1+l2;
			l1 = temp;
			
			System.out.print(l2 + " ");
			
		}
	}

}
