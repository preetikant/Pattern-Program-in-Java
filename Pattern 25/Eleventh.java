/*
1
21
321
4321
54321
654321
7654321

*/

import java.util.Scanner;
public class Eleventh{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");

		for (int i=1;i<=rows ; i++) {
			for (int j=i;j>=1 ;j-- ) {
				System.out.print(j+"");

			}
			System.out.println();
		}
	}
}