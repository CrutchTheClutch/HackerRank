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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<int> arr)
    {
        int total = arr.Count;
        float posCount = 0;
        float negCount = 0;
        float zeroCount = 0;

        arr.ForEach(x =>
        {
            if (x > 0)
            {
                posCount++;
            }

            if (x < 0)
            {
                negCount++;
            }

            if (x == 0)
            {
                zeroCount++;
            }
        });

        Console.WriteLine((posCount / total).ToString("N6"));
        Console.WriteLine((negCount / total).ToString("N6"));
        Console.WriteLine((zeroCount / total).ToString("N6"));
    }
}

class Solution
{
    public static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine().Trim());

        List<int> arr = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arrTemp => Convert.ToInt32(arrTemp)).ToList();

        Result.plusMinus(arr);
    }
}
