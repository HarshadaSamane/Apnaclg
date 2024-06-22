// let heros = [
//     ["ironman", "spiderman", "thor"],
//     ["superman", "wonder women", "flash"]
// ]

// for(let i=0; i<heros.length; i++) {
//     console.log(i,heros[i], heros[i].length);
//     for(let j=0; j<heros[i].length; j++) {
//         console.log(`j=${j}, ${heros[i][j]}`);
//     }
// }

// let fruits = ["mango", "banana", "orange", "apple", "litchi"]

// for(fruit of fruits) {
//     console.log(fruit);
// }

let heros =  [
        ["ironman", "spiderman", "thor"],
        ["superman", "wonder women", "flash"]
    ]

for(list of heros) {
    for(name of list) {
        console.log(name);
    }
}