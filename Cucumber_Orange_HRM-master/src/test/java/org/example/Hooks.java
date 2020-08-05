package org.example;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Util
{
    BrowserManager browsermanager = new BrowserManager();

    @Before
    public void openBrowser()
    {
        browsermanager.setBrowser();
    }

    @After
    public void closeBrowser()
    {
        browsermanager.closeBrowser();
    }

}
