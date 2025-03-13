import 'package:flutter/material.dart';
import 'package:sqflite/sqflite.dart';
import 'package:path/path.dart';

void main() {
runApp(MyApp());
}

class MyApp extends StatelessWidget {
@override
Widget build(BuildContext context) {
return MaterialApp(
title: 'Task Manager',
theme: ThemeData(primarySwatch: Colors.blue),
home: TaskListScreen(),
);
}
}

class TaskListScreen extends StatefulWidget {
@override
_TaskListScreenState createState() => _TaskListScreenState();
}

class _TaskListScreenState extends State<TaskListScreen> {
List<Map<String, dynamic>> _tasks = [];
Database? _database;

@override
void initState() {
super.initState();
_initDatabase();
}

Future<void> _initDatabase() async {
final path = join(await getDatabasesPath(), 'tasks.db');
print("Database Path: $path");

    _database = await openDatabase(
      path,
      version: 1,
      onCreate: (db, version) {
        print("Creating Database...");
        return db.execute(
          'CREATE TABLE tasks(id INTEGER PRIMARY KEY, title TEXT)',
        );
      },
    );

    print("Database initialized.");
    _loadTasks();
}

Future<void> _loadTasks() async {
if (_database == null) {
print("Error: Database not initialized!");
return;
}

    final List<Map<String, dynamic>> tasks = await _database!.query('tasks');
    print("Loaded tasks: $tasks");

    setState(() {
      _tasks = tasks;
    });
}

Future<void> _addTask(String title) async {
print("Adding task: $title");

    await _database!.insert(
      'tasks',
      {'title': title},
      conflictAlgorithm: ConflictAlgorithm.replace,
    );

    print("Task Added!");
    await _loadTasks();
}

Future<void> _deleteTask(int id) async {
await _database!.delete('tasks', where: 'id = ?', whereArgs: [id]);
_loadTasks();
}

@override
Widget build(BuildContext context) {
return Scaffold(
appBar: AppBar(title: Text('Task Manager')),
body: ListView.builder(
itemCount: _tasks.length,
itemBuilder: (context, index) {
return ListTile(
title: Text(_tasks[index]['title']),
trailing: IconButton(
icon: Icon(Icons.delete),
onPressed: () => _deleteTask(_tasks[index]['id']),
),
);
},
),
floatingActionButton: FloatingActionButton(
child: Icon(Icons.add),
onPressed: () async {
final title = await Navigator.push(
context,
MaterialPageRoute(builder: (context) => AddTaskScreen()),
);
if (title != null) await _addTask(title);
},
),
);
}
}

class AddTaskScreen extends StatefulWidget {
@override
_AddTaskScreenState createState() => _AddTaskScreenState();
}

class _AddTaskScreenState extends State<AddTaskScreen> {
final _formKey = GlobalKey<FormState>();
String _title = '';

@override
Widget build(BuildContext context) {
return Scaffold(
appBar: AppBar(title: Text('Add Task')),
body: Padding(
padding: EdgeInsets.all(16.0),
child: Form(
key: _formKey,
child: Column(
children: [
TextFormField(
decoration: InputDecoration(labelText: 'Task Title'),
validator: (value) => value!.isEmpty ? 'Enter a task title' : null,
onSaved: (value) => _title = value!,
),
SizedBox(height: 20),
ElevatedButton(
child: Text('Add Task'),
onPressed: () {
if (_formKey.currentState!.validate()) {
_formKey.currentState!.save();
Navigator.pop(context, _title);
}
},
),
],
),
),
),
);
}
}

