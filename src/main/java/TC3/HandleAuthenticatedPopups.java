package TC3;

import dev.failsafe.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAuthenticatedPopups {
    private By basicauthbutton  = By.xpath("//a[contains(text(),'Basic Auth')]");
    private By message  = By.xpath("  //p[contains(text(),'Congratulations! You must have the proper credenti')]");


    private WebDriver driver;
    public HandleAuthenticatedPopups(WebDriver driver){
        this.driver=driver;}

    public void clickBasicAuth() throws InterruptedException {
        driver.findElement(basicauthbutton).click();


    }
    public void setCred() throws InterruptedException {
        String username ="admin";
        String password ="admin";
        String URL ="https://"+username+":"+password +"@"+"the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

    }
    public String getValidateAuth(){
        return driver.findElement(message).getText();
    }


}

