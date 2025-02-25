package Ecommerce.pages;

import Ecommerce.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DashboardPage extends CommonToAllPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;

}

        By userNameOnDashBoard = By.cssSelector("[data-qa='lufexuloga']");

   public String LoggedInUser(){
       visibilityofElement(userNameOnDashBoard);

       return getText(userNameOnDashBoard);


   }
}

