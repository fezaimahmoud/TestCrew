package TC4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class CaptureTooltip {

    public WebDriver driver;

    public CaptureTooltip(WebDriver driver) {
        this.driver = driver;
    }
    private By agebox = By.xpath("//p/input");

    public String getToolTipText() {
        WebElement iframe = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
       driver.switchTo().frame(iframe);
        return driver.findElement(agebox).getAttribute("title");

    }


}
