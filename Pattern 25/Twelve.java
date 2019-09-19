/*
1
10
101
1010
10101
101010
1010101
*/

import java.util.Scanner;
public class Twelve{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");

		for (int i=1;i<=rows ; i++) {
			for (int j=1;j<=i ;j++ ) {
				if(j%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
}