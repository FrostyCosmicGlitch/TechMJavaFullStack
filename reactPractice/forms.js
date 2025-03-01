import React, {useState} from "react";
function Forms() {
  const [email, setEmail] = React.useState("");
  const [submittedEmail, setSubmitted] = React.useState(null);
  
  const handelClick = (e) => {
    e.preventDefault();
    setSubmitted(email);
    setEmail("");

  }

  return (
    <form onSubmit={handelClick}>
      <h2>My first inputing feature using react.Enter your email</h2>
      <input type="text"
        value={email}
        onChange={(e)=>setEmail(e.target.value)}
      />
      <button type="submit">Submit</button>
      {submittedEmail !== null && (
        <h2>
          {submittedEmail.trim() === "" ? "No email submitted yet." : `Submitted Email: ${submittedEmail}`}
        </h2>
      )}
    </form>
    
  );

}
export default Forms;