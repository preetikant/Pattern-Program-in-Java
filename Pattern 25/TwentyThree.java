/*
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
*/
import java.util.Scanner;
public class TwentyThree{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");

		for (int i=1;i<=rows ; i++) {	
		//printing to pace for upper diamond	
			for (int j=1;j<=rows-i ;j++ ) {
				System.out.print(" ");			
		}	
		//printing to half diamond
		for (int j=2;j<=i ;j++ ) {
				System.out.print("*");			
		}
		//printing to half portion of upper diamond
		for (int j=1;j<=i ;j++ ) {
				System.out.print("*");			
		}		 	
		System.out.println();		
    	}
    	//Bottom diamond
    	for (int i=1;i<=rows-1 ; i++) {	
		//printing to pace		
			for (int j=1;j<=i ;j++ ) {
				System.out.print(" ");			
		}	
		//printing to half diamond
		for (int j=2;j<=2*rows-2*i ;j++ ) {
				System.out.print("*");			
		}
		// for (int j=1;j<=i ;j++ ) {
		// 		System.out.print("*");			
		// }		 	
		System.out.println();		
    	}	
				
  }
}