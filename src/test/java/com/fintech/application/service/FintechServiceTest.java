package com.fintech.application.service;

import com.fintech.domain.model.FintechDomainModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FintechServiceTest {
    @Test
    public void testCreateFintech() {
        FintechService service = new FintechService();
        FintechDomainModel model = service.createFintech("Fintech", "Fintech description");
        assertNotNull(model);
        assertEquals("Fintech", model.name());
        assertEquals("Fintech description", model.description());
    }
}