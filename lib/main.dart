import 'package:flutter/material.dart';
import 'spyne_bridge.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: const Text('Spyne SDK Integration')),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              ElevatedButton(
                onPressed: () => SpyneBridge.startCatalogShoot(),
                child: const Text('Start Catalog Shoot'),
              ),
              const SizedBox(height: 20),
              ElevatedButton(
                onPressed: () => SpyneBridge.start360VideoShoot(),
                child: const Text('Start 360° Video Shoot'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
