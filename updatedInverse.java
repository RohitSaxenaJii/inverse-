import java.util.*;

public class gcdAndLcm {
    public static Scanner scn = new Scanner(System.in);

    public static int gcd(int n1, int n2) {
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }

    public static int Lcm(int n1, int n2) {

        int lcm = (n1 * n2) / gcd(n1, n2);
        ;
        return lcm;
    }

    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(gcd(n1, n2));
        System.out.println(Lcm(n1, n2));
    }
}

// import java.util.*;
// public class gcdAndLcm{
// public static Scanner scn = new Scanner(System.in);

// public static void compare(int num1, int num2){
// int max = num1;
// if (num2 > max){
// max = num2;
// }
// }

// public static int gcd(int num1, int num2){
// compare(num1, num2);
// int i = 1;
// int factor = 0;
// for (i = 10; i > 0; i--){
// factor = num1 * i;
// if (factor / num2 == 0){}
// }
// return factor;
// }
// public static void main(String[] args){
// int num1 = scn.nextInt();
// int num2 = scn.nextInt();
// int a = gcd(num1, num2);
// System.out.println(a);
// }

// }
