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
