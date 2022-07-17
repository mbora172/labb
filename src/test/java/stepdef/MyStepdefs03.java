package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AddCustomer;
import page.HomePage;

public class MyStepdefs03 {
    HomePage homePage=new HomePage();
    AddCustomer addCustomer=new AddCustomer();
    @When("The user wants to add a customer")
    public void theUserWantsToAddACustomer() throws InterruptedException {
        homePage.setAddCustomer();
    }

    @Then("The users wants to verify {string} header")
    public void theUsersWantsToVerifyHeader(String arg0) throws InterruptedException {
        addCustomer.verifyHeader(arg0);
    }

    @Then("The user wants to enter background check as {string}")
    public void theUserWantsToEnterBackgroundCheckAs(String arg0) {
        addCustomer.setBackgroundCheck(arg0);
    }

    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void theUserWantsToEnterBillingaddressAsAndAndAndAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {
    addCustomer.AddCustomerDet(arg0,arg1,arg2,arg3,arg4);
    }

    @And("The wants to verify message as {string}")
    public void theWantsToVerifyMessageAs(String arg0) throws InterruptedException {
        addCustomer.verifyHeaderAccess(arg0);
    }
}
