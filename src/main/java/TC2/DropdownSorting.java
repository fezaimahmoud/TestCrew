package TC2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownSorting {
    public WebDriver driver;
    private By domainsdropdownbutton  = By.xpath("//div[contains(text(),'All')]");
    private By options  = By.xpath("/html[1]/body[1]/div[7]/div[1]/section[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li");


    public DropdownSorting(WebDriver driver ){ this.driver = driver;}
    public void getAllDomainsOptions(){
        driver.findElement(domainsdropdownbutton).click();
        List <WebElement> domainoptions= driver.findElements(options);
        List<String> opt = new ArrayList<String>();

        for (WebElement wb : domainoptions ){
            if (wb.getText().equals("All") ){continue;}
            System.out.println(wb.getText());
            opt.add(wb.getText());


        }
        System.out.println("Domains options are : " + opt);
        System.out.println("Domains options are : " + opt.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
        System.out.println("Domains options are : " + opt.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

    }

    }

