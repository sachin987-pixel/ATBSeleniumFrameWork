package Ecommerce.pages;

import Ecommerce.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonToAllPage {

               //page Locators
                WebDriver driver;

                public LoginPage(WebDriver driver){
                       this.driver = driver;
                }
                By username = By.id("login-username");
                By password = By.id("login-password");
                By signButton = By.id("js-login-btn");
                By error_message = By.id("js-notification-box-msg");

               //page Actions
               public String loginToVwoLoginInvalidCreds(String user, String pwd){
                      openVwoUrl();
                      enterInput(username,user);
                      enterInput(password,pwd);
                      clickElement(signButton);
                      visibilityofElement(error_message);

                      return getText(error_message);

                      }

//               public void loginToVwoLoginValidCreds(String user, String pwd){
//                   openVwoUrl();
//                   enterInput(username,user);
//                   enterInput(password,pwd);
//                   clickElement(signButton);
//               }



       }


