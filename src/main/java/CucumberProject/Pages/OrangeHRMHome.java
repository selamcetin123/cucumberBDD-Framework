package CucumberProject.Pages;

import CucumberProject.Utils.BrowserUtils;
import CucumberProject.Utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.apache.log4j.Logger;

public class OrangeHRMHome extends BrowserUtils {

    public OrangeHRMHome() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    private static final Logger logger = Logger.getLogger(OrangeHRMHome.class);

    @FindBy(xpath = "//h1[.='Dashboard']")
    private WebElement Dashboard;

    @FindBy(xpath = "//b[.='PIM']")
    private WebElement PIM;

    @FindBy(id = "menu_pim_addEmployee")
    private WebElement Addemployee;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstname;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastname;

    @FindBy(id = "btnSave")
    private WebElement save;

    @FindBy(xpath = "//h1[.='Personal Details']")
    private WebElement personaldetail;


    @FindBy(xpath = "//input[@name='chkLogin']")
    private WebElement addLoginDetails;

    @FindBy(xpath = "//input[@id='user_name']")
    private WebElement UserName;

    @FindBy(xpath = "//input[@id='user_password']")
    private WebElement Password;

    @FindBy(xpath = "//input[@id='re_password']")
    private WebElement Confirmpassword;

    @FindBy(xpath = "//select[@id='status']")
    private WebElement statusDropdown;






    public void setPIM() {
        // PIM.click();
        clickWithWait(PIM);
    }

    public void setAddemployee() {
        clickWithWait(Addemployee);

    }

    public void setFirstname(String Firstname) {
        firstname.sendKeys(Firstname);

        logger.info(firstname+"is successfully entered ");
    }

    public void setLastname(String Lastname) {

        lastname.sendKeys(Lastname);
        logger.info(lastname+"is successfully entered ");
    }

    public void setSave() {

        clickWithWait(save);
        logger.info("Save button successfully clicked ");
    }

    public void setPersonaldetail(String expectedHeader) {
        Assert.assertEquals(personaldetail.getText(),expectedHeader);
        logger.info(expectedHeader+"is expected header and  successfully verified ");
    }

    public void setDashboard() {
        Assert.assertEquals(Dashboard.getText(),"Dashboard");
    }

    public void setDashboard(String str) {
        Assert.assertEquals(Dashboard.getText(),str);
    }

    public void setAddLoginDetails() {

        clickWithWait(addLoginDetails);
       logger.info("Add login details button was successfully clicked ");
    }

    public void setUserName(String userName) {
        UserName.sendKeys(userName);
    }

    public void setPassword(String password) {
        Password.sendKeys(password);
    }

    public void setConfirmpassword(String confirmpassword) {
        Confirmpassword.sendKeys(confirmpassword);
    }

    public void setStatusDropdown(String statusdropdown) {
        selectFromDropDown(statusDropdown,statusdropdown);
    }
}