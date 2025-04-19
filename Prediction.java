package com.wsn.service;

import com.wsn.model.AttackData;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {
    public String predictAttack(AttackData data) {
        // Simple mock logic (replace with ML model integration)
        if (data.getPacketLoss() > 0.5) return "Blackhole";
        if (data.getDelay() > 200) return "Flooding";
        return "Normal";
    }
}
