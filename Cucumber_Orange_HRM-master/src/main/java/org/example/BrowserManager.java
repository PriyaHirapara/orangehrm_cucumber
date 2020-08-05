package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util
{
    public static LoadProp load_prop = new LoadProp();
    public static final String browserName = load_prop.getProperty("Browser");
    public static final String USERNAME = load_prop.getProperty("SAUCE_USERNAME");
    public static final String ACCESS_KEY = load_prop.getProperty("SAUCE_ACCESS_KEY");
    //public static final String URL = "https://"+USERNAME+":"+ ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
    public static final String URL = "https://Priya_soft:807ee5e1-f32a-4f0e-83db-36e3332a0082@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
    public static final boolean SAUCE_LAB = true;
@Test
    public void setBrowser() // create Method for start up browser
    {

        System.out.println(browserName);

        if (SAUCE_LAB)
        {
            System.out.println("Running with SauceLab" + browserName);

            if (browserName.equalsIgnoreCase("chrome"))
            {
               DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability("platformName", "Windows 7");
                capabilities.setCapability("browserVersion", "64");
                try
                {
                    driver = new RemoteWebDriver(new URL(URL),capabilities);

                }catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }

            } else if (browserName.equalsIgnoreCase("Firefox"))
            {
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("platformName", "Windows 7");
                capabilities.setCapability("browserVersion", "64");
                try
                {
                    driver=new RemoteWebDriver(new URL(URL),capabilities);

                }catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }
            } else if (browserName.equalsIgnoreCase("safari"))
            {
                DesiredCapabilities capabilities = DesiredCapabilities.safari();
                capabilities.setCapability("platformName", "Windows 7");
                capabilities.setCapability("browserVersion", "13");
                try
                {
                    driver=new RemoteWebDriver(new URL(URL),capabilities);

                }catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }
            }
            else
                {
                    System.out.println("cant able to reach" + browserName);
                }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // open the URL
            driver.get(load_prop.getProperty("URL"));

        }else {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            // setting up chrome driver path
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDrivers\\chromedriver.exe");

            // create chrome driver object to open Google Chrome browser
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("Firefox"))
        {
            // setting up chrome driver path
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDrivers\\geckodriver.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            driver = new FirefoxDriver();
        } else
        {
            System.out.println("you browser name is wrong or empty" + browserName);
        }

        // screen maximization
        driver.manage().window().maximize();
        // Applying implicitly wait of 10 sec to driver instance
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // open the URL
        driver.get(load_prop.getProperty("URL"));
    }
    }
    // reusable method to close browser
    public void closeBrowser()
    {
        driver.close();
    }

}
