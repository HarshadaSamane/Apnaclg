import Product from "./Product.jsx";

function ProductTab() {
    // let options = ["hi-tech", "durable", "fast"];
    // let options2 = { a: "hi-tech", b: "durable", c: "fast" };
    return (
        <div>
            <Product title = "Phone" price = {30000} />
            {/* <Product title = "Phone" price = {30000} features = {options} /> */}
            <Product title = "Laptop" price = {60000}/>
            <Product title = "tab" price = {45000}/>
        </div>
    );
}

export default ProductTab;