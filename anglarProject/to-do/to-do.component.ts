import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'app-to-do',
  standalone: false,
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.css']
})
export class ToDoComponent implements OnInit{
  tasks: { name: string; completed: boolean }[] = [];
  newTask = '';
  editingIndex: number | null = null;
  editedTask = '';
  constructor() { }
  ngOnInit(){
    this.loadTasks();
  }
    
  addTask() {
    if (this.newTask.trim()) {
      this.tasks.push({ name: this.newTask, completed: false });
      this.newTask = '';
      this.saveTasks();
    }
  }
  toggleComplete(index: number) {
    this.tasks[index].completed = !this.tasks[index].completed;
    this.saveTasks();
  }
  deleteTask(index:number) {
    this.tasks.splice(index, 1); 
    this.saveTasks();
  }
  
  saveTasks() {
    localStorage.setItem('tasks', JSON.stringify(this.tasks));
  }
  loadTasks() {
    const storedTasks = localStorage.getItem('tasks');
    if (storedTasks) {
      this.tasks = JSON.parse(storedTasks);
    }
  }
  startEditing(index: number) {
    this.editingIndex = index;
    this.editedTask = this.tasks[index].name;
  }
  saveEditedTask(index: number) {
    if (this.editedTask.trim()) {
      this.tasks[index].name = this.editedTask;
      this.editingIndex = null;
      this.saveTasks();
    }
  }
  cancleEdit() {
    this.editingIndex = null;
    
  }
}
