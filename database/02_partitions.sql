CREATE TABLE telemetry_y2026m03 PARTITION OF device_telemetry
    FOR VALUES FROM ('2026-03-01 00:00:00+00') TO ('2026-04-01 00:00:00+00');

CREATE INDEX idx_telemetry_device_id_ts ON device_telemetry (device_id, ts DESC);
CREATE INDEX idx_telemetry_payload_gin ON device_telemetry USING GIN (payload);
