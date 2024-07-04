import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int exit = 1;
        while(exit == 1){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number digits:");
            String num = sc.next();
            char [] arrNum = num.toCharArray();

            for(int i = arrNum.length-1; i>=0; i--){
                System.out.print(arrNum[i]);
            }
            System.out.println();
            System.out.println(" Do you want to see another digit's reverse then (press 1), if no (press 0) ");
            exit= sc.nextInt();
        }
    }
}
