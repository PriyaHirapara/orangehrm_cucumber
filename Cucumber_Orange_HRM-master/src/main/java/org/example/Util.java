package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public class Util extends BasePage
{

    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    public static void sendKeyElement(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    public  void waituntilElementislickble(By by, int a)
    {
        WebDriverWait wait = new WebDriverWait(driver, a);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public  void sleep1(int n)
    {
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    //method for taking screenshot

    public void screenShot(String screenShotName){
        //method for taking screenshot
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(srcFile, new File("src\\test\\ScreenShots" +screenShotName+" .png"));
        }
        catch (IOException e) {
            e.printStackTrace();
       }}


}
