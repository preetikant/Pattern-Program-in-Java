/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006

*/

import java.util.Scanner;
public class Seventeen{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");
				
		for (int i=1; i<=rows; i++) {
			
			for (int j=1; j<=rows; j++ ) {
				if(j==i && i!=1)
					System.out.print(i-1);
				else
					System.out.print(0);
			}			
				System.out.println();
		}
	}
}