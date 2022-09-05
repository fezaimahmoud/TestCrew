package TC1;

import Util.BaseInitialisation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleAutoCompleteGooglePlaces {
    public  WebDriver driver; ;

    public HandleAutoCompleteGooglePlaces (WebDriver driver ){ this.driver = driver;}
    private By MapsTextbox  = By.xpath("//input[@id='autocomplete']");
    private By DropDown  = By.xpath("//*[@class=\"pac-item\"][3]");
    private By Drop  = By.xpath("//input[@id='autocomplete']");


    public void fillMapsTextbox(String city) throws InterruptedException {
        driver.findElement(MapsTextbox).sendKeys(city+ Keys.DOWN );
        Thread.sleep(2000);
        driver.findElement(DropDown).click();
        //select.selectByValue("Ohio, États-Unis");
        Thread.sleep(3000);
    }

public String getSelectedText(){
        return driver.findElement(Drop).getAttribute("value");
}

}
