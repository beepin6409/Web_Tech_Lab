
// Program to find no. of objects created out of a class using „static‟ modifier.

import java.util.*;


public class Q2 {
    static int count = 0;

    public Q2() {
        count++;
    }

    public static void main(String[] args) {
        Q2 q1 = new Q2();
        Q2 q2 = new Q2();
        Q2 q3 = new Q2();
        Q2 q4 = new Q2();
        Q2 q5 = new Q2();
        System.out.println("\nNumber of objects created: " + count + "\n");
    }
}