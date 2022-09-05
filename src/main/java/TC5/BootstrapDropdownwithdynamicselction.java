package TC5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BootstrapDropdownwithdynamicselction {
    private WebDriver driver;
    private By producttypedropdownbutton  = By.xpath("//span[contains(text(),'Select Product Type')]");
    private By producttypeoption  = By.xpath("    /html[1]/body[1]/div[1]/div[1]/div[2]/div[12]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li\n");



    public BootstrapDropdownwithdynamicselction(WebDriver driver) {
        this.driver = driver;
    }

    public void ProductType() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.elementToBeClickable(producttypedropdownbutton));
       driver.findElement(producttypedropdownbutton).click();
        List<WebElement> domainoptions = driver.findElements(producttypeoption);
        List<String> optproduct = new ArrayList<String>();

        for (WebElement wb : domainoptions) {
            System.out.println(wb.getText());
            optproduct.add(wb.getText());


        }
    }
}