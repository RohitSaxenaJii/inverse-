import java.util.*;

public class sumArray {

    public static Scanner scn = new Scanner(System.in);

    public static void input1 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static int[] input2 (int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();             
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void sum2Array(int[] arr, int[] arr2) {
        int n = arr.length;
        int m = arr2.length;
        int p = Math.max(n,m) + 1;
        int[] ans = new int[p];

        int i = n - 1, j = m - 1, k = p - 1 , carry = 0;

        while (k >= 0) {
            int sum = carry + (i >= 0 ? arr[i] : 0) + (j >= 0 ? arr2[j] : 0); // ternary operator;
            arr[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        for (int idx = 0; idx < p; idx++) {
            if (idx == 0 && ans[idx] == 0) {
                continue;
            }
            else{
                System.out.print(ans[idx]);
            }
        }
    }

    public static void main (String[] args) {
        int a = scn.nextInt();
        int[] arr = new int[a];
        // int[] arr = input2(a);
        int b = scn.nextInt();
        int[] arr2 = new int[b];
        // int[] arr2 = input2(b);
        sum2Array(arr, arr2);
        // display(arr);
    }
}
// javac sumArray.java && java sumArray

// 
