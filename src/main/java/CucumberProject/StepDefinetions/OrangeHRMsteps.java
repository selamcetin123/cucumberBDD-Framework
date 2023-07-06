package CucumberProject.StepDefinetions;

import CucumberProject.Pages.OrangeHRMHome;
import CucumberProject.Pages.OrangeHRMLogin;
import CucumberProject.Utils.BrowserUtils;
import CucumberProject.Utils.ConfigurationsReader;
import CucumberProject.Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

public class OrangeHRMsteps extends BrowserUtils {

    OrangeHRMLogin orangeHRMLogin=new OrangeHRMLogin();
    OrangeHRMHome orangeHRMHome=new OrangeHRMHome();

    private static final Logger logger =Logger.getLogger(OrangeHRMsteps.class);


    @Given("The user wants to go OrangeHRM Website")
    public void the_user_wants_to_go_orange_hrm_website() {
        //We deleted whatever was here before because it was information only and it helps cucumber to throw exception when steps doesnt have code

        System.out.println(" Browser is launched and testing started" );
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest"));
        waitForPageToLoad(4);
        logger.info("it is succesfull");

    }

    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {
        orangeHRMLogin.setUsername(ConfigurationsReader.getProperties("userName"));
        orangeHRMLogin.setPassWord(ConfigurationsReader.getProperties("password"));
        logger.info("Username and password provided successfully ");

    }

    @Then("The user wants to click on Login button")
    public void the_user_wants_to_click_on_login_button() {
        orangeHRMLogin.setLoginButton();
        logger.info("it is succesfull");

    }

    @Then("The user wants to verify that browser landed on Dashboard")
    public void the_user_wants_to_verify_that_browser_landed_on_dashboard() {
        orangeHRMHome.setDashboard();
        logger.info("it is succesfull");
    }

    @Then("The user wants to verify that browser landed on {string}")
    public void the_user_wants_to_verify_that_browser_landed_on(String string) {
      orangeHRMHome.setDashboard(string);
        logger.info("it is succesfull");
    }


    @Then("The user wants to click on PIM Module")
    public void the_user_wants_to_click_on_pim_module() {
        orangeHRMHome.setPIM();
        logger.info("it is succesfull");
    }
    @Then("The user wants to go to Add Empployee Page")
    public void the_user_wants_to_go_to_add_empployee_page() {
        orangeHRMHome.setAddemployee();
        logger.info("it is succesfull");
    }
    @Then("The user wants to add first name as {string}")
    public void the_user_wants_to_add_first_name_as(String string) {
        orangeHRMHome.setFirstname(string);
        logger.info("it is succesfull");

    }
    @Then("The user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String string) {
        orangeHRMHome.setLastname(string);
        logger.info("it is succesfull");

    }
    @Then("The user wants to save personal information")
    public void the_user_wants_to_save_personal_information() {
        orangeHRMHome.setSave();
        logger.info("it is succesfull");

    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String string) {
        staticWait(2);
        orangeHRMHome.setPersonaldetail(string);

    }

    @Then("The user wants to go to Add Employee's first and last name as following")
    public void the_user_wants_to_go_to_add_employee_s_first_and_last_name_as_following(Map<String,String> dataTable) {
        orangeHRMHome.setFirstname(dataTable.get("FirstName"));
        orangeHRMHome.setLastname(dataTable.get("LastName"));



    }
    @Then("The user wants to add login details as following")
    public void the_user_wants_to_add_login_details_as_following(Map<String,String> dataTable) {

        orangeHRMHome.setAddLoginDetails();
        orangeHRMHome.setUserName(dataTable.get("UserName"));
        orangeHRMHome.setPassword(dataTable.get("Password"));
        orangeHRMHome.setConfirmpassword(dataTable.get("Password"));
        orangeHRMHome.setStatusDropdown(dataTable.get("Status"));
        logger.info("Username,Password and Status of account provided successfully");


    }

    @Then("The user wants to go to Add Employee's first and last name as following List")
    public void the_user_wants_to_go_to_add_employee_s_first_and_last_name_as_following_list(List<List<String>> dataTable) {
                                               //row   colom
        orangeHRMHome.setFirstname(dataTable.get(0).get(0));
        orangeHRMHome.setLastname(dataTable.get(0).get(1));

    }
    @Then("The user wanst to add Login in a List way")
    public void the_user_wanst_to_add_login_in_a_list_way(List<List<String>> dataTable) {
        orangeHRMHome.setAddLoginDetails();
        orangeHRMHome.setUserName(dataTable.get(1).get(0));
        orangeHRMHome.setPassword(dataTable.get(1).get(1));
        orangeHRMHome.setConfirmpassword(dataTable.get(1).get(1));
        staticWait(2);
        orangeHRMHome.setStatusDropdown(dataTable.get(1).get(2));


    }



}
