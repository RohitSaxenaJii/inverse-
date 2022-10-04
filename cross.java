import java.util.*;

public class cross {

    public static Scanner scn = new Scanner(System.in);

    public static void XCross(int n) {
        int nsp = n - 2;
        int nst = 1;
        // int nstt = 1;
        int nspp = n - n;
        for (int row = 1; row <= n; row++) {

            for (int csp = 1; csp <= nspp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                if (row == (n / 2) + 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            if (row <= n / 2) {
                nsp -= 2;
                nspp++;

            }

            else {
                nsp += 2;
                nspp--;
            }

            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        XCross(scn.nextInt());
    }
}
