const mongoose = require("mongoose");

main()
  .then(() => {
    console.log("Connection Successful");
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/test");
}

const userSchema = new mongoose.Schema({
  name: String,
  email: String,
  age: Number,
});

const User = mongoose.model("User", userSchema);

//INSERT
// User.insertMany([
//     { name: "Tony", email: "tony@gmail.com", age: 50 },
//     { name: "Peter", email: "peter@gmail.com", age: 30 },
//     { name: "Bruce", email: "bruce@gmail.com", age: 47 },
// ]).then((res) => {
//     console.log(res);
// });

// const user1 = new User({
//   name: "Adam",
//   email: "adam@yahoo.in",
//   age: 48,
// });

// user1.save();

// const user2 = new User({
//   name: "Eve",
//   email: "eve@yahoo.in",
//   age: 45,
// });

// user2
//   .save()
//   .then((res) => {
//     console.log(res);
//   })
//   .catch((err) => {
//     console.log(err);
//   });

//FIND
// User.find({ age: { $gt: 47 } })
//   .then((res) => {
//     console.log(res);
//   })
//   .catch((err) => {
//     console.log(err);
//   });

//UPDATE
// User.updateMany({ age: { $gt: 47 } }, { age: 55 })
//   .then((res) => {
//     console.log(res);
//   })
//   .catch((err) => {
//     console.log(err);
//   });

//FIND AND UPDATE
// User.findOneAndUpdate({ name: "Bruce" }, { age: 42 }, { new: true })
//   .then((res) => {
//     console.log(res);
//   })
//   .catch((err) => {
//     console.log(err);
//   });

//DELETE
// User.deleteOne({ name: "Adam" }).then((res) => {
//   console.log(res);
// });

User.deleteMany({ age: { $exists: false } }).then((res) => {
  console.log(res);
});


