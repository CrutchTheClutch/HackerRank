import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long numOfA = 0;

        // calculate numOfA's in original string
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                numOfA++;
            }
        }

        long multiple = n / s.length();
        long remainder = n % s.length();

        // multiplies numOfA's by number of times s goes into n
        numOfA = numOfA * multiple;
        
        // if a remainder exists, iterate through remaining string
        if (remainder > 0) {
            for (char c : s.toCharArray()) {
                if (c == 'a') {
                    numOfA++;
                }
                remainder--;
                
                if (remainder <= 0) {
                    break;
                }
            }
        }

        return numOfA;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        // 395886275361

        bufferedWriter.close();

        scanner.close();
    }
}
