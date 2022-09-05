package TC7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleMultipleFrames {
    private WebDriver driver;
    public HandleMultipleFrames(WebDriver driver ){ this.driver = driver;}

    public void SwitchBetweenFrames(){
        WebElement iframe1 = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/iframe[1]"));
        WebElement iframe2 = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/iframe[1]"));
        WebElement iframe3 = driver.findElement(By.xpath("//body/main[1]/div[1]/div[2]/iframe[1]"));

        driver.switchTo().frame(iframe1);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(iframe2);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(iframe3);

    }

}
