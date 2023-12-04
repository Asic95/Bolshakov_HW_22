package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bolshakov_HW_12 extends BaseTestClass {

    private String email;
    private boolean mode;

    @Given("I use {string}")
    public void createAnAccount(String email) {
        this.email = email;
    }

    @When("Try to create new account on the website")
    public void tryToHaveNewAccount() {
        setUp();
        enterEmail(email);
        buttonClick();
    }

    @Then("I received message {string}")
    public void receivingResults(String expectedAnswer) throws InterruptedException {
        switch (email) {
            case "test@testh2.com": {
                mode = true;
                break;
            }
            case "test@test.test":
            case "111": {
                mode = false;
                break;
            }
        }
        assertEquals(findResultText(mode), expectedAnswer);
        pauseBetweenTests();
        closeBrowser();
    }
}