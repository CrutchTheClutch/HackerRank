import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int lineNum = n - 1;
        int spaces = n - 1;
        for (int h = n; h > 0; h--) {
            for (int w = n; w > 0; w--) {
                if (spaces > 0) {
                    System.out.print(" ");
                    spaces--;
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
            lineNum--;
            spaces = lineNum;
        }
    }
}
