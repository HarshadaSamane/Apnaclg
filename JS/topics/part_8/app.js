// forEach Method
// The forEach() method calls a function for each element in an array.
let arr = [1, 2, 3, 4, 5];

let print = function (el) {
    console.log(el);
};

arr.forEach(print);


// map
// The map() method creates a new array with the results of applying the provided function on every element
let num = [1, 2, 3, 4];

let double = num.map((el) => {
    return el * 2;
});


// filter
// The filter() method creates a new array with all elements that pass the test implemented by the provided
let nums = [1, 2, 3, 4, 7, 8, 2, 9, 10, 12, 11];
let ans = nums.filter ((el) => {
    return el % 2 === 0;
});


// every
// The every() method checks if all elements in an array pass the test implemented by the provided function
[2, 4, 6].every((el) => {
    return el % 2 == 0;
});


// some
// The some() method checks if at least one element in an array passes the test implemented by the
let arr1 = [1, 2, 3, 4, 5];
arr1.some((el) => {
    return el % 2 === 0;
});


// reduce
// The reduce() method reduces the array to a single value.
let numbers = [1, 2, 3, 4];
let sum = numbers.reduce((res, el) => res + el);
console.log(sum);

// Q. find maximum using reduce function
let array = [2, 4, 5, 7, 49, 28, 74];
let answer = array.reduce((max, el) => {
    if(max < el) {
        return el;
    } else {
        return max;
    }
});

console.log(answer);