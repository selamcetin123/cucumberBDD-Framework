package CucumberProject.Pages;

import CucumberProject.Utils.BrowserUtils;
import CucumberProject.Utils.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeHRMLogin extends BrowserUtils {


    public OrangeHRMLogin(){ PageFactory.initElements(Driver.getDriver(),this); }

    private static final Logger logger = Logger.getLogger(OrangeHRMLogin.class);


    @FindBy(id = "txtUsername")
    private WebElement Username;

    @FindBy(id = "txtPassword")
    private WebElement passWord;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;


    public void setUsername(String username) {
        if (!username.isEmpty()){
            logger.error("username is empty . Please check the value  you provider");
            logger.info("Please check if you provider username corectly");
        }
        staticWait(1);
        Username.sendKeys(username);

    }

    public void setPassWord(String password) {

        passWord.sendKeys(password);
    }

    public void setLoginButton() {
        loginButton.click();
    }
}
