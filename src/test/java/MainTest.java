import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainTest extends  BasicTastCase {


    @Test
    public void test(){

        BasicTastCase.getWebDriver().get("https://www.bbc.com");
        BasicTastCase.getWebDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        BasicTastCase.getWebDriver().findElement(By.id("orb-search-q")).sendKeys("Sport");
        BasicTastCase.getWebDriver().findElement(By.id( "orb-search-button")).click();
        WebElement element = BasicTastCase.getWebDriver().findElement(By.name("search-content"));
        WebDriverWait wait = new WebDriverWait(BasicTastCase.getWebDriver(),3);
        wait.until(ExpectedConditions.visibilityOf(element));


    }
}
