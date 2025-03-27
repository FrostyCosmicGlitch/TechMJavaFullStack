/*
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context){
    return MaterialApp(
      home:ListExample(),
    );
  }
}

class ListExample extends StatelessWidget {
  final List<String> items=["Apple","Banana","Cherry","Mango","Grapes","Papaya","Pine-Apple"];
  void _showDialog(BuildContext context,String item){
    showDialog(
      context: context,
      builder:(BuildContext context){
        return AlertDialog(
          title:Text("Item Clicked"),
          content:Text("You clicked on : $item"),
          actions:[
            TextButton(
            onPressed:(){
              Navigator.of(context).pop();
            },
            child:Text("OK"),
          ),
          ],
        );
      },
    );
  }



  @override
  Widget build(BuildContext context){
  return Scaffold(
    appBar:AppBar(title:Text("Fruit List")),
    body:ListView.builder(
      itemCount:items.length,
      itemBuilder:(context,index){
        return ListTile(
          leading:Icon(Icons.favorite),
          title:Text(items[index]),
          onTap: () {
            _showDialog(context, items[index]); 
          },
        );
      },
    ),
  );
  }
}
---------------------------

import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context){
    return MaterialApp(
      home:ListExample(),
    );
  }
}

class ListExample extends StatelessWidget {
  final List<String> items = [
    "Apple",
    "Banana",
    "Cherry",
    "Mango",
    "Grapes",
    "Papaya",
    "Pine-Apple"
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
    appBar:AppBar(title: Text("Fruit List")),
    body:ListView.builder(
      itemCount: items.length,
      itemBuilder: (context, index) {
        return ListTile(
          leading: Icon(Icons.food_bank),
          title: Text(items[index]),
          onTap:(){
        Navigator.push(
        context,
        MaterialPageRoute(
        builder: (context) =>DetailScreen(itemName:items[index]),
        ),
        );
        },
        );
      },
    ),
    );
  }
}


  class DetailScreen extends StatelessWidget {
    final String itemName;

    DetailScreen({required this.itemName});
  @override
  Widget build(BuildContext context){
  return Scaffold(
  appBar:AppBar(title:Text("Details")),
  body:Center(
  child:Column(mainAxisAlignment:MainAxisAlignment.center,
  children:[
    Text(
  "Selected Item:",
  style:TextStyle(fontSize:20,fontWeight:FontWeight.bold),
  ),
  Text(
  itemName,
  style:TextStyle(fontSize:24,color:Colors.blue),
  ),
  SizedBox(height:20),
  ElevatedButton(
  onPressed:(){
    Navigator.pop(context);
  },
  child:Text("Return to List"),
  ),
  ],
  ),
  -------------------
  */
import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context){
    return MaterialApp(
      home:ListExample(),
    );
  }
}

class ListExample extends StatelessWidget {
  final List<Map<String, String>> items = [
    {"name": "Apple", "image": "https://upload.wikimedia.org/wikipedia/commons/1/15/Red_Apple.jpg"},
    {"name": "Banana", "image": "https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg"},
    {"name": "Cherry", "image": "https://upload.wikimedia.org/wikipedia/commons/b/bb/Cherry_Stella444.jpg"},
    {"name": "Mango", "image": "https://upload.wikimedia.org/wikipedia/commons/9/90/Hapus_Mango.jpg"},
    {"name": "Grapes", "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Kyoho-grape.jpg/800px-Kyoho-grape.jpg"},
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Fruit List")),
      body: ListView.builder(
        itemCount: items.length,
        itemBuilder: (context, index) {
          return ListTile(
            leading: Image.network(items[index]["image"]!), // Display fruit image
            title: Text(items[index]["name"]!), // Display fruit name
            onTap: () {
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) => DetailScreen(
                    itemName: items[index]["name"]!,
                    itemImage: items[index]["image"]!, // Passing image URL
                  ),
                ),
              );
            },
          );
        },
      ),
    );
  }
}



class DetailScreen extends StatelessWidget {
  final String itemName;
  final String itemImage; // New: Image URL

  DetailScreen({required this.itemName, required this.itemImage});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Item Details")),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              "Selected Item:",
              style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
            ),
            SizedBox(height: 10),
            Image.network(
              itemImage, // Displaying the image
              height: 150, // Adjust size
            ),
            SizedBox(height: 10),
            Text(
              itemName,
              style: TextStyle(fontSize: 24, color: Colors.red),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.pop(context);
              },
              child: Text("Return to List"),
            ),
          ],
        ),
      ),
    );
  }
}

  ),
  );
  }
  }
