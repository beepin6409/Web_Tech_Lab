//Find the no. of occurrence of each element in an user entered list of nos.
import java.util.*;

public class Q3 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count[i]++;
                    arr[j] = 0;
                }
            }
        }
        System.out.println("The number of occurrences of each element in the list is: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i] + "--> " + count[i] + " times.");
            }
        }
    }


}