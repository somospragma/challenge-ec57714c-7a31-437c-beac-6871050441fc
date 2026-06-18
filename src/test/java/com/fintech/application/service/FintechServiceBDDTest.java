package com.fintech.application.service;

import com.fintech.domain.model.FintechDomainModel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

public class FintechServiceBDDTest {
    private FintechService service;
    private FintechDomainModel model;

    @Given("a new fintech with name {string} and description {string}")
    public void givenANewFintechWithNameAndDescription(String name, String description) {
        service = new FintechService();
    }

    @When("the fintech is created")
    public void whenTheFintechIsCreated() {
        model = service.createFintech("Fintech", "Fintech description");
    }

    @Then("the fintech should have name {string} and description {string}")
    public void thenTheFintechShouldHaveNameAndDescription(String name, String description) {
        assertNotNull(model);
        assertEquals(name, model.name());
        assertEquals(description, model.description());
    }
}