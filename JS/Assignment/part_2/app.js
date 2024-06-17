// Que 1
// let num = 26;
// if((num % 10) === 0) {
//     console.log("Good");
// } else {
//     console.log("bad");
// }

// Que 2
// let name = prompt("Enter your name: ");
// let age = prompt("Enter your age");
// alert(`${name} is ${age} years old.`);

// Que 3

// let quarter = 2;

// switch(quarter) {
//     case 1:
//         console.log("January, Februry , March")
//         break;
//     case 2:
//         console.log("April, May, June")
//         break;
//     case 3:
//         console.log("July, August, September")
//         break;
//     case 4:
//         console.log("October, November, December")
//         break;
//     default:
//         console.log("Not a Quarter!")
// }

// Que 4
// let str = 'apples';
// if((str[0] == 'a' || str[0] == 'A') && (str.length > 5)) {
//     console.log("Golden string");
// } else {
//     console.log("Not a golden string");
// }

// Que 5
let a = 5;
let b = 9;
let c = 1;

if (a>b && a>c) {
    console.log(a,"is the largest num");
} else if (b>c && b>a) {
    console.log(b,"is the largest num");
} else {
    console.log(c,"is the largest num");
}

// Que 6

let num1=76;
let num2 = 6745;

if((num1 % 10) == (num2 % 10)) {
    console.log("numbers have same last digit which is", num1%10);
} else {
    console.log("numbers dont have same last digit");
}