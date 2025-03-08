package Ecommerce.tests.VwoTestcases;

import Ecommerce.base.CommonToAllTest;
import Ecommerce.driver.DriverManager;
import Ecommerce.pages.improved_pom.LargeModel;
import Ecommerce.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestLargeModel extends CommonToAllTest {

         @Owner("Sachin")
         @Description("Verify text message on pop-up")
         @Test

        public void testModelText(){

             LargeModel model = new LargeModel(DriverManager.getDriver());
                   String Message =model.LargeModelPage();

             assertThat(Message).isNotNull().isNotEmpty().isNotBlank();

            Assert.assertEquals(Message, PropertiesReader.readKey("text_msg"));
//                   Assert.assertEquals(Message,PropertiesReader.readKey("text_msg"));




         }
}
