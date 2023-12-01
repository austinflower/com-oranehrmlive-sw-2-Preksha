package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp (){
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {
        Thread.sleep(5000);

    driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();
        Thread.sleep(5000);
   String actualMsg =driver.findElement(By.xpath("//div[@class='orangehrm-card-container']/form[1]/h6")).getText();
   String expectedMsg = "Reset Password";
   Assert.assertEquals(actualMsg,expectedMsg);

    }


}
