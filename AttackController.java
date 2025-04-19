package com.wsn.controller;

import com.wsn.model.AttackData;
import com.wsn.service.PredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attack")
public class AttackController {

    @Autowired
    private PredictionService predictionService;

    @PostMapping("/predict")
    public String predictAttack(@RequestBody AttackData data) {
        return predictionService.predictAttack(data);
    }
}
