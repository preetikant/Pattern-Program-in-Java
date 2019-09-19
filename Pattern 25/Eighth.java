/*

1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1

*/

import java.util.Scanner;
public class Eighth{
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	//Enter the number of rows
	System.out.println("Enter the Number of rows: ");
	//takint input through the user
	int rows = sc.nextInt();
	//Printing first half of the row
	for (int i=1;i<=rows ;i++ ) {
		for (int j=1;j<=i ;j++ ) {
			System.out.print(j+" ");
		}
	
	//printing second half of the row

		for (int j=i-1;j>=1 ;j-- ) {
			System.out.print(j+" ");
		}System.out.println();
	
	//closing the resources
	sc.close();
}
}
}
