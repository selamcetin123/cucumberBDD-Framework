package CucumberProject.Pages;

import CucumberProject.Utils.BrowserUtils;
import CucumberProject.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class guru99GatewayHome extends BrowserUtils {


        public guru99GatewayHome(){ PageFactory.initElements(Driver.getDriver(),this); }



        @FindBy(xpath = "//input[@type='submit']")
        public WebElement buynow;



        @FindBy(xpath = "//select[@name='quantity']")
        public WebElement quantityDropDown;


        public void getBuynow() {
                buynow.click();

        }

        public void getQuantityDropDown(String str) {
                Select select=new Select(quantityDropDown);
                select.selectByValue(str);

        }






}
