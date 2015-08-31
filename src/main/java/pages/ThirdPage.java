package pages;

import org.openqa.selenium.By;

/**
 * Created by sdakshin on 30/08/15.
 */
public class ThirdPage extends BasePage {
    public void ProceedToFourthPage() {
        driver.findElement(By.xpath("html/body/p/a")).click();
    }
}
