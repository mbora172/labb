package page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class Addtarifplan extends BrowserUtils {
public Addtarifplan(){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(xpath = "//header/h1[text()='Add Tariff Plans']")
    private WebElement header;

    public void details(String rental1, String local_minutes1, String inter_minutes1, String sms_pack1, String minutes_charges1, String inter_charges1, String sms_charges1) {
        rental.sendKeys(rental1);
       local_minutes.sendKeys(local_minutes1);
       inter_minutes.sendKeys(inter_minutes1);
        sms_pack.sendKeys(sms_pack1);
       minutes_charges.sendKeys(minutes_charges1);
        inter_charges.sendKeys(inter_charges1);
        sms_charges.sendKeys(sms_charges1);
    }

    @FindBy(id = "rental1")
private WebElement rental;
    @FindBy(id = "local_minutes")
    private WebElement local_minutes;
    @FindBy(id = "inter_minutes")
    private WebElement inter_minutes;
    @FindBy(id = "sms_pack")
    private WebElement sms_pack;
    @FindBy(id = "minutes_charges")
    private WebElement minutes_charges;
    @FindBy(id = "inter_charges")
    private WebElement inter_charges;
    @FindBy(id = "sms_charges")
    private WebElement sms_charges;
@FindBy(name = "submit")
private WebElement submit;



    @FindBy(xpath = "//h2[text()='Congratulation you add Tariff Plan']")
private WebElement submitText;

public void setSubmit(){
    submit.click();
}

    public void setSubmitText(String Text) {
        Assert.assertEquals(submitText.getText(),Text);
    }
public void verifyHeader(String str) throws InterruptedException {
    Thread.sleep(3000);
    Assert.assertEquals(header.getText(),str);
    System.out.println(header.getText());
}




}
