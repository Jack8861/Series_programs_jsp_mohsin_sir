// Tribonacci incrementing number series
// 1 2 5 8 15 28 51 94 173 

package org.all;

import java.util.Scanner;

public class Seventeenth {

	public static void main(String[] args) {
		int k;
		int next = 8;
		int num = 8;
		int l1 = 1;
		int l2 = 3;
		int l3 = 3;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();

		if (k == 1) {
			System.out.println(1);
		}
		else if (k == 2) {
			System.out.println(1 + " " + 2);
		}
		else if (k == 3) {
			System.out.println(1 + " " + 2 + " " + 5);
		}
		else {
			System.out.print(1 + " " + 2 + " " + 5 + " ");
			for (int n = 3; n <=k; n++) {
				
				next = l1 + l2 + l3; // generate nxt num to add (tribonacci)
				System.out.print(num + " ");
				
				// move the nums forward
				num += next;
				l1 = l2;
				l2 = l3;
				l3 = next;		
			}	
		}
	}
}
