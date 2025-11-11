const express = require("express");
const app = express();
const mongoose = require("mongoose");
const path = require("path");
//Requiring the CHat Model
const Chat = require("./models/chat.js");
app.set("views", path.join(__dirname, "views"));
app.set("view engine", "ejs");
//USE CSS FILE
app.use(express.static(path.join(__dirname, "public")));
//To Parse the data
app.use(express.urlencoded({ extended: true }));
//Use Method Override
const methodOverride = require("method-override");
app.use(methodOverride("_method"));

main()
  .then(() => {
    console.log("Connection Successful");
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/whatsapp");
}

//INDEX ROUTE
app.get("/chats", async (req, res) => {
  let chats = await Chat.find();
  console.log(chats);
  res.render("index.ejs", { chats });
});

//NEW ROUTE
app.get("/chats/new", (req, res) => {
  res.render("new.ejs");
});

//CREATE ROUTE
app.post("/chats", (req, res) => {
  let { from, msg, to } = req.body;

  let newChat = new Chat({
    from: from,
    to: to,
    msg: msg,
    created_at: new Date(),
  });

  //Save the new chat
  newChat
    .save()
    .then((res) => {
      console.log("Chat saved");
    })
    .catch((err) => {
      console.log(err);
    });
  res.redirect("/chats");
});

//EDIT ROUTE
app.get("/chats/:id/edit", async (req, res) => {
  let { id } = req.params;
  let chat = await Chat.findById(id);
  res.render("edit.ejs", { chat });
});

//UPDATE ROUTE
app.put("/chats/:id", async (req, res) => {
  let { id } = req.params;
  let { msg: newMsg } = req.body;
  let updatedChat = await Chat.findByIdAndUpdate(
    id,
    { msg: newMsg },
    { runValidators: true, new: true }
  );
  console.log(updatedChat);
  res.redirect("/chats");
});

//DESTROY ROUTE
app.delete("/chats/:id", async (req, res) => {
  let { id } = req.params;
  let deletedChat = await Chat.findByIdAndDelete(id);
  console.log(deletedChat);
  res.redirect("/chats");
});

app.get("/", (req, res) => {
  res.send("Root is working");
});

app.listen(8080, () => {
  console.log("Server is listening on port 8080");
});
