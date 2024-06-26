function saveToDb(data) { 
    return new Promise ((resolve, reject) => {
       let internetSpeed = Math.floor(Math.random() * 10) + 1; 
       if (internetSpeed > 4) {
        resolve("success: Data Saved Successfully");
       } else {
        reject('Error: Internet connection is too slow');
       }
    })
}

// saveToDb("apna College")   
//     .then(() => {
//         console.log("Data1 Saved. promise was resolved");
//         saveToDb("Hello World").then(() => {
//             console.log("data2 saved");
//         })
//     })
//     .catch(() => {
//         console.log("promise was rejected");
//     });


saveToDb("apna College")   
    .then(() => {
        console.log("Data1 Saved. promise was resolved");
        return saveToDb("Hello World")
    })
    .then(() => { 
        console.log("data2 saved");
    })
    .catch(() => {
        console.log("promise was rejected");
    });

