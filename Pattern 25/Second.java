/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

import java.util.Scanner;
public class Second{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//now print the number of rows
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		//upper pattern 
		for (int i=1;i<=rows ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//printing lower half pattern
		for (int i=rows-1;i>=1 ;i-- ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}