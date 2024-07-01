const express = require("express");
const app = express();

let port = 3000;

app.listen(port, () => {
    console.log(`Server running on port ${port}`);
});

app.use((req, res) => {
    console.log("Request received");
});