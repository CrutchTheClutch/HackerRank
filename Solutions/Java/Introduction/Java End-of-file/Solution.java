import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 1;

        while (s.hasNext()) {
            System.out.println(count + " " + s.nextLine());
            count++;
        }

        s.close();
    }
}