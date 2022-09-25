// increment next by adding (next-1)
// use that to increment num
// 2 4 7 12 21 38 71

package org.all;

import java.util.Scanner;

public class Nineteenth {

	public static void main(String[] args) {
		int k;
		int num = 2;
		int next = 2;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();
		
		for (int n = 0; n <k; n++) {
			System.out.print(num + " ");
			num += next;
			next += (next-1);				
		}	
	}
}
