/*
      1234567
       234567
        34567
         4567
          567
           67
            7
           67
          567
         4567
        34567
       234567
      1234567
*/
import java.util.Scanner;
public class Tenth{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows from the user: ");
		int rows = sc.nextInt();
		System.out.println("This is your Patter,,,,");
//Printing upper pattern
		for (int i=1;i<=rows ; i++) {
      //printing space at the begining of each rows
			for (int j=1;j<i ;j++ ) {
				System.out.print(" ");
			}
      //printing i to rows value at the and of each row
      for (int j=i;j<=rows ;j++ ) {
        System.out.print(j);
      }
			System.out.println();
		}
    //printing lower pattern
    for (int i=rows-1;i>=1; i--) {
      //printing space of the code
      for (int j=2;j<=i; j++ ) {
      System.out.print(" ");
       }
        for (int j=i;j<=rows; j++ ) {
      System.out.print(j);
       }
    System.out.println();
    } 
  }
}

