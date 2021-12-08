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
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(string a, string b)
    {
        // amount to be removed
        var count = 0;

        // get all unique letters in these strings
        string unique = a + b;
        unique = new String(unique.Distinct().ToArray());

        // for each unique letter, evaluate difference
        int length = unique.Length;
        for (int i = 0; i < length; i++)
        {
            // get counts of this char in both strings
            var aCount = getCharCount(a, unique[i]);
            var bCount = getCharCount(b, unique[i]);

            // difference for this char (how many should be removed?)
            count += Math.Abs(aCount - bCount);
        }

        // return count;
        return count;
    }

    private static int getCharCount(string source, char c)
    {
        var count = 0;
        foreach (char x in source)
        {
            if (x == c)
            {
                count++;
            }
        }
        return count;
    }
}

class Solution
{
    public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string a = Console.ReadLine();

        string b = Console.ReadLine();

        int res = Result.makeAnagram(a, b);

        textWriter.WriteLine(res);

        textWriter.Flush();
        textWriter.Close();
    }
}