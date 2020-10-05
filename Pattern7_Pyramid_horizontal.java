package learning;
import java.util.Scanner;
public class Pattern7_Pyramid_horizontal {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 2*n-1;
		int i; int j; int k;
		int number = 1;
		for(i=1; i<=r; i++) {
			
			if(i <= n) {
				for(j=1; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			else {
				for(k=1; k<=r-i+1; k++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
				
		
	}
	}
}

	


