
import React from "react";
function Profile() {
  const [name, setName] = React.useState("John");
  const [city, setCity] = React.useState("New York");
  return (
    <div>
      <h2>User Profile</h2>
      <h2>Name: {name}</h2>
      <button onClick={()=> setName("Alice")}>Change Name</button>
      <h2>City: {city}</h2>
      <button onClick={() => setCity("Los Angeles")}>Change City</button>
    </div>
  );
}
export default Profile;