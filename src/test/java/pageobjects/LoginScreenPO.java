package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.AppiumUtils;

import java.util.List;

/**
 * Page Object Class: This contains all the page objects of Android messaging app
 */
public class LoginScreenPO extends BasePO {

    /**
     * @param driver the appium driver created in the beforesuite method.
     */
    public LoginScreenPO(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(className = "android.widget.EditText")
    List<AndroidElement> mobileNumberInputField;

    public AndroidElement getMobileNumberInputField(){
        return this.mobileNumberInputField.get(1);
    }

    public void typeMobileNo(String mobileNo){
        getMobileNumberInputField().sendKeys(mobileNo);
        AppiumUtils.isElementDisplayed(mobileNumberInputField.get(1));
        mobileNumberInputField.get(1).isDisplayed();
    }
    }