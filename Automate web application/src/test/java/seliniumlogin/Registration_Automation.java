package seliniumlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Registration_Automation {
	
    public static void main(String[] args)
    {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\asus\\Documents\\chrome web drive/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007765%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIgKXQyLa3-gIVRSUrCh0rwQpyEAAYASAAEgI41vD_BwE");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.name("firstname"))
        .sendKeys("Harsh");
        
        driver.findElement(By.name("lastname"))
        .sendKeys("Vardhan");
        
        driver.findElement(By.name("reg_email__"))
            .sendKeys("xyz@gmail.com");
        
        driver.findElement(By.name("reg_email_confirmation__"))
        .sendKeys("xyz@gmail.com");
        
        driver.findElement(By.id("password_step_input"))
        .sendKeys("23456jdjfh");
        
        driver.findElement(By.id("day"))
        .sendKeys("23");
        
        driver.findElement(By.id("month"))
        .sendKeys("Jan");
  
        driver.findElement(By.id("year"))
            .sendKeys("2000");
        
        driver.findElement(By.className("_8esa"))
        .click();
  
        driver.findElement(By.name("websubmit"))
            .click();
    }
}
