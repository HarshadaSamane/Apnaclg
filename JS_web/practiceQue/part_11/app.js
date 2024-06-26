
// Que 1
// function one () {
//     return 1;
// }

// function two () {
//     return one() + one();
// }

// function three () {
//     let ans = two () + one ();
//     console.log(ans);
// }

// three();



// Que 2

h1 = document.querySelector("h1");


// function changeColor ( color, delay, nextColorChange ) {
//     setTimeout(() => {
//         h1.style.color = color;
//         if (nextColorChange) nextColorChange();
//     }, delay);
// }

// changeColor ("red", 1000, () => {
//     changeColor ("blue", 1000, () => {
//         changeColor ("green", 1000);
//     });
// });


// Using promise

function changeColor (color, delay) {
    return new Promise( (resolve, reject) => {
        setTimeout ( () => {
            let num = Math.floor(Math.random() * 5) + 1;
            if(num > 3) {
                reject("Promise rejected");
            }
            h1.style.color = color;
            resolve("Color changed");
        },delay);
    });
}

// changeColor("red", 1000)
// .then( ()=> {
//     console.log("Red color completed");
//     return changeColor("blue", 1000);
// })
// .then( () => {
//     console.log("Blue color completed");
//     return changeColor("green", 1000);
// })
// .then ( () => {
//     console.log("Green color completed");
// })



// Using Await 

async function demo () { 
    try {
        await changeColor("red", 1000);
        await changeColor("blue", 1000);
        changeColor("green", 1000);    
    } catch (err) {
        console.log("Error caught");
        console.log(err);
    }
    
    let a=5;
    console.log(a);
}





// Que 3

// function saveToDb ( data, success, failure ) {
//     let internetSpeed = Math.floor(Math.random() * 10) + 1;
//     if (internetSpeed > 4) {
//         success();
//     } else {
//         failure();
//     }
// }

// saveToDb( 
//     "Apna College", 
//     () => {
//     console.log("Success: your data is saved");
//     saveToDb("Hello World", () => {
//         console.log("Success2: data2 is saved");
//     }, () => {
//         console.log("Failure2: Weak connection");
//     })
//     }, 
//     () => {
//     console.log("Failure: your data is not saved");
// });