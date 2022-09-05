package TC6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePickerwithdatemonthandyearselection {
    private WebDriver driver;
    private By dateofbirth = By.xpath("//input[@id='dob']");
    private By years = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/select[2]/option");
    private By months = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/select[1]/option");
    private By days = By.xpath("//tbody/tr/td/a");

    public DatePickerwithdatemonthandyearselection(WebDriver driver) {
        this.driver = driver;
    }

    public void setDate(String day, String month, String year) throws InterruptedException {
        driver.findElement(dateofbirth).click();
        List<WebElement> yearlist = driver.findElements(years);

        for (WebElement webElement : yearlist) {

            System.out.println(webElement.getText());

            if (webElement.getText().equalsIgnoreCase(year)) {
                System.out.println(webElement.getText());

                webElement.click();

                break;

            }}


            List<WebElement> monthlist = driver.findElements(months);
            for (WebElement webElement1 : monthlist) {

                System.out.println(webElement1.getText());

                if (webElement1.getText().equalsIgnoreCase(month)) {
                    System.out.println(webElement1.getText());

                    webElement1.click();
                    break;

                }

            }
            List<WebElement> daylist = driver.findElements(days);
            for (WebElement webElement2 : daylist) {

                System.out.println(webElement2.getText());

                if (webElement2.getText().equalsIgnoreCase(day)) {
                    System.out.println(webElement2.getText());

                    webElement2.click();

                    break;


                }


            }
            Thread.sleep(10000);
        }
    }
