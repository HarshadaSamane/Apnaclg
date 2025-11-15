const express = require("express");
const app = express();

// app.use((req, res, next) => {
//   //   let { query } = req.query;
//   //   console.log(query);
//   console.log("Hi I am a Middleware");
//   //   res.send("Middleware finished");
//   next();
// });

const checkToken = (req, res, next) => {
  let { token } = req.query;
  if (token === "giveaccess") {
    next();
  }
  res.send("ACCESS DENIED!");
};

app.get("/api", checkToken, (req, res) => {
  res.send("data");
});

app.get("/", (req, res) => {
  res.send("Hi, I am root");
});

app.get("/random", (req, res) => {
  res.send("This is a rendom page");
});

//Logger
// app.use((req, res, next) => {
//     req.time = new Date(Date.now()).toString();
//   console.log(req.method, req.hostname, req.path, req.time);
//   next();
// });

//404
app.use((req, res) => {
  res.send("Page not found!");
});

app.listen(8080, () => {
  console.log("Server listening to port 8080");
});
