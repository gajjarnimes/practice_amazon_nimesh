package utilities;

import amazontest.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    public void clickOnElement(By by){
        WebElement loginLink= driver.findElement(by);
        loginLink.click();
    }
    // Alert Method
    public void switchToAlert(){
        driver.switchTo().alert();
    }
    public void switchToAlertGetText(){
        driver.switchTo().alert().getText();
    }
    public void switchToAlertAccept(){
        driver.switchTo().alert().accept();
    }
    // send text to element method
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    // Get text from element method
    public String getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
    public void TestDropDown(){
        WebElement dropDown= driver.findElement(By.name("String"));
        Select select = new Select(dropDown);}
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
    //Mouse Hover action method
    public void mouseHoverToElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
    public void mouseHoverToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public void mouseHoverToElementAndClick(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }
    public void verifyMessage(String expectedMessage,String actualMessage){
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    public void verifyExpectedAndActual(By by,String expectedText){
        String actualText=getTextFromElement(by);
        Assert.assertEquals(actualText,expectedText);
    }

    }


