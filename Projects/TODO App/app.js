let todo = [];

let req = prompt("Enter your request");
console.log(req);

while(true) {
    if(req == "quit") {
        console.log("quitting the app")
        break;
    }

    if(req == "list") {
        console.log("------------");
        for(let i=0; i<todo.length; i++) {
            console.log(i, todo[i]);
        }
        console.log("------------");
    } else if(req == "add") {
        let task = prompt("Enter your task");
        todo.push(task);
        console.log("Task added");
    } else if (req == "delete") {
        let idx = prompt("enter the index of task you want to detele"); 
        todo.splice(idx , 1);
        console.log("Task deleted");
    } else {
        console.log("Wrong request");
    }

    req = prompt("Enter your request");
}