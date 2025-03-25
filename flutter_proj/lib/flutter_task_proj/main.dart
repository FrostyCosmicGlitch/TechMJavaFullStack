import 'package:flutter/material.dart';
import 'package:flutter_localizations/flutter_localizations.dart';
import 'localization/app_localizations.dart';
import 'package:firebase_core/firebase_core.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp();
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  Locale _currentLocale = Locale('en', 'US'); // Initial language (English)

  // Function to change language
  void changeLanguage(Locale locale) {
    setState(() {
      _currentLocale = locale;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      locale: _currentLocale, // Set the app's locale dynamically
      debugShowCheckedModeBanner: false,
      title: 'Travel Companion',
      theme: ThemeData(primarySwatch: Colors.blue),
      supportedLocales: [
        Locale('en', 'US'),
        Locale('es', 'ES'),
        Locale('fr', 'FR'),
      ],
      localizationsDelegates: [
        AppLocalizations.delegate,
        GlobalMaterialLocalizations.delegate,
        GlobalWidgetsLocalizations.delegate,
        GlobalCupertinoLocalizations.delegate,
      ],
      home: HomeScreen(
        changeLanguage: changeLanguage, // Pass language change function
      ),
    );
  }
}

class HomeScreen extends StatefulWidget {
  final Function(Locale) changeLanguage;

  HomeScreen({required this.changeLanguage});

  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  List<Map<String, String>> trips = [];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(AppLocalizations.of(context).translate('home_title')),
        actions: [
          PopupMenuButton<Locale>(
            onSelected: widget.changeLanguage,
            itemBuilder: (BuildContext context) {
              return [
                PopupMenuItem(
                  value: Locale('en', 'US'),
                  child: Text('English'),
                ),
                PopupMenuItem(
                  value: Locale('es', 'ES'),
                  child: Text('Español'),
                ),
                PopupMenuItem(
                  value: Locale('fr', 'FR'),
                  child: Text('Français'),
                ),
              ];
            },
          ),
        ],
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.start,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Padding(
              padding: const EdgeInsets.all(16.0),
              child: Text(
                AppLocalizations.of(context).translate('trips_heading'),
                style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
              ),
            ),
            trips.isEmpty
                ? Padding(
                  padding: const EdgeInsets.all(16.0),
                  child: Text(
                    AppLocalizations.of(context).translate('no_trip_planned'),
                    style: TextStyle(fontSize: 16, color: Colors.grey),
                  ),
                )
                : Padding(
                  padding: const EdgeInsets.all(16.0),
                  child: Column(
                    children:
                        trips.map((trip) {
                          return Card(
                            margin: EdgeInsets.symmetric(vertical: 8.0),
                            child: ListTile(
                              title: Text(trip['name'] ?? ''),
                              subtitle: Text(trip['date'] ?? ''),
                            ),
                          );
                        }).toList(),
                  ),
                ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () async {
                final tripDetails = await Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => TripPlannerScreen()),
                );

                if (tripDetails != null) {
                  setState(() {
                    trips.add({
                      'name': tripDetails['name'], // trip name
                      'date': tripDetails['date'], // trip date
                    });
                  });
                }
              },
              child: Text(AppLocalizations.of(context).translate('plan_trip')),
            ),
          ],
        ),
      ),
    );
  }
}

class TripPlannerScreen extends StatelessWidget {
  final TextEditingController tripNameController = TextEditingController();
  final TextEditingController tripDateController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(AppLocalizations.of(context).translate('trip_planner')),
      ),
      body: Padding(
        padding: EdgeInsets.all(16.0),
        child: Column(
          children: [
            TextField(
              controller: tripNameController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).translate('trip_name'),
              ),
            ),
            SizedBox(height: 20),
            TextField(
              controller: tripDateController,
              decoration: InputDecoration(
                labelText: AppLocalizations.of(context).translate('trip_date'),
              ),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                final tripDetails = {
                  'name': tripNameController.text,
                  'date': tripDateController.text,
                };

                Navigator.pop(context, tripDetails); // Return the trip details
              },
              child: Text(AppLocalizations.of(context).translate('save_trip')),
            ),
          ],
        ),
      ),
    );
  }
}
