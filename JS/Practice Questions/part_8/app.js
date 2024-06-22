// Q1
let num = [10, 20, 30, 40, 5];
let ans = num.every((el) => el%10 == 0);
console.log(ans);

// Q2
let minimum = num.reduce((min , el) => {
    if(min < el) {
        return min;
    } else {
        return el;
    }
});
console.log(minimum);