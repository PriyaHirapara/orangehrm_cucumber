package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDeft
{

    LoginPage loginPage = new LoginPage();



    @Given("^user is on login page$")
    public void user_is_on_login_page()
    {
        loginPage.VerifyUserIsOnLoginPage();
    }
    @When("^User enter enter valid credentials$")
    public void userEnterUserEnterValidCredentials()
    {
       loginPage.userEnterValidCredentials();
    }
    @Then("^User should be Login successfully$")
    public void user_should_be_Login_successfully()
    {

    }
    @Given("^User is on Login Page$")
    public void userIsOnLoginPage()
    {
            loginPage.VerifyUserIsOnLoginPage();
    }
    @Then("^Use should not be able to login successfully with \"([^\"]*)\"$")
    public void useShouldNotBeAbleToLoginSuccessfullyWith(String receiveMassage)
    {
        loginPage.emptyUserNameAndPasswordErrorMassage(receiveMassage);

    }
    @And("^User click on login Button$")
    public void userClickOnLoginButton()
    {
       loginPage.clickOnLoginButton();
    }
    @When("^User enter invalid userName \"([^\"]*)\"$")
    public void userEnterInvalidUserName(String UserName)
    {
           loginPage.enterUserName(UserName);
    }

    @And("^User enter invalid password \"([^\"]*)\"$")
    public void userEnterInvalidPassword(String Password)
    {
       loginPage.enterPassword(Password);
    }


}
