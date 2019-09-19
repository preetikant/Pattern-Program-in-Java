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
public class Twenty{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");

		for (int i=rows;i>=1 ; i--) {			
			for (int j=i;j>=1 ;j-- ) {
				System.out.print(" ");			
		}				
		 	for (int j=1;j<=rows-i+1 ;j++ ) {
		 		System.out.print("*"+" ");	
		 }
		System.out.println();		
    	}	//printing to space
				
  }
}