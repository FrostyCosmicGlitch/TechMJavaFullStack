import React from "react";
function Button({ handleClick }) {
  const [clicked, setClicked] = React.useState(false);
  return (
    < button onClick={() => {
      handleClick();
      setClicked(true);
    }}
    disabled={ clicked}
    >{clicked ? "Clicked!" : "Click me"}</button>
  );
  
}

function Click() {
  const showAlert = () => {
    alert("You have clicked a magic button");
  };

  return <Button handleClick={showAlert} />;
}
export default Click;