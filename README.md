# 🚀 Global IoT Sentinel - Real-Time Engine

Este projeto demonstra uma arquitetura vertical para IoT, unindo **PostgreSQL Avançado** e **Kotlin** para processamento de telemetria de alta escala.

## 🛠️ Tecnologias
* **Backend:** Kotlin (Analytics Engine)
* **Banco de Dados:** PostgreSQL 16 (Table Partitioning)
* **Performance:** GIN Indexes & Partition Pruning

## 📊 Performance (Validada)
Utilizando `EXPLAIN ANALYZE`, o banco realizou o **Partition Pruning**, ignorando milhões de linhas e focando apenas na partição `telemetry_y2026m03`.
* [cite_start]**Tempo de Execução:** 0.02ms [cite: 1, 4]

![Plano de Execução](LINK_DA_TUA_IMAGEM_AQUI)

## 🏗️ Arquitetura do Sistema
```mermaid
graph LR
  A[Sensores IoT] --> B[PostgreSQL Particionado]
  B --> C[Sentinel Engine Kotlin]
  C --> D[Alertas Críticos]
