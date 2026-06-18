package com.fintech.application.service;

import com.fintech.domain.model.FintechDomainModel;

public class FintechService {
    public FintechDomainModel createFintech(String name, String description) {
        return new FintechDomainModel(null, name, description);
    }
}