package test;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        ch=sc.nextInt();
        System.out.println("enter the number for week:");

        switch (ch) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednewsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;


            default:
                System.out.println("enjoyong all day");
                break;
        }System.out.println("Enjoying day");
    }
}
