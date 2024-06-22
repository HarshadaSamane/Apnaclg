// Q1
function printPoem() {
    console.log("Twinkle Twinkle, little Star");
    console.log("how I wonder what you are");
}

printPoem();


// Q2
function rollDice() {
    let randomNum = Math.floor(Math.random() * 6) + 1;
    console.log(randomNum);
}

rollDice();


// Q3
function calAvg( a, b, c ) {
    let avg = (a+b+c)/3 ;
    console.log(avg);
}

calAvg(2,4,6);


// Q4
function table(n) {
    for (let i = 1; i <= 10; i++) {
        console.log(`${n} x ${i} = ${n * i}`);
    }
}

table(5);

// OR
function printTable(n) {
    for(let i=n; i<=n*10; i+=n) {
        console.log(i);
    }
}

printTable(7);


// Q5

function retSum(n) {
    let sum = 0;
    for (let i=1; i<=n; i++) {
        sum = sum + i ;
    }
    return sum ;
}
console.log(retSum(5));


// Q6
let str = ["hi", "hello", "bye", "!"];

function concat(str) {
    let result = "";
    for(i=0; i<str.length; i++) {
        result += str[i];
    }
    return result;
}


// Odd or even Test




function oddOrEven (request) {
    if(request == "odd") {
        return function(n) {
            console.log(!(n%2 == 0 ));
        }

    } else if (request == "even") {
        return function(n) {
            console.log(n%2 == 0) ;
        }

    } else {
        console.log("Invalid request");
    }   
}

let request = "odd"  //even

// Methods
const calculater = {
    num : 55,
    add : function(a,b) {
        return a+b ;
    },
    sub : function(a,b) {
        return a-b ;
    },
    mul : function(a,b) {
        return a*b ;
    }

};

// OR
const calculate = {
    
    add (a,b) {
        return a+b ;
    },
    sub (a,b) {
        return a-b ;
    },
    mul (a,b) {
        return a*b ;
    }

};