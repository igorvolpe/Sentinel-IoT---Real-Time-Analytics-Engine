graph LR
  A[Sensores IoT] --> B[PostgreSQL Particionado]
  B --> C[Sentinel Engine Kotlin]
  C --> D[Alertas/Dashboard]
