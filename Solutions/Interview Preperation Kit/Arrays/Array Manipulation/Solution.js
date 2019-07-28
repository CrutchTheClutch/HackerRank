'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the arrayManipulation function below.
function arrayManipulation(n, queries) {
  // initalize array of 0's that is n+1 in length
  var sums = [];
  sums.length = n+1;
  sums = sums.fill(0);

  // fill sums with changes in "k" based on "a" and "b"
  for (var i = 0; i < queries.length; i++) {
    sums[queries[i][0]-1] += queries[i][2]; // adds value change to "a" in sums
    sums[queries[i][1]] -= queries[i][2]; // removes value change after "b" in sums
  }
  
  // determine largest value in sums with value changes
  var maxSum = 0, totalSum = 0;
  for (var i = 0; i < sums.length-1; i++) {
    totalSum += sums[i];
    maxSum = Math.max(maxSum, totalSum);
  }

  return maxSum;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const nm = readLine().split(' ');

    const n = parseInt(nm[0], 10);

    const m = parseInt(nm[1], 10);

    let queries = Array(m);

    for (let i = 0; i < m; i++) {
        queries[i] = readLine().split(' ').map(queriesTemp => parseInt(queriesTemp, 10));
    }

    let result = arrayManipulation(n, queries);

    ws.write(result + "\n");

    ws.end();
}
