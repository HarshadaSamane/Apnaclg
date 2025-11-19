//One to few Relation  Approach 2
const mongoose = require("mongoose");
const { Schema } = mongoose;

main()
  .then(() => console.log("Connection SUccessful!"))
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/relationDemo");
}

const orderSchema = new Schema({
  item: String,
  price: Number,
});

const customerSchema = new Schema({
  name: String,
  orders: [
    {
      type: Schema.Types.ObjectId,
      ref: "Order",
    },
  ],
});

// customerSchema.pre("findOneAndDelete", async () => {
//   console.log("PRE MIDDLEWARE");
// });

customerSchema.post("findOneAndDelete", async (customer) => {
  if (customer.orders.length) {
    let res = await Order.deleteMany({ _id: { $in: customer.orders } });
    console.log(res);
  }
});

const Order = mongoose.model("Order", orderSchema);
const Customer = mongoose.model("Customer", customerSchema);

const findCustomer = async () => {
  let result = await Customer.find({}).populate("orders");
  //console.log(result[0]);
};

findCustomer();

// const addOrders = async () => {
//   let res = await Order.insertMany([
//     { item: "Samosa", price: 20 },
//     { item: "Chips", price: 10 },
//     { item: "Chocolate", price: 40 }
//   ]);
//   console.log(res);
// };

// addOrders();

//ADD Customer
const addCust = async () => {
  let newCust = new Customer({
    name: "Arjun",
  });

  let newOrder = new Order({
    item: "Burger",
    price: 100,
  });

  newCust.orders.push(newOrder);

  await newOrder.save();
  await newCust.save();

  console.log("Added new customer");
};

//DELETE CUSTOMER
const delCust = async () => {
  let data = await Customer.findByIdAndDelete('691c2d2d52b2ff3ec7172d81');
  console.log(data);
};

//addCust();
delCust();
