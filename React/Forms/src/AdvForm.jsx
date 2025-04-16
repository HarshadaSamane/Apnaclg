import { useState } from "react";

export default function AdvForm() {

    let [formData, setFormData] = useState({
        fullName: "",
        userName: "",
        password: ""
    })

    let handleInputChange = (event) => {
        let fieldName = event.target.name;
        let newValue = event.target.value;

        setFormData((CurrData) => {
            return { ...CurrData, [fieldName]: newValue };
        });
    };

    let handleSubmit = (event) => {
        event.preventDefault();
        console.log(formData);
        setFormData({
            fullName: "",
            userName: "",
            password: ""
        });
    }

    return (
        <div>
            <form action="Submit" onSubmit={handleSubmit}>
                <label htmlFor="fullName">Full Name</label>
                <input type="text" placeholder="Enter your full name" value={formData.fullName} id="fullName" name="fullName"
                    onChange={handleInputChange} />
                <br /> <br />
                <label htmlFor="username">User Name</label>
                <input type="text" placeholder="Enter your User name" value={formData.userName} id="username" name="userName"
                    onChange={handleInputChange} />
                <br /> <br />
                <label htmlFor="password">Password</label>
                <input type="password" placeholder="Enter your Pasword" value={formData.password} id="password" name="password"
                    onChange={handleInputChange} />
                <br /> <br />
                <button>Submit</button>
            </form>
        </div>
    );
}