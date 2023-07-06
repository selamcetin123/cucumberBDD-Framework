package Team1;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class amazon {

                   WebDriver driver;
//
//
//
//    @Given("The user wants to go google for amazon")
//    public void the_user_wants_to_go_google_for_amazon() {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        WebDriverWait wait=new WebDriverWait(driver,10);
//        driver.get("https://www.google.com/");
//
//
//
//    }
//    @Given("The user want to enter text on search button")
//    public void the_user_want_to_enter_text_on_search_button() {
//        driver.findElement(By.name("q")).sendKeys("amazon");
//
//    }
//    @When("The user want to click login button")
//    public void the_user_want_to_click_login_button() {
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.findElement(By.name("btnK")).click();



 //   }

    @Given("The user wants to go google for amazon")
    public void the_user_wants_to_go_google_for_amazon() {
        System.out.println("jason");


        WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver();
        driver.get("https://www.google.com/");

    }
    @Given("The user want to enter text on search button")
    public void the_user_want_to_enter_text_on_search_button() {
        System.out.println("selam");

        driver.findElement(By.name("q")).sendKeys("amazon");

    }
    @When("The user want to click login button")
    public void the_user_want_to_click_login_button() {
        System.out.println("yaseen");

       driver.findElement(By.name("btnK")).click();

    }
    @Then("The user want to verify title amazon")
    public void the_user_want_to_verify_title_amazon() {
        System.out.println("paima");
        String actualTitle=driver.getTitle();
        String expectTitle="amazon";
        System.out.println(actualTitle);


    }

//
//PageFactory.
//    @FindBy(name = "")
//    public WebElement setup;
//
//    public amazon(WebElement setup) {
//
//
//    }

    //    @Then("The user want to verify title amazon")
//    public void theUserWantToVerifyTitleAmazon() throws InterruptedException {
//        driver.getTitle();
//        System.out.println("driver = " + driver.getTitle());
//        Thread.sleep(2000);
//        driver.close();
//    }
}
