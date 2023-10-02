import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
public static WebDriver bk;
    public static void main(String[] args){
        //System.out.println("framework test");

bk= new ChromeDriver();
bk.get("https://qa.taltektc.com/home/login");
        bk.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("motoorbyk@yahoo.com");
        bk.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Abc1234@");
        bk.findElement(By.cssSelector("#login_form > input.my-login")).click();




    }
}
