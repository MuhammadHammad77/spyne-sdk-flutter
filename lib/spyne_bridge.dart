import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

class SpyneBridge {
  static const MethodChannel _channel =
      MethodChannel('com.example.sypne_flutter_sdk/spyne');

  static Future<void> startCatalogShoot() async {
    try {
      await _channel.invokeMethod('startCatalogShoot');
    } on PlatformException catch (e) {
      debugPrint("Failed to start catalog shoot: ${e.message}");
    }
  }

  static Future<void> start360VideoShoot() async {
    try {
      await _channel.invokeMethod('start360VideoShoot');
    } on PlatformException catch (e) {
      debugPrint("Failed to start 360° video shoot: ${e.message}");
    }
  }
}
