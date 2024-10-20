let chipsQuantity = 0;
let sodaQuantity = 0;
let cookiesQuantity = 0;

const chipsQtyElement = document.getElementById('chipsQuantity');
const sodaQtyElement = document.getElementById('sodaQuantity');
const cookiesQtyElement = document.getElementById('cookiesQuantity');

document.getElementById('addToCartChips').addEventListener('click', function(){
    chipsQuantity++;
    chipsQtyElement.textContent = chipsQuantity;
}); 

document.getElementById('addToCartSoda').addEventListener('click', function(){
    sodaQuantity++;
    sodaQtyElement.textContent = sodaQuantity;
}); 

document.getElementById('addToCartCookies').addEventListener('click', function(){
    cookiesQuantity++;
    cookiesQtyElement.textContent = cookiesQuantity;
}); 
