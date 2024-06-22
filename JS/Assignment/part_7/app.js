let array = [2, 3, 8, 7, 9, 5];

// const arrayAverage = (arr) => {
//     let total = 0;
//     for(let number of array) {
//         total += number;
//     }
//     return total/array.length;
// };

// console.log(arrayAverage(array));

// // Q2
// let n = 4;
// const isEven = (n) => {
//     return n % 2 == 0;
// }

// // OR
// let num = 6;
// const isEven1 = (num) => num % 2 == 0 ;


// Check Output
let length = 4;
function callback () {
    console.log(this.length);
}

const object = {
    length: 5,
    method (callback) {
        callback;
    },
};

object.method(callback, 1, 2);