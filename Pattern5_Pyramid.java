package learning;
import java.util.Scanner;
public class Pattern5_Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i; int j; int k;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n-i; j++) {
				System.out.print("  5");
		     }
			for(j=1; j<=i; j++) {
				System.out.print("*   ");
			}
				System.out.println("");
		}

	}
}

