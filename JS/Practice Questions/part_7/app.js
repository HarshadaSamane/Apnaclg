// Q1
const square = (n) => (n*n);
console.log(square(6));

// Q2
let id = setInterval (()=> {
    console.log("Hello World");
}, 2000);

setTimeout ( () => {
    clearInterval(id);
    console.log("Clear interval ran");
}, 10000);