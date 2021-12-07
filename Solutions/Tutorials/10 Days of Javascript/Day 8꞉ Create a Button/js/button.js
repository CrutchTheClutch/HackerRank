var btn = document.createElement("button");
var clickCount = 0;

btn.id = "btn";
btn.innerHTML = clickCount;

document.body.appendChild(btn);

btn.onclick = function () {
  clickCount += 1;
  btn.innerHTML = clickCount;
};
