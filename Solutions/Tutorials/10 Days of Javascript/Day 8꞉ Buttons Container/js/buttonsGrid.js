var btn5 = document.getElementById("btn5");

let num = [1, 2, 3, 6, 9, 8, 7, 4];
const id = [1, 2, 3, 6, 9, 8, 7, 4];

btn5.onclick = () => {
  num.unshift(num.pop());
  for (var i = 0; i <= 7; i++) {
    document.getElementById("btn" + id[i]).innerHTML = num[i];
  }
};
