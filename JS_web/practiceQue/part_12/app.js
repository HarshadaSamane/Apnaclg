
// // async
// async function greet () {
//     return "Hello!";
// }

// let arrow = async () => {
//     return 5;
// };


// Await 
function getNum () {
    return new Promise((resolve, rejecte) => {
       setTimeout(() => {
        let num = Math.floor(Math.random() * 10) + 1;
        console.log(num);
        resolve(); 
       }, 1000)
    });
}

async function demo () {
    await getNum();
    await getNum();
    getNum();
}