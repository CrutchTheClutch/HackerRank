import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        
        double pos = 0;
        double neg = 0;
        double zero = 0;
        
        for (int i = 0; i < size; i++) {
            int n = s.nextInt();
            if(n > 0) {
                pos++;
            } else if(n < 0){
                neg++;
            } else if(n == 0){
                zero++;
            }
        }
        System.out.printf("%.6f %n", pos / size);
        System.out.printf("%.6f %n", neg / size);
        System.out.printf("%.6f %n", zero / size);
    }
}