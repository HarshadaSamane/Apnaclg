const favMovie = "Harry";

let guess = prompt("Guess my favourite movie");


while ( (guess != favMovie) && (guess != "quit") ) {
    guess = prompt("Wrong guess. Try again");
}

if(guess === favMovie) {
    console.log("Congrats!!");
} else {
    console.log("Thanks for playing");
}