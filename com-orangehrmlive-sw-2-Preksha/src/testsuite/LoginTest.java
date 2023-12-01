package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp (){
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
       Thread.sleep(5000);
       driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        String actualMsg =driver.findElement(By.xpath("//header[@class='oxd-topbar']/div/div/span/h6")).getText();

       String expectedMsg ="Dashboard";
        Assert.assertEquals(actualMsg,expectedMsg);







    }

}
