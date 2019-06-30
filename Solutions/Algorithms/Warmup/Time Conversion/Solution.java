import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String hour = s.substring(0,2);
        String period = s.substring(8);
        int h = Integer.parseInt(hour);
        if (period.equals("PM") && !hour.equals("12")) {
            h += 12;
            hour = Integer.toString(h);
        } 
        
        if (period.equals("AM") && hour.equals("12")) {
            hour = "00";
        }
        return hour + s.substring(2,8);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
