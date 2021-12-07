import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sCol = n - 1;
        int pDiag = 0, sDiag = 0, sum = 0;
        int a[][] = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                a[row][col] = in.nextInt();
                if (row == col) {
                    pDiag += a[row][col];
                }
                if (col == sCol) {
                    sDiag += a[row][col];
                    sCol--;
                }
            }
        }
        sum = Math.abs(pDiag - sDiag);
        System.out.print(sum);
    }
}
