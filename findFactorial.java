import java.util.Scanner;

public class findFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exit = 0;
        while(exit == 0){
        
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int f = 1;

            for(int i = number; i>=1; i--){
                f = f*i;
            }
            System.out.println("The factorial of given number is: " + f);
            
            System.out.print("To continue again press 0 or to exit press 1: ");
            exit = sc.nextInt();
        }
    }
}
