import java.util.Arrays;
import java.util.Scanner;

public class plusOne_66 {
    public static int[] plusOne(int[] digits) {
        for(int i= digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Print array
        System.out.println(Arrays.toString(plusOne(arr)));
        sc.close();
    }
}

