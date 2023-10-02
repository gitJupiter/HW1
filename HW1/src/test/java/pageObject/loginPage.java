package pageObject;

import base.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginPage extends config {

    public void email( String emailValue){
        bk.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(emailValue);
    }
public void password(String passwordValue){
    bk.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys(passwordValue);
}
public void loginButton(){
    bk.findElement(By.cssSelector("#login_form > input.my-login")).click();

}
public void invalidData(){

String a=bk.findElement(By.xpath("//*[@id=\"error_message\"]/div/h5")).getText();
String e="You have entered an incorrect email or student Id.";
    Assert.assertEquals(a,e);

    }

}
