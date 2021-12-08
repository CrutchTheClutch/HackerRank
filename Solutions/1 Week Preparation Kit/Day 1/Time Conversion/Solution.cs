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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static string timeConversion(string s)
    {
        // convert hour
        int hour = int.Parse(s.Substring(0, 2));

        // if contains "AM", strip out the "AM"
        if (s.Contains("AM"))
        {
            // 12 AM should be 00
            hour = hour == 12 ? 0 : hour;
            return buildTimeString(hour, s);
        }

        // otherwise, add 12 hours
        // 12 PM should be 12
        hour = hour + 12 == 24 ? 12 : hour + 12;
        return buildTimeString(hour, s);
    }

    /*
    * Takes the hour as an int, the full time string 
    * and builds the output
    */
    private static string buildTimeString(int hour, string time)
    {
        return hour.ToString("00") + time.Substring(2, 6);
    }
}

class Solution
{
    public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string s = Console.ReadLine();

        string result = Result.timeConversion(s);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
