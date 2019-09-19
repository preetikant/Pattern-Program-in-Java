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
public class Seventh{
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number of rows: ");
	int rows = sc.nextInt();
	//printing to pattern
	for (int i=rows;i>=1 ;i-- ) {
		for (int j=rows;j>i ;j-- ) {
			System.out.print(j+" ");
		}System.out.println();
	}
	//closing the resources
	sc.close();
}
}