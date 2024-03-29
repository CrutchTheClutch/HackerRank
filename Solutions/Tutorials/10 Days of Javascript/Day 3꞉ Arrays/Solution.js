"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
});

process.stdin.on("end", (_) => {
  inputString = inputString
    .trim()
    .split("\n")
    .map((string) => {
      return string.trim();
    });

  main();
});

function readLine() {
  return inputString[currentLine++];
}

/**
 *   Return the second largest number in the array.
 *   @param {Number[]} nums - An array of numbers.
 *   @return {Number} The second largest number in the array.
 **/
function getSecondLargest(nums) {
  var largest = nums[0];
  let secondLargest;
  // Complete the function
  for (var i = 1; i <= nums.length - 1; i++) {
    if (nums[i] === largest || nums[i] === secondLargest) {
      continue;
    } else if (nums[i] > largest) {
      secondLargest = largest;
      largest = nums[i];
    } else if (nums[i] > secondLargest || secondLargest === undefined) {
      secondLargest = nums[i];
    }
  }
  return secondLargest;
}
