// Que 1 and Que 2
let array = [7,9,0,-2];
let n = 3;

let array1 = array.slice(0,n);
console.log(array1);

let array2 = array.slice(array.length-n);
console.log(array2);

// Que 3
let str = prompt("please enter a string");
 if (str.length == 0) {
    console.log("String is empty");
 } else {
    console.log("String is not empty");
 }

// Que 4
let string = 'ApNaCoLlEgE';
let index = 3;
if (string[index] == string[index].toLowerCase()) {
    console.log("Character is lowercase");
} else {
    console.log("Character is not lowercase");
}

// Que 5
let str1 = prompt("Enter a string");
console.log(`original string = ${str1}`);
console.log(`string without spaces = ${str1.trim()}`);

// Que 6
let arr = ['hello', 34, -6, 99, 56];
let item = 56;

if(arr.indexOf(item) != -1) {
    console.log("element exist in array");
} else {
    console.log("element doesn't exist in array");
}

