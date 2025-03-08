package Ecommerce.pages.improved_pom;

import Ecommerce.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukari extends CommonToAllPage {

    WebDriver driver;

    public Naukari(WebDriver driver) {
        this.driver = driver;

    }

    By Login = By.xpath("//a[@title ='Jobseeker Login']");
    By username = By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
    By password = By.xpath("//input[@placeholder='Enter your password']");
    By button = By.xpath("//button[text()='Login']");
    By companies = By.xpath("//div[text()='Companies']");
    By checkbox = By.xpath("//span[text()='Indian MNC'][1]");

    public void  CheckboxActions(String user, String pwd) {
        OpenNauakri();

        presenceOfElement(Login);

        clickElement(Login);
        custom_wait();

        enterInput(username, user);
        enterInput(password, pwd);
        clickElement(button);

        moveToElement(companies);


        clickElement(companies);
        custom_wait();

        clickElement(checkbox);


    }

}




