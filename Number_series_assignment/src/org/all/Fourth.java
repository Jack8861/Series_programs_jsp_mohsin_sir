// Triangular number series
// 1 3 6 10 15 21

package org.all;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		int k;
		int sum=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();
				
		for(int n=1; n<=k; n++) {
			System.out.print(sum + " ");
			sum += n+1;
			
		}
	}

}
