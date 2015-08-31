package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by sdakshin on 30/08/15.
 */
public class FirstPage extends BasePage {

    public FirstPage(){
        driver = new FirefoxDriver();
        driver.get("file:///Users/sdakshin/Documents/Examples/ProceedToNext/page1.html");
    }

    public void ProceedToSecondPage() {
        driver.findElement(By.xpath("html/body/p/a")).click();
    }
}
