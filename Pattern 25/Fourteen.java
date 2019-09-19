/*

1111111
1111122
1111333
1114444
1155555
1666666
7777777

*/

import java.util.Scanner;
public class Fourteen{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");

		for (int i=1;i<=rows ; i++) {
			for (int j=1;j<=rows-i ;j++ ) {
				
					System.out.print(1);				
			}
			for (int j=1;j<=i ;j++ ) {				
					System.out.print(i);				
			}
			System.out.println();
		}
	}
}