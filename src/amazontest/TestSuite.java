package amazontest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.util.Iterator;
import java.util.List;

public class TestSuite extends Utility {
    String baseUrl = "https://www.amazon.co.uk/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserCanSearchHowManyProductsDisplyedOnThePage() {
        //Click on the Search tab and start search dell laptop
        sendTextToElement(By.xpath("//input[@id='twotabsearchtextbox']"), "dell laptop");
        // click on search button
        clickOnElement(By.xpath("//input[@id='nav-search-submit-button']"));
        //click on Accept cookies
        clickOnElement(By.xpath("//span[@id='a-autoid-0']"));
        // click on Dell Brand
        clickOnElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[1]/span[1]/a[1]/span[1]"));
        // click on Results
        clickOnElement(By.xpath("//span[contains(text(),'RESULTS')]"));
        //Verify the 24 product and display on the console
        verifyExpectedAndActual(By.xpath("//span[contains(text(),'RESULTS')]"), "RESULTS");
        //boolean isChecked= false;
        //List<WebElement> Dell = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
       // int size = Dell.size();
      //  System.out.println(" Dell laptop of the list:" + Dell.size());
      //  for (int i = 0; i < size; i++) {
        //    isChecked = Dell.get(i).isSelected();
           // if(!isChecked) {
            //    Dell.get(i).click();}

                List<WebElement> drop = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
                Iterator<WebElement> i = drop.iterator();
                  while (i.hasNext()); {
                    WebElement row = i.next();
                    System.out.println(row.getText());
                }

            }

        }






