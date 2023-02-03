// To find the min sum and max sum after removing one element from the array.
// e.g :   [1,2,3,4,5] ->  removing 1 and add other elements 2+3+4+5 = 14 max sum
//                     ->  removing 5 and add other elements 1+2+3+4 = 10 min sum


import java.util.*;

public class FirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        // min
        for (int i = 0; i < arr.length - 1; i++) {
            result += arr[i];
        }

        // max
        int result1 = 0;
        for (int i = arr.length - 1; i >= 1; i--) {
            result1 += arr[i];
        }
        System.out.println(result + " " + result1);

    }
}
