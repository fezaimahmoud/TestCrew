package TC8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutoSuggestDropdown {
    private By searchbar = By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    private By searchItems = By.xpath("/html[1]/body[1]/div[7]/div[1]/div[11]/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/div/a/h3[1]");
    private WebDriver driver;
    public AutoSuggestDropdown(WebDriver driver) {
        this.driver = driver;
    }
public void captureSuggestionElements() throws InterruptedException {

         driver.findElement(searchbar).sendKeys("java tutorial"+ Keys.ENTER);
         List< WebElement> suggest = driver.findElements(searchItems);
    for (WebElement sug:suggest)
          {

              if( sug.getText().toUpperCase().contains("w3schools".toUpperCase()))
              {
                  System.out.println(sug.getText());

                  sug.click();
                  break;

              }

          }

}
}
