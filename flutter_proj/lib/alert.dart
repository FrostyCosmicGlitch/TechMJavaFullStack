import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context){
    return MaterialApp(
      home:MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  @override
  State<MyHomePage> createState()=> _MyHomePageState();
}
class _MyHomePageState extends State<MyHomePage>{
  TextEditingController _controller = TextEditingController();

  void _showDialog(){
    String inputText=_controller.text;
    showDialog(
      context:context,
      builder:(BuildContext context){
        return AlertDialog(
          title:Text("Your Input"),
          content:Text(inputText),
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
      appBar: AppBar(title:Text("Alert Dialog Example")),
      body:Padding(
        padding:EdgeInsets.all(16),
        child:Column(
          children: [
            TextField(
              controller: _controller,
              decoration: InputDecoration(
                labelText: "Enter text",
                border: OutlineInputBorder(),
              ),
            ),
            SizedBox(height: 20), 
            ElevatedButton(
              onPressed: _showDialog, 
              child: Text("Submit"),
            ),
          ],
        ),

      ),
    );
  }
}
