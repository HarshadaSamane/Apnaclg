let inp = document.querySelector("input");
inp.addEventListener ("mouseout", function() {
    console.log("MouseOut action occured");
});

inp.addEventListener("keypress", function() {
    console.log("Key Press action occured");
});


let scrollDiv = document.querySelector("#scrollDiv");

scrollDiv.addEventListener("scroll", function() {
    console.log("Scroll action occured");
});

window.addEventListener("load", function() {
    console.log("Page has fully loaded");
});