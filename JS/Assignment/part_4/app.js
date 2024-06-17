// Que 1
// let arr = [1, 2, 3, 4, 5, 6, 2, 3];
// let num = 2;

// for(let i = 0; i<arr.length; i++) {
//     if(arr[i] === num) {
//         arr.splice(i, 1)
//     }
// }
// console.log(arr);

// Que 2
// let num = 23455464; 
// let count = 0;

// while(num > 0) {
//     num = Math.floor(num / 10);
//     count++;
// }

// console.log(count);

// Que 3
// let num = 4527;
// let sum = 0;

// while(num > 0) {
//     let digit = num % 10;
//     sum += digit;
//     num = Math.floor(num / 10);
//     }
// console.log(sum)

// Que 4
// let number = 5;
// let factorial = 1;
// for(let i = 1; i <= number; i++) {
// factorial *= i;
// }
// console.log(`factorial of ${number} is ${factorial}`);

// Que 5
let arr = [83, 4, 67, 74, 9];
let max = arr[0];
let min = arr[0];
for(let i = 0; i < arr.length; i++) {
    if(arr[i] > max) {
        max = arr[i];
    }
    if(arr[i] < min) {
        min = arr[i];
        }
}
    console.log(`max is ${max} and min is ${min}`);

