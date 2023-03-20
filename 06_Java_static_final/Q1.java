
import java.util.*;

class Q1 {
    public static void main(String[] args) {
        int even = 0, odd = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}