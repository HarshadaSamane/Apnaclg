function handleSubmit(event) {
    event.preventDefault();
    console.log("Your form is submitted");
}

export default function Form() {
    return(
        <form action="">
            <input type="text" placeholder="write your name"/>
            <button onClick={handleSubmit}>Submit</button>
        </form>
    );
}