import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
        
    }
}
