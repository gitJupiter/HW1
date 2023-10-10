package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class config {

    public static WebDriver bk;

public static WebDriver browser(String drivertype){

    if(drivertype.equalsIgnoreCase('ch')){
        bk= new ChromeDriver();
    } else if (drivertype.equalsIgnoreCase('FF')) {
        bk= new FirefoxDriver();
    } else if (drivertype.equalsIgnoreCase('safari')) {
        bk=new SafariDriver();
    }
    bk.manage().window().maximize();
    bk.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    return bk;


    //branch one
}

}
