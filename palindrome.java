import java.lang.reflect.Array;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String strWord = input.next();
        char [] arrWord = strWord.toCharArray();

        for(int i=strWord.length()-1; i>=0; i--){
            int frontIndex = (strWord.length()-1) - i;
            if(arrWord[frontIndex] != arrWord[i]){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome word");
    }
}
