
import React from "react";
function ToDo() {
  const [tasks, setTasks] = React.useState([]);
  const [taskInput, setTaskInput] = React.useState("");
  const addTask = () => {
    if (taskInput.trim() !== "") {
      setTasks([...tasks, taskInput]);
      setTaskInput("");
    }
  };
  const removeTask = (taskIndex) => {
    setTasks(tasks.filter((_, index) => index !== taskIndex));
  };
  const clearAllTasks = () => {
    setTasks([]);
  };
  return (
    <div>
      <h2>To-Do List</h2>
      <input type="text" value={taskInput} onChange={(e) => setTaskInput(e.target.value)} placeholder="Enter Task" />
      <button onClick={addTask}>Add Task</button>
      <button onClick={clearAllTasks}>Clear All</button>
      <ul>
        {tasks.map((task, index) => (
          <li key={index}>{task}<button onClick={() => removeTask(index)}>Remove</button></li>
          
        ))}
      </ul>
      
    </div>
  );

}
export default ToDo;
