import { useState } from "react";

export default function Form() {

    let [fullName, setFullName] = useState("");
    let [userName, setUserName] = useState("");

    let handleNameChange = (event) => {
        setFullName(event.target.value);
    };

    let handleUserName = (event) => {
        setUserName(event.target.value);
    };

    return (
        <div>
            <form action="Submit">
                <label htmlFor="fullName">Full Name</label>
                <input type="text" placeholder="Enter your full name" value={fullName} onChange={handleNameChange} id="fullName" />
                <br /> <br />
                <label htmlFor="username">User Name</label>
                <input type="text" placeholder="Enter your User name" value={userName} onChange={handleUserName} id="username" />
                <br /> <br />
                <button>Submit</button>
            </form>
        </div>
    );
}