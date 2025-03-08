package Ecommerce.tests.VwoTestcases;

import Ecommerce.base.CommonToAllTest;
import Ecommerce.driver.DriverManager;
import Ecommerce.pages.improved_pom.Naukari;
import Ecommerce.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import java.awt.*;

public class testNaukari extends CommonToAllTest {

     @Owner("Sachin")
     @Description("Verify naukari.com")
    @Test


       public void testCheckbox(){

         Naukari checkbox = new Naukari(DriverManager.getDriver());
          checkbox.CheckboxActions(PropertiesReader.readKey("username2"),PropertiesReader.readKey("password2"));



     }




}
