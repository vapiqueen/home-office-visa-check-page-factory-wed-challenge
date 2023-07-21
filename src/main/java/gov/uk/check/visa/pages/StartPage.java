package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Start now']" )
    WebElement  StartNowButton;

    public void clickStartNow(){
       clickOnElement(StartNowButton);
        CustomListeners.test.log(Status.PASS,"clickStartNow");
        Reporter.log("clickStartNow"+StartNowButton.toString());
    }
    }

