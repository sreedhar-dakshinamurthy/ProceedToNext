package pages;

import org.openqa.selenium.By;

/**
 * Created by sdakshin on 30/08/15.
 */
public class SecondPage extends BasePage {

    public void ProceedToThirdPage() {
        driver.findElement(By.xpath("html/body/p/a")).click();
    }
}
