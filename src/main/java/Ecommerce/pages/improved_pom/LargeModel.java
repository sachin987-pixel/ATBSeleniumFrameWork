package Ecommerce.pages.improved_pom;

import Ecommerce.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LargeModel extends CommonToAllPage {

           WebDriver driver;
           public LargeModel(WebDriver driver){
               this.driver =driver;


           }

           By lardgeModel = By.xpath("//button[@id='showLargeModal']");
           By text = By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]");

                public String LargeModelPage(){

                    OpenModelUrl();
                    clickElement(lardgeModel);
                   visibilityofElement(text);
                   return getText(text);

           }


//           By.Largemodel = By.xpath("//button[@id='showLargeModal']");

}
