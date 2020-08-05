package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util{
    private String expectedLoginMassage= "Welcome Admin";
    private By _welComeAdminMassage = By. xpath("//a[text()=\"Welcome Admin\"]");

    public void VerifyUserisLoginSuccessfully()
    {
        Assert.assertEquals(getTextFromElement(_welComeAdminMassage),expectedLoginMassage);
    }

}

