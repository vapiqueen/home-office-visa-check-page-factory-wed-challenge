package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {

    public SelectNationalityPage() {
            PageFactory.initElements(driver, this);
        }
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectNationality(String nationality){
        CustomListeners.test.log(Status.PASS, "selectNationality");
        Reporter.log("Select nationality"+nationalityDropDownList.toString());
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }
    public void clickNextStepButton(){
        CustomListeners.test.log(Status.PASS, "clickNextStepButton");
        Reporter.log("click on continue button"+continueButton.toString());
        clickOnElement(continueButton);
    }
}
