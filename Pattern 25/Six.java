
/*
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
import java.util.Scanner;
public class Six{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Enter the rows
		System.out.print("Enter the rows: ");
		int rows = sc.nextInt();
		for (int i=rows;i>=1 ;i-- ) {
			for (int j=i;j>=1;j-- ) {
			System.out.print(j+" ");
			}System.out.println();
		}
	}
}
