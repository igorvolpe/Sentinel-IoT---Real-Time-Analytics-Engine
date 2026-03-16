data class Telemetry(val deviceId: String, val temp: Double, val vibration: Double)

class Analytics(private val data: List<Telemetry>) {
    fun generateReport() {
        val avgTemp = data.map { it.temp }.average()
        val maxVib = data.maxOfOrNull { it.vibration } ?: 0.0
        
        println("--- 📊 Relatório de Telemetria ---")
        println("Média de Temperatura: ${"%.2f".format(avgTemp)}ºC")
        println("Pico de Vibração: $maxVib")
        
        if (avgTemp > 40.0) println("🚨 ALERTA: Sistema em sobreaquecimento!")
    }
}

fun main() {
    val logs = listOf(
        Telemetry("SN-01", 35.5, 0.2),
        Telemetry("SN-02", 48.0, 0.9), // Exemplo de alerta
        Telemetry("SN-03", 32.1, 0.1)
    )
    Analytics(logs).generateReport()
}
