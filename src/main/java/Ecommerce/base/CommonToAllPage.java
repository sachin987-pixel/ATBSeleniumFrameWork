package Ecommerce.base;

import Ecommerce.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Ecommerce.driver.DriverManager.getDriver;

public class CommonToAllPage {
    // If you want to call something before every Page Object Class call, Put your Code here");
    // Open File, Open Data Base Connection You can write code here

      public CommonToAllPage() {
        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here

      }

      public void openVwoUrl(){
        getDriver().get(PropertiesReader.readKey("url"));

        }

    public void openFbUrl() {
        getDriver().get(PropertiesReader.readKey("url1"));
    }

     public void OpenModelUrl(){
          getDriver().get(PropertiesReader.readKey("url2"));


     }

     public void OpenNauakri(){
          getDriver().get(PropertiesReader.readKey("url3"));

     }


        public void custom_wait(){

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    public void clickElement(By by) {
        getDriver().findElement(by).click();

    }

    public void clickElement(WebElement by) {
        by.click();

    }

    public void moveToElement(By by) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(by)).perform();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);

    }

    public void enterInput(WebElement by, String key) {
        by.sendKeys(key);

    }

    public String getText(By by) {
         return getDriver().findElement(by).getText();

     }
       public String getText(WebElement by){
        return by.getText();

         }
         public WebElement presenceOfElement(By elementLocation){
          return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));

         }

         public WebElement visibilityofElement(By elementLocation){
          return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));

           }

         public WebElement getElement(By by){
          return getDriver().findElement(by);

         }
















}
