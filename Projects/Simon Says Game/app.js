let gameSeq = [];
let userSeq = [];

let btns = ["red", "yellow", "blue", "green"];

h2 = document.querySelector("h2");

let started = false;
let level = 0;

let highestScore = 0;

document.addEventListener("keypress", function () {
    if(started == false) {
        console.log("Game is Started!")
        started = true;
    }

    levelUp();
});

function gameFlash (btn) {
    btn.classList.add("flash");
    setTimeout(function ()  {
        btn.classList.remove("flash");
    }, 250);
}

function userFlash (btn) {
    btn.classList.add("userflash");
    setTimeout(function ()  {
        btn.classList.remove("userflash");
    }, 250);
}

function levelUp () {
    userSeq = [];
    level++;
    h2.innerText = `Level ${level}`;

    let randomIdx = Math.floor(Math.random() * 3);                                                 
    let randomColor = btns[randomIdx];
    let randomBtn = document.querySelector(`.${randomColor}`);
    // console.log(randomBtn);
    // console.log(randomColor);
    // console.log(randomIdx);

    gameSeq.push(randomColor);
    console.log(gameSeq);
    
    gameFlash(randomBtn);
}

function checkAns (idx) {
    // console.log("current level: ",level);

    if( userSeq[idx] === gameSeq[idx] ) {
        if( userSeq.length == gameSeq.length ) {
            setTimeout(levelUp, 1000);
        }
    } else {
        if(level > highestScore) {
            highestScore = level;
        }
        h2.innerHTML = `Game Over! Your score was <b>${level}</b> </br> Highest score: <b>${highestScore}</b> <br>Press any key to start.`;
        document.querySelector("body").style.backgroundColor = "red";
        setTimeout ( function () {
            document.querySelector("body").style.backgroundColor = "white";
        },150);
        reset();
    }
}

function btnPress () {
    // console.log(this);
    let btn = this;
    userFlash(btn);

    userColor = btn.getAttribute("id");
    // console.log(userColor);
    userSeq.push(userColor);

    checkAns(userSeq.length-1);
}

let allBtns = document.querySelectorAll(".btn");
for (btn of allBtns) {
    btn.addEventListener("click", btnPress); 
}

function reset() {
    started = false;
    gameSeq = [];
    userSeq = [];
    level = 0;
}