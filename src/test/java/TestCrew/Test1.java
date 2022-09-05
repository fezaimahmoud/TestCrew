package TestCrew;
import static org.testng.Assert.assertEquals;
import TC1.HandleAutoCompleteGooglePlaces;
import TC2.DropdownSorting;
import TC3.HandleAuthenticatedPopups;
import TC4.CaptureTooltip;
import TC5.BootstrapDropdownwithdynamicselction;
import TC6.DatePickerwithdatemonthandyearselection;
import TC7.HandleMultipleFrames;
import TC8.AutoSuggestDropdown;
import Util.BaseInitialisation;
import Util.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test1 extends BaseInitialisation {
    @Test
    public void testCase1() throws InterruptedException {
        ReusableMethods reusableMethods = new ReusableMethods(driver);
        reusableMethods.getUrl("https://www.twoplugs.com/");

        HandleAutoCompleteGooglePlaces HACGP = new HandleAutoCompleteGooglePlaces(driver);
        reusableMethods.clickLivePosting();
        HACGP.fillMapsTextbox("Toronto");

        assertEquals(HACGP.getSelectedText(), "Toronto, Ohio, États-Unis","Not Correct");


    }
    @Test
    public void testCase2() throws InterruptedException {
        ReusableMethods reusableMethods = new ReusableMethods(driver);
        reusableMethods.getUrl("https://www.twoplugs.com/");

        HandleAutoCompleteGooglePlaces HACGP = new HandleAutoCompleteGooglePlaces(driver);
        reusableMethods.clickLivePosting();
        DropdownSorting dropdownSorting = new DropdownSorting(driver);
        dropdownSorting.getAllDomainsOptions();




    }



    @Test
    public void testCase3() throws InterruptedException {
        ReusableMethods reusableMethods = new ReusableMethods(driver);
        reusableMethods.getUrl("https://the-internet.herokuapp.com/");

        HandleAuthenticatedPopups handleAuthenticatedPopups = new HandleAuthenticatedPopups(driver);
        handleAuthenticatedPopups.clickBasicAuth();
       handleAuthenticatedPopups.setCred();

               assertEquals(handleAuthenticatedPopups.getValidateAuth(),"Congratulations! You must have the proper credentials.");


    }

    @Test
    public void testCase4() throws InterruptedException {
        ReusableMethods reusableMethods = new ReusableMethods(driver);
        reusableMethods.getUrl("https://jqueryui.com/tooltip/");
        CaptureTooltip captureTooltip = new CaptureTooltip(driver);
        assertEquals(captureTooltip.getToolTipText(),"We ask for your age only for statistical purposes.");




    }


   /* @Test
    public void testCase5() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        ReusableMethods reusableMethods = new ReusableMethods(driver);
        reusableMethods.getUrl("https://www.hdfcbank.com");
        Thread.sleep(5000);
        BootstrapDropdownwithdynamicselction bootstrapDropdownwithdynamicselction = new BootstrapDropdownwithdynamicselction(driver);
bootstrapDropdownwithdynamicselction.ProductType();



    }*/
    @Test
    public void testCase6() throws InterruptedException {
        ReusableMethods reusableMethods = new ReusableMethods(driver);
        reusableMethods.getUrl("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        DatePickerwithdatemonthandyearselection dt = new DatePickerwithdatemonthandyearselection(driver);
        dt.setDate("30","jun","2005");
        reusableMethods.TakeScreenshot("datapicker.png");

    }

    @Test
    public void testCase7() throws InterruptedException {
        ReusableMethods reusableMethods = new ReusableMethods(driver);
        reusableMethods.getUrl("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        HandleMultipleFrames handleMultipleFrames =new HandleMultipleFrames(driver);
        handleMultipleFrames.SwitchBetweenFrames();
        reusableMethods.TakeScreenshot("frame.png");


    }

    @Test
    public void testCase8() throws InterruptedException {
        ReusableMethods reusableMethods = new ReusableMethods(driver);
        reusableMethods.getUrl("https://www.google.com/webhp?hl=en");
        AutoSuggestDropdown autoSuggestDropdown = new AutoSuggestDropdown(driver);
        autoSuggestDropdown.captureSuggestionElements();
        reusableMethods.TakeScreenshot("w3schools.png");




    }


    }
