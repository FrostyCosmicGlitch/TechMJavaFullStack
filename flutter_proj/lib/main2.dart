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
  String _displayText="";
  void _showText() {
    setState(() {
      _displayText = _controller.text;
    });
  }

  @override
  Widget build(BuildContext context){
    return Scaffold(
      appBar: AppBar(title:Text("Text Input Example")),
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
              onPressed: _showText, 
              child: Text("Submit"),
            ),
        SizedBox(height: 20),
        Text(
          "You entered: $_displayText",
          style: TextStyle(fontSize: 18),

        ),
      ],
        ),

      ),
    );
  }
}
