// number number incrementor series
// 0 2 6 12 20 30 42 56  

package org.all;

import java.util.Scanner;

public class Eighteenth {

	public static void main(String[] args) {
		int k;
		int num = 0; // to be printed
		int val = 0;  // to use in incremention
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers would you like to print?: ");
		k = sc.nextInt();
		
		for(int n=1; n<=k; n++) {
			System.out.print(num + " ");
			val += 2;
			num += val;
		}
	}

}
