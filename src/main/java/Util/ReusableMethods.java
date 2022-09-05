package Util;

import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class ReusableMethods {
    private WebDriver driver;
    private By LivePostingButton  = By.xpath("//a[contains(text(),'Live Posting')]");

    public ReusableMethods (WebDriver driver) {this.driver= driver;}

    public void getUrl(String URL) throws InterruptedException {
        driver.navigate().to(URL);
        Thread.sleep(2000);
    }

    public void clickLivePosting(){
        driver.findElement(LivePostingButton).click();
    }
public void TakeScreenshot(String screenshotname){
var cam = (TakesScreenshot)driver;
File screenshot = cam.getScreenshotAs(OutputType.FILE);
try {
    Files.move(screenshot,new File("C:\\Users\\ASUS\\IdeaProjects\\untitled\\src\\main\\resources\\screenshots\\"+screenshotname));

}catch (IOException e){
    e.printStackTrace();
}

}
}

