package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Addtarifplan;
import page.HomePage;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;

public class MyStepdefs02 {
    HomePage homePage=new HomePage();
    Addtarifplan addtarifplan=new Addtarifplan();
    @Given("The user wants to see Guru demo site")
    public void theUserWantsToSeeGuruDemoSite() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("HomeUrl"));
    }

    @When("The user wants to Add Tariff Plan")
    public void theUserWantsToAddTariffPlan() {
     homePage.addtarifplan();
    }

    @Then("The user wants to verify {string} header")
    public void theUserWantsToVerifyHeader(String arg0) throws InterruptedException {
        addtarifplan.verifyHeader(arg0);
    }

    @Then("The user wants to Ad Tariff Plan details as")
    public void the_user_wants_to_ad_tariff_plan_details_as(Map<String,String>dataTable) {
        addtarifplan.details( dataTable.get("Monthly Rental"),dataTable.get("Free Local Minutes"),dataTable.get("Free International Minutes"),dataTable.get("Free SMS Pack"),dataTable.get("Local Per Minutes Charges"),dataTable.get("International Per Minutes Charges"),dataTable.get("SMS Per Charges"));

    }

    @And("The user wants to submit")
    public void theUserWantsToSubmit() {
        addtarifplan.setSubmit();
    }

    @Then("The user wants to verify message as {string}")
    public void theUserWantsToVerifyMessageAs(String arg0) {
   addtarifplan.setSubmitText(arg0);
    }



}
