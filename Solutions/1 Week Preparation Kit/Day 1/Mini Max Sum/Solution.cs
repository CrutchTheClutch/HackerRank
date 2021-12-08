using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Result
{
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<int> arr)
    {
        long min = arr[0];
        long max = arr[0];
        long total = 0;

        arr.ForEach(x =>
        {
            // get total of all numbers
            total += x;

            // find min
            if (x <= min)
            {
                min = x;
            }

            // find max
            if (x > max)
            {
                max = x;
            }
        });

        Console.WriteLine((total - max) + " " + (total - min));
    }
}

class Solution
{
    public static void Main(string[] args)
    {
        List<int> arr = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arrTemp => Convert.ToInt32(arrTemp)).ToList();

        Result.miniMaxSum(arr);
    }
}
