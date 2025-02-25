package Ecommerce.tests.VwoTestcases;

import Ecommerce.base.CommonToAllTest;
import Ecommerce.driver.DriverManager;
import Ecommerce.pages.improved_pom.FacebookPage;
import Ecommerce.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class testFBLogin extends CommonToAllTest {

         @Owner("Sachin")
         @Description("To verify FB error message")
         @Test

         public void testFBLogin(){

             FacebookPage facebookPage = new FacebookPage(DriverManager.getDriver());

            String Error_msg =facebookPage.loginFBInvalidCred(PropertiesReader.readKey("username1"),PropertiesReader.readKey("password1"));

            assertThat(Error_msg).isNotNull().isNotEmpty().isNotBlank();
            // Assert.assertEquals(Error_msg, PropertiesReader.readKey("error_message1"));





         }

}
