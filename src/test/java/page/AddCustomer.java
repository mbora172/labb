package page;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

// page_url = https://demo.guru99.com/telecom/addcustomer.php
public class AddCustomer {

    public AddCustomer() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
 

    @FindBy(xpath = "//*[text() = 'Add Customer']")
    public WebElement header;

    public void setBackgroundCheck(String str) {
       if (str.contains("one"))
       { done.click();
      }
       else if (str.contains("end")) {
           pending.click();
       }

    }



    @FindBy(css = "label[for='pending']")
    public WebElement pending;


    @FindBy(css = "label[for='done']")
    public WebElement done;

    public void AddCustomerDet(String fnameInput1, String lnameInput1, String emailidInput1, String addrTextarea1, String telephonenoInput1) {
        fnameInput.sendKeys(fnameInput1);
        lnameInput.sendKeys(lnameInput1);
        emailidInput.sendKeys(emailidInput1);
       addrTextarea.sendKeys(addrTextarea1);
       telephonenoInput.sendKeys(telephonenoInput1);
        submitInput.click();
    }

    @FindBy(id = "fname")
    public WebElement fnameInput;

    @FindBy(id = "lname")
    public WebElement lnameInput;

    @FindBy(id = "email")
    public WebElement emailidInput;


    @FindBy(id = "telephoneno")
    public WebElement telephonenoInput;

    @FindBy(name = "addr")
    public WebElement addrTextarea;

    @FindBy(name = "submit")
    public WebElement submitInput;

    @FindBy(css = "h1")
    public WebElement elementH;

   

    // No page elements added



    public void verifyHeader(String str) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(header.getText(),str);
        System.out.println(header.getText());
   }
//    @Test
//    public void button(){
//        Driver.getDriver().get("https://demo.guru99.com/telecom/addcustomer.php");
//        telephonenoInput.sendKeys("jbnkj");
//  }
public void verifyHeaderAccess(String str) throws InterruptedException {
    Thread.sleep(3000);
    Assert.assertEquals(elementH.getText(),str);
    System.out.println(elementH.getText());
}
}