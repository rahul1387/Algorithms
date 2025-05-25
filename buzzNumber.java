import java.util.Scanner;

public class buzzNumber {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("1. To check a BUZZ Number ");
        System.out.print("2. To find GCD of two numbers");
        System.out.print("Enter your choice");
        ch = sc.nextInt();

        switch (ch){
            case 1 :
                int n;
                System.out.print("Enter a number");
                n = sc.nextInt();
                if(n % 7 == 0 || n % 10 ==7){
                    System.out.println(n + "is a BUZZ number :)");
                }
                else {
                    System.out.println(n + "is not a Buzz number");
                }
                break;
            case 2 :
                int a,b,t = 0;
                System.out.print("Enter First number: ");

        }
    }}
