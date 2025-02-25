package Ecommerce.tests.VwoTestcases;

import Ecommerce.base.CommonToAllTest;
import Ecommerce.driver.DriverManager;
import Ecommerce.pages.DashboardPage;
import Ecommerce.pages.LoginPage;
import Ecommerce.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVwoLoginImprovedPom extends CommonToAllTest {

    //private static final Logger logger = LogManager.getLogger(TestVwoLoginImprovedPom.class);

    @Owner("Sachin")
    @Description("Verify error message")
    @Test

    public void testNegativeVwo() {

        //logger.info("Starting the Testcases Page Object Model");

        LoginPage loginpage = new LoginPage(DriverManager.getDriver());
        String Error_msg = loginpage.loginToVwoLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));


        // logger.info("End of the testLoginNegativeVWO !");

        assertThat(Error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(Error_msg, PropertiesReader.readKey("error_message"));

    }

    @Owner("PRAMOD")
    @Description("Verify that valid creds dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO() {

        //logger.info("Starting the Testcases |  Verify that valid creds dashboard page is loaded");


        LoginPage loginPage_VWO = new LoginPage(DriverManager.getDriver());
        loginPage_VWO.loginToVwoLoginInvalidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashboardPage dashBoardPage  = new DashboardPage(DriverManager.getDriver());
        String usernameLoggedIn = dashBoardPage.LoggedInUser();


       //logger.info("End and Asserting testLoginPositiveVWO");

        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn,PropertiesReader.readKey("expected_username"));



    }




}
