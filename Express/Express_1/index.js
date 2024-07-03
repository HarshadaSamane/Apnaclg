const express = require("express");
const app = express();

let port = 3000;

app.listen(port, () => {
  console.log(`Server running on port ${port}`);
});

app.get("/", (req, res) => {
  res.send("This is a root path");
});

// QUERY STRING
app.get("/search", (req, res) => {
  console.log(req.query);
  res.send("no results");
});

// PATH PARAMETERS
app.get("/:username", (req, res) => {
  // console.log(req.params);
  // console.log("Hello, I am root");
  let { username } = req.params;
  let htmlStr = `<h1>Welcome to the page, @${username}</h1>`;
  res.send(htmlStr);
  console.log(htmlStr);
});

// app.get("/apple", ( req, res ) => {
//     res.send("Contacted to apple path");
// });

// app.get("*", (req, res) =>{
//     res.send("This path does not exist");
// });

// app.post("/", (req,res) => {
//     res.send("You sent a post request to root");
// });

// app.use((req, res) => {
//     // console.log(req);
//     console.log("Request received");
//     res.send( {
//         name: "Apple",
//         color: "Red",
//     });
// });
