import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long sum = 0, max = 0, min = 0;
        sum = max = min = in.nextInt();
        for (int arr_i = 1; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] > max) {
                max = arr[arr_i];
            }
            if (arr[arr_i] < min) {
                min = arr[arr_i];
            }
            sum += arr[arr_i];
        }
        System.out.print((sum - max) + " " + (sum - min));
    }
}
