package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObject.loginPage;

public class loginSteps {
loginPage lp= new loginPage();
    @Given("user at talenttek login page")
    public void userAtTalenttekLoginPage() {
        
    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
lp.email("motoorbyk@yahoo.com");
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        lp.password("Abc1234@");
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        lp.loginButton();
    }

    @Then("user should not be able to login successfully")
    public void userShouldNotBeAbleToLoginSuccessfully() {

    lp.invalidData();
    }

    @And("user enter invalid email address")
    public void userEnterInvalidEmailAddress() {

    }

    @And("user enter invalid password")
    public void userEnterInvalidPassword() {
    }
}
