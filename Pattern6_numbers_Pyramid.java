package learning;
import java.util.Scanner;

public class Pattern6_numbers_Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i; int j; int k;
		int number = 1;
		for(i=1; i<=n; i++) {
			
			for(j=1; j<=n-i; j++) {
				System.out.print("  ");
		     }
			for(j=1; j<i; j++) {
				System.out.print(number++ +"   ");
			}
				System.out.println("");
		}
		
	}

}
