package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseInitialisation {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String projectlocation = System.getProperty("user.dir");
        System.out.print(projectlocation);


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\IdeaProjects\\untitled\\src\\main\\resources\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
         driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();
       //driver.get("https://www.twoplugs.com/");

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}

