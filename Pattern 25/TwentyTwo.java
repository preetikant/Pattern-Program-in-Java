/*
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
*/
import java.util.Scanner;
public class TwentyTwo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");

		for (int i=1;i<=rows ; i++) {			
			for (int j=1;j<=i ;j++ ) {
				System.out.print("* ");			
		}		 	
		System.out.println();		
    	}	//printing to space
				
  }
}