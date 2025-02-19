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
        return (
            <div>
                <h3>{title}</h3>
                <h5>Price : {price}</h5>
                <p>{price > 30000 ? "Discount of 5%" : ""}</p>
                {/* <p>{list}</p> */}
                {/* <p>{features.map((feature) => <li>{feature}</li>)}</p> */}
                {/* <p>{features2.a}</p> */}
            </div>
        );

    
}

export default Product;