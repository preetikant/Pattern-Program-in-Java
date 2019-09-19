/*
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
16      17      18      19      20      21
22      23      24      25      26      27      28
*/

import java.util.Scanner;
public class Eighteen{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");
			int add=1;
		for (int i=1;i<=rows ; i++) {
			for (int j=1;j<=i ;j++ ) {
				
					System.out.print(add+"\t");
						add++;
			}
			System.out.println();
		}
	}
}