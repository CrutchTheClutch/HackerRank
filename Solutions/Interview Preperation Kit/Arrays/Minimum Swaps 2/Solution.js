"use strict";

const fs = require("fs");

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
});

process.stdin.on("end", function () {
  inputString = inputString
    .replace(/\s*$/, "")
    .split("\n")
    .map((str) => str.replace(/\s*$/, ""));

  main();
});

function readLine() {
  return inputString[currentLine++];
}

// Complete the minimumSwaps function below.
function minimumSwaps(arr) {
  let swap, swapIndex;
  var minimumSwaps = 0;

  for (var i = 0; i < arr.length; i++) {
    if (arr[i] !== i + 1) {
      // temp var to hold value of value that will be swapped
      swap = arr[arr[i] - 1];

      // swaps current element to correct position
      arr[arr[i] - 1] = arr[i];

      // sets current element to swapped var
      arr[i] = swap;

      // adds 1 to number of swaps
      minimumSwaps++;

      // subtracts from i to ensure current element is correct - if not,
      // current element will be processed and swapped until value is correct.
      i--;
    }
  }

  return minimumSwaps;
}

function main() {
  const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

  const n = parseInt(readLine(), 10);

  const arr = readLine()
    .split(" ")
    .map((arrTemp) => parseInt(arrTemp, 10));

  const res = minimumSwaps(arr);

  ws.write(res + "\n");

  ws.end();
}
