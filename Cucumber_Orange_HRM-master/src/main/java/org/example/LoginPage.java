package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class LoginPage extends Util
{
    LoadProp loadprop = new LoadProp();
    private String expectedURL = "https://opensource-demo.orangehrmlive.com/";
    private String actualURL = driver.getCurrentUrl();

    private By _userName = By.xpath("//input[@id=\"txtUsername\"]");
    private By _password = By. xpath("//input[@id=\"txtPassword\"]");
    private By _actualUserNameCanNotEmptyMassage = By.xpath("//span[text()=\"Username cannot be empty\"]");
    private By _actualPasswordCanNotEmptyMassage = By.xpath("//span[text()=\"Password cannot be empty\"]");
    private By _actualInvalidCredentialsMassage =By.xpath("//span[text()=\"Invalid credentials\"]");
    private By _loginButton = By. xpath("//input[@value=\"LOGIN\"]");
    private By _expectedErrorMassage = By.xpath("//span[@id=\"spanMessage\"]");




    public void VerifyUserIsOnLoginPage()
    {
        Assert.assertEquals(actualURL,expectedURL);
    }
    public void userEnterValidCredentials()
    {
        sendKeyElement(_userName,loadprop.getProperty("UserName"));
        sendKeyElement(_password,loadprop.getProperty("Password"));
       clickOnElement(_loginButton);
    }
    public void enterUserName(String UserName)
    {
        sendKeyElement(_userName,UserName);
    }
    public void enterPassword(String Password)
    {
       sendKeyElement(_password,Password);
    }
    public void clickOnLoginButton()
    {
        clickOnElement(_loginButton);
    }
    public void emptyUserNameAndPasswordErrorMassage(String receiveMassage)
    {
        Assert.assertEquals(getTextFromElement(_expectedErrorMassage),receiveMassage);

    }

}
