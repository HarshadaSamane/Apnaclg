//Factory Function
// function PersonMaker(name, age) {
//     const person = {
//         name: name,
//         age: age,
//         talk() {
//             console.log(`Hi, My name is ${this.name}`);
//         },
//     };
//     return person;
// }


//Constructor - doesn't return anything & start with capital Letter
function Person(name, age) {
    this.name = name;
    this.age = age;
}

Person.prototype.talk = function() {
    console.log(`Hi, My name is ${this.name}`);
}

let p1 = new Person("adam", 25);
let p2 = new Person("eve", 24);