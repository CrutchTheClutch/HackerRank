import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder rev = new StringBuilder(A);
        String res = rev.reverse().toString();
        if (A.equals(res)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
