package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.LoginScreenPO;

/**
 * This is the Main Test Cases Class, All the test cases are defined in this.
 */
public class TestCases extends BaseTest {

    @BeforeTest
    @Override
    public void setUpPage() {

    }

    @Test
    public void verifyUserCanSendMessage() throws InterruptedException {
        final String phoneNo = "00011122233";
        final String messageText = "Hello, there";

        LoginScreenPO po = new LoginScreenPO(driver);
        po.typeMobileNo(phoneNo);

        Thread.sleep(5000);
    }

    public static void main(String[] args) {

    }

}
