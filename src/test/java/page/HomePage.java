package page;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class HomePage extends BrowserUtils {
    Actions actions = new Actions(Driver.getDriver());
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Add Tariff Plan")
    private WebElement tarifPlan;

    public void setAddCustomer() throws InterruptedException {
        Thread.sleep(2000);
        AddCustomer.click();
        actions.moveByOffset(0,0).click().build().perform();
    }

    @FindBy(xpath = "//*[text() = 'Add Customer']")
    private WebElement AddCustomer;



    public  void addtarifplan(){
        tarifPlan.click();

        actions.moveByOffset(0,0).click().build().perform();

    }
}
