/*
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
*/
import java.util.Scanner;
public class Ninth{
	public static void main(String[] args) {	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number of rows: ");
	int rows = sc.nextInt();
	//printing to pattern
	//pattern of upper half 
	for (int i=rows;i>=1 ;i-- ) {
		for (int j=1;j<=i ;j++ ) {
			System.out.print(j+" ");
		}System.out.println();
	}
	for (int i=1;i<=rows ;i++ ) {
		for (int j=1;j<=i ;j++ ) {
			System.out.print(j+" ");
		}System.out.println();
	}
	//closing the resources
	sc.close();
}
}