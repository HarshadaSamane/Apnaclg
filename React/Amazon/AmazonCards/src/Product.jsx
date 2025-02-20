import "./Product.css";
import Price from "./Price";

function Product({title, idx}) {
    let oldPrice = ["12,495", "11,900", "1,599", "599"];
    let newPrice = ["8,999", "9,199", "899", "278"];
    let discription = [["8,000 DPI" , "5 Programmable Buttons"], 
        ["Intuitive touch surface", "Designed for iPad Pro"], 
        ["Designed for iPad Pro", "Intuitive surface"], 
        ["Wireless Mouse 2.4GHz", "Optical Orientation"]
    ];
    return(
        <div className="Product">
            <h4>{title}</h4>
            <p>{discription[idx][0]}</p>
            <p>{discription[idx][1]}</p>
            <Price oldPrice={oldPrice[idx]} newPrice = {newPrice[idx]}/>
        </div>
    );
}

export default Product;