
// Que 1
let num = 35;
let arr = [34, 67, 89, 40 ,5, 19];

function largerNum (arr, num) {
    for (let i = 0; i < arr.length; i++) { 
        if (arr[i] > num) {
            console.log(arr[i]);
        }
    }
}

largerNum(arr, num);


// Que 2
let str1 = "abcdabcdefgggh";

function extractUnique(str1) {
    let uniqueStr = "";
    for(let i=0; i<str1.length; i++) {
        let char = str1[i];
        if(uniqueStr.indexOf(char) == -1) {
            uniqueStr += char;
        }
    }
    return uniqueStr;
}

extractUnique(str1);


// Que 3
let country = ["Australia","Germany","United States of America"];

function longestCoutry (country) {
    let longestCountry = country[0];
    for (let i=0; i<country.length; i++) {
        if(country[i].length > longestCountry.length) {
            longestCountry = country[i];
        }
    }
    return longestCountry;
}

longestCoutry(country);


// Que 4
let string = "harshada";
let char = "";

function getVowels (string) {
    let vowels = "aeiou";
    let count = 0;
    for (let i=0; i<string.length; i++) {
        let char = string[i].toLowerCase();
        if(vowels.indexOf(char) != -1) {
            count++;

        }
    }
    return count;
}

getVowels(string);

// OR
let str = "harshada";
function countVowels (str) {
    let count = 0;
    for (let i=0; i<str.length; i++) {
        if (
            str.charAt (i) == "a" ||
            str.charAt (i) == "e" ||
            str.charAt (i) == "i" ||
            str.charAt (i) == "o" ||
            str.charAt (i) == "u" 
        ) {
            count++;
        }
    }
    return count;
}
countVowels(str);


// Que 5
let start = 10;
let end = 20;

function generateRandom (start, end) {
    return Math.floor(Math.random() * (end - start + 1)) + start;
}

generateRandom(start, end);