import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i < 11; i++) {
            int r = n * i;
            System.out.println(n + " x " + i + " = " + r);
        }
    }
}