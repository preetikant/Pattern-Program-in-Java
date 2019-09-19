import java.util.Scanner;
public class Fourth{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//Takin row form user
		
		System.out.print("Enter the Number of rows: ");
		int rows = sc.nextInt();
		// printing your pattern
		for (int i=1;i<=rows ;i++ ) {
			for (int j=rows;j>=i ;j-- ) {
				System.out.print(j+" ");
			}System.out.println();
		}//closing the resources
		sc.close();

	}
}