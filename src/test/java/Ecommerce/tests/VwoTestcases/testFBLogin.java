package Ecommerce.tests.VwoTestcases;

import Ecommerce.base.CommonToAllTest;
import Ecommerce.driver.DriverManager;
import Ecommerce.pages.improved_pom.FacebookPage;
import Ecommerce.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
//import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class testFBLogin extends CommonToAllTest {


    @Owner("Sachin")
    @Description("To verify FB error message")
    @Test
    public void testFBLogin() {
        // Initialize Facebook page
        FacebookPage facebookPage = new FacebookPage(DriverManager.getDriver());

        // Perform login with invalid credentials and get error message
        String errorMsg = facebookPage.loginFBInvalidCred(
                PropertiesReader.readKey("username1"),
                PropertiesReader.readKey("password1")
        );

        // Verify error message using assertions
        assertThat(errorMsg)
                .isNotNull()
                .isNotEmpty()
                .isNotBlank();
        Assert.assertEquals(errorMsg,PropertiesReader.readKey("error_message1"));
    }
}
