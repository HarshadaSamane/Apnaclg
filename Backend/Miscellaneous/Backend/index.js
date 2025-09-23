const express = require("express");
const app = express();
const port = 8080;

app.get("/register", (req, res) => {
    res.send("Standard GET Response");
});

app.post("/register", (req, res) => {
    res.send("Standard POST Response");
});

app.listen(port, ()=> {
    console.log(`listning to port ${port}`);
});