// Twenty
// 1 9 17 33 49 73 97
//  8 8 16 16 32 32

package org.all;

import java.util.Scanner;

public class Twenty {

	public static void main(String[] args) {
		int k;
		int num = 1;
		int next = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();
		
		for (int n = 1; n<=k; n++) {
			System.out.print(num + " ");
			
			if (n%2 != 0) {
				next += 8;
				num += next;
			}
			else {
				num += next;
			}
			
		}	
	}
}
