// Cube number series
// 1 8 27 64 

package org.all;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		int k;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();
		
		for(int n=1; n<=k; n++) {
			System.out.print(n*n*n + " ");
		}
	}

}
