/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
*/
import java.util.Scanner;
public class Third{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//Now taking rows
		System.out.print("Entet the Number of rows: ");
		int rows = sc.nextInt();
		//Now printing to pattern
		for (int i=1;i<=rows ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}