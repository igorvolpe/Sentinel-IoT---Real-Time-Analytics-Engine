data class Telemetry(val deviceId: String, val temp: Double, val vibration: Double)

class Analytics(private val data: List<Telemetry>) {
    
    fun generateReport() {
        val avgTemp = data.map { it.temp }.average()
        val maxVib = data.maxOfOrNull { it.vibration } ?: 0.0
        
        println("--- 📊 Relatório de Telemetria ---")
        println("Média de Temperatura: ${"%.2f".format(avgTemp)}ºC")
        println("Pico de Vibração: $maxVib")
        println("Total de Dispositivos: ${data.size}")
        
        if (avgTemp > 35.0) println("⚠️ Alerta: Tendência de aquecimento global na rede.")
    }
}

fun main() {
    val logs = listOf(
        Telemetry("SN-01", 32.5, 0.2),
        Telemetry("SN-02", 45.0, 0.9),
        Telemetry("SN-03", 38.2, 0.4)
    )
    Analytics(logs).generateReport()
}
