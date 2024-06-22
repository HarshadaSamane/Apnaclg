let max = prompt("Enter the max number");

let random = Math.floor(Math.random() * max) + 1 ;

let guess = prompt("Guess a number");

while(true) {
    if(guess == "quit") {
        console.log("You quit");
        break;
    }

    if(guess == random) {
        console.log("yes you are right! congrats!! the random number was", random);
        break;
    } else if(guess < random) {
        guess = prompt("hint:Your guess is too small. Try again");
    } else {
        guess = prompt("hint:Your guess is too big. Try again");
    }
}