/*

1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7

*/

import java.util.Scanner;
public class Thirteen{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");
		//Printig upper portion of pattern
		for (int i=1;i<=rows ; i++) {
			//first print to space of pattern
			for (int j=1;j<i ;j++ ) {
				System.out.print(" ");
			}
			//printing to nubers 
			for (int j=i;j<=rows ;j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}


			//printing to lowest pattern
		
			//first print to space of pattern
			
			//printing to nubers 
			for (int i=rows-1;i>=1 ; i--) {
			//first print to space of pattern
			for (int j=1;j<i ;j++ ) {
				System.out.print(" ");
			}
			//printing to nubers 
			for (int j=i;j<=rows ;j++ ) {
				System.out.print(j+" ");
			}

			
			System.out.println();
		}
	}
  }


		
			
		
	
