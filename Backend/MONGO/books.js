const mongoose = require("mongoose");

main()
  .then(() => {
    console.log("Connection Successful");
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/amazon");
}

//SCHEMA
const bookSchema = new mongoose.Schema({
  title: {
    type: String,
    required: true,
    maxLength: 20,
  },
  author: {
    type: String,
  },
  price: {
    type: Number,
    min: [1, "Price is too low for Amazon selling"],
  },
  discount: {
    type: Number,
    default: 0,
  },
  category: {
    type: String,
    enum: ["fictional", "non-fictional"],
  },
  genre: [String],
});

//MODEL
const Book = mongoose.model("Book", bookSchema);

Book.findByIdAndUpdate("68e4e85e2c2afd9af14fcc7b", {price: -100}, {runValidators: true})
  .then((res) => {
    console.log(res);
  })
  .catch((err) => {
    console.log(err);
  });

// let book1 = new Book({
//   title: "Marvel Comics v2",
//   price: 600,
//   category: "fictional",
//   genre: ["comics", "superheroes", "Avengers"]
// });
// book1.save().then((res) => {
//   console.log(res);
// }).catch((err) => {
//   console.log(err);
// })
