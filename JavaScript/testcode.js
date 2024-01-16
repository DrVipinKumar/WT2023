const a = {
  i: 1,
  toString() {
    return a.i++;
  },
  myValue() {
    return "Hello Ji";
  },
};

if (a == 1 && a == 2 && a == 3) {
  console.log("Hello World!");
}
