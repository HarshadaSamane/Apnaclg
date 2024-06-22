// Que 1
let array = [2, 6, 5, 8, 9, 6];
let square = array.map((el) => el * el);
console.log(square);

let sum = square.reduce((ans, el) => ans + el);
let avg = sum / array.length;
console.log(avg);

// Que 2
let newarray = array.map((el) => el + 5);
console.log(newarray);

// Que 3
let arr = ["hello", "goodevening"];
let newarr = arr.map((string) => string.toUpperCase());
console.log(newarr);

// Que 4

let arr1 = [];
let doubledAndReturnArgs = (arr1, ...args) => [
  ...arr1,
  ...args.map((el) => el * 2),
];

// Que 5

let obj1 = {
  name: "John",
  age: 30,
};

let obj2 = {
  city: "Aman",
  marks: 25,
};

const mergeObjects = (obj1, obj2) => ({ ...obj1, ...obj2 });
