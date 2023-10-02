import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test2 extends test1{
    public static void main(String[] args){

        bk= new ChromeDriver();
        bk.get("https://qa.taltektc.com/home/login");
        bk.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("motoorbyk@yahoo.com");
        bk.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Abc1234@");
        bk.findElement(By.cssSelector("#login_form > input.my-login")).click();
        String a="Welcome to TalentTek";
        String b=bk.findElement(By.xpath("//*[@id=\"profile_form\"]/legend")).getText();
        Assert.assertEquals(b,a);

    }
}
