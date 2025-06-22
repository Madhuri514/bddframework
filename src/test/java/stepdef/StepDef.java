package stepdef;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.LoginModule;
import pageobject.LoginPageObject;

public class StepDef {

    LoginModule loginModule;

    @Given("user open chrome")
    public void user_open_chrome() {
        DriverFactory.openBrowser();
        loginModule  = new LoginModule(DriverFactory.getDriver());
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_cred(String username, String password) {
        loginModule.login(username, password);
    }

    @Given("user open url {string}")
    public void user_open_url(String string) {
        DriverFactory.openUrl(string);
    }
    @When("user enter username {string}")
    public void user_enter_username(String string) {
        loginModule.enterUserName(string);
    }
    @When("user enter password {string}")
    public void user_enter_password(String string) {
        loginModule.enterPassword(string);
    }
    @When("user enter login button")
    public void user_enter_login_button() {
        loginModule.clickLogin();
    }


    @Then("user validate successful login screen")
    public void user_validate_successful_login_screen() {
        System.out.println("Hello I am opening chrome step 6");
    }
    @Then("user validate dashboard")
    public void user_validate_dashboard() {
        System.out.println("Hello I am opening chrome step 7");
    }
    @Then("user validate error msg {string}")
    public void user_validate_error_msg(String string) {
        System.out.println("Hello I am opening chrome step 8");
    }


}
