package learning;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i; int j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=i-1; j++) {
				System.out.print("  ");
		     }
			for(j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
				System.out.println("");
		}

	}

}
