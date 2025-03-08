package Ecommerce.pages.improved_pom;

import Ecommerce.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage extends CommonToAllPage {

          WebDriver driver;
          public FacebookPage(WebDriver driver){
              this.driver = driver;

          }

          By emaiAddress = By.id("email");
          By password = By.name("pass");
          By signButton = By.name("login");
          By error_mesg = By.xpath("//div[@class='_9ay7']");

          public String loginFBInvalidCred(String user, String pwd){
              openFbUrl();
              enterInput(emaiAddress,user );
              enterInput(password, pwd);
              clickElement(signButton);
              presenceOfElement(error_mesg);



//              visibilityofElement(error_mesg);

              return getText(error_mesg);




          }




}
