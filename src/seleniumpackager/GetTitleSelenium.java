package seleniumpackager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleSelenium {
    public static void main(String[] args) {

        ChromeOptions option=new ChromeOptions();
        option.setBinary("binary path of any driver to run testcase on that specific version");
        ChromeDriver driver=new ChromeDriver(option);
        driver.get("https://www.selenium.dev/");
        String title=driver.getTitle();
        System.out.println("title:"+title);
        String actualTitle="Selenium";
        if(title.equals(actualTitle)){
            System.out.println("title is correct");
        }
        else {
            System.out.println("title not matched");
        }
        driver.quit();
    }
}
