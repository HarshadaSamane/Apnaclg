import { use, useState } from "react";
import { useFormik } from 'formik';

const validate = values => {
    const errors = {};
    if (!values.username) {
      errors.username = 'username cannot be empty';
    } 

    return errors;
};

export default function CommentsForm({ addNewComment }) {

    // let [formData, setFormData] = useState({
    //     username: "",
    //     remark: "",
    //     rating: 5
    // });

    const formik = useFormik({
        initialValues :{
            username: "",
            remark : "",
            rating : 5,
        },
        validate,
        onSubmit : values => {
            alert(JSON.stringify(values, null, 2));
        },
    });

    // let handleInputChange = (event) => {
    //     setFormData((currData) => {
    //         return { ...currData, [event.target.name]: event.target.value };
    //     });
    // }

    // let handleSubmit = () => {
    //     console.log(formData);
    //     addNewComment(formData);
    //     event.preventDefault();

    //     setFormData({
    //         username: "",
    //         remark: "",
    //         rating: 5
    //     });
    // }

    return (
        <div>
            <h4>Give a Comment!</h4>
            <form onSubmit={formik.handleSubmit}>

                <label htmlFor="username">User Name</label>
                <input type="text" placeholder="username" value={formik.values.username} onChange={formik.handleChange} id="username" name="username" /> 
                {formik.errors.username ? <p style = {{color : "red"}}>{formik.errors.username}</p> : null}
                <br /><br />

                <label htmlFor="remark">Remarks</label>
                <textarea value={formik.values.remark} placeholder="Enter few Remarks" onChange={formik.handleChange} id="remark" name="remark"></textarea> <br /> <br />

                <label htmlFor="rating">Rating</label>
                <input type="number" placeholder="remark" min={1} max={5} value={formik.values.rating} onChange={formik.handleChange} id="rating" name="rating" /> <br /> <br />

                <button>Add Comment</button>
            </form>
        </div>
    );
}