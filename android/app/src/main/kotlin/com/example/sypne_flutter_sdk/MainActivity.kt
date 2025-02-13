package com.example.sypne_flutter_sdk

import io.flutter.embedding.android.FlutterActivity

import android.app.Application
import com.spyne.sdk.SpyneSDK

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize Spyne SDK
        SpyneSDK.initialize(this, "YOUR_API_KEY", "YOUR_CATEGORY_ID")
    }
}
