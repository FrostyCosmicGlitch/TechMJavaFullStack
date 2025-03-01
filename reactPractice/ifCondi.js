import React from "react";



function IfCondi({isLoggedIn}) {
  if (isLoggedIn) {
    return <h2>Welcome Back!</h2>
  }
  else {
    return <h2>Please Log in.</h2>
  }
}


function Greeting({ isLoggedIn }) {
  return <h2>{isLoggedIn ? "Welcome back!" : "Please log in."}</h2>;
}

function App() {
  return (
    <div> 
      <IfCondi isLoggedIn={true} />
      <Greeting isLoggedIn={true} />
    </div>
  ); 
}
export  default App;