com.example.sypne_flutter_sdk

import android.content.Context
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class SpyneModule(private val context: Context) : MethodCallHandler {

    companion object {
        const val CHANNEL_NAME = "com.example.sypne_flutter_sdk/spyne"

        fun registerWith(registrar: Registrar) {
            val channel = MethodChannel(registrar.messenger(), CHANNEL_NAME)
            val instance = SpyneModule(registrar.context())
            channel.setMethodCallHandler(instance)
        }
    }

    override fun onMethodCall(call: MethodCall, result: Result) {
        when (call.method) {
            "startCatalogShoot" -> {
                startCatalogShoot()
                result.success("Catalog shoot started")
            }
            "start360VideoShoot" -> {
                start360VideoShoot()
                result.success("360° video shoot started")
            }
            else -> result.notImplemented()
        }
    }

    private fun startCatalogShoot() {
        // Implement Spyne SDK catalog shoot logic here
    }

    private fun start360VideoShoot() {
        // Implement Spyne SDK 360° video shoot logic here
    }
}