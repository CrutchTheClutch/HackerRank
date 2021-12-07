import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int rounded = 0, grade = 0;
        int len = grades.length;
        for (int i = 0; i < len; i++) {
            rounded = ((grades[i]) % 5);
            if ((rounded > 2) && (grades[i] > 35)) {
                rounded = 5 - rounded;
                grades[i] += rounded;
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
