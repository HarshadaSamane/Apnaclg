import "./Product.css";
// function Product(props) {
//     console.log(props);
//     return (
//         <div>
//             <h3>{props.title}</h3>
//             <h5>Product Discription</h5>
//         </div>
//     );
// }

//OR
function Product({title, price, features}) {
    // const list = features.map((feature) => <li>{feature}</li>);
    let styles = {backgroundColor : price > 30000 ?  "yellow" : ""} ;
        return (
            <div className="Product" style = {styles}>
                <h3>{title}</h3>
                <h5>Price : {price}</h5>
                {price > 30000 ? <p>"Discount of 5%"</p> : null}
                
                
                {/* <p>{price > 30000 ? "Discount of 5%" : ""}</p> */}
                {/* <p>{list}</p> */}
                {/* <p>{features.map((feature) => <li>{feature}</li>)}</p> */}
                {/* <p>{features2.a}</p> */}
            </div>
        );

    
}

export default Product;