# WSN Attack Prediction Backend

This is a Java Spring Boot backend service that predicts types of attacks in Wireless Sensor Networks using mock machine learning logic.

## Features
- REST API endpoint to receive WSN data
- Simple prediction service (can be replaced with real ML integration)
- Built using Spring Boot

## API Example

POST `/api/attack/predict`

```json
{
  "packetLoss": 0.7,
  "delay": 100,
  "energy": 0.5,
  "throughput": 1.5
}
