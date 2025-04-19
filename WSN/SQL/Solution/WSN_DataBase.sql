CREATE TABLE attack_logs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    attack_type VARCHAR(50),
    packet_loss DOUBLE,
    delay DOUBLE,
    energy DOUBLE,
    throughput DOUBLE,
    predicted_at DATETIME DEFAULT CURRENT_TIMESTAMP
);
