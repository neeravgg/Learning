package learning;
import java.util.Scanner;
import Practise.Scanner;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to create a febonacci series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i <= n - 2; i++) {
            int sum = a + b;
            System.out.print(sum+ " ");
            a = b;
            b = sum;
	        }
	}
}
