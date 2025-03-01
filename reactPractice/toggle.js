


/*
import React from "react";
function Toggle() {
  const [toggle, setToggle] = React.useState(true);
  return (
    <button onClick={() => setToggle(!toggle)}
      style={{
        backgroundColor: toggle ? "green" : "red",
        color: "white",
        padding: "10px",
        cursor: "pointer",
      }}
    >{toggle ? "ON" : "OFF"}
      </button>
  );
}
export default Toggle;
*/
/*
import React from "react";
function Toggle() {
  const [visiblee, setVisibility] = React.useState(true);
  return (
    <div>
      <h2 style={{visibility: visiblee ? "visible" : "hidden"}
      }>Hello people!!!</h2>
      <button onClick={()=>setVisibility(!visiblee)}
        >{visiblee ? "Hide Text":"Show Text"}</button>
    </div>
  );
}

export default Toggle;
*/

import React from "react";

function Toggle() {
  const [isLoggedIn, setLoggedIn] = React.useState(false);
  
  return (
    <div>
    <h2>{isLoggedIn ? "Welcome, User!":"Please log in to continue." }</h2>

      <button onClick={() => setLoggedIn(!isLoggedIn)}> {isLoggedIn ? "Loged out" : "Login"}</button>
      </div>
  );
}

export default Toggle;