import React from 'react'
function Counter() {
  const [count, setCount] = React.useState(5);
  
    return (
        <div>
            <h2>Count: {count}</h2>
            <button onClick={() => setCount(count + 1)}>Increase</button>
            <br />
            <button onClick={() => setCount(count - 1)}>Decrease</button>
        </div>
    );

}
export default Counter;
