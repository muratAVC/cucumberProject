package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static final String CHROME="chrome";
    public static final String FIREFOX="firefox";
    public static final String EDGE="edge";
    public static final String OPERA="opera";
    public static final String SAFARI="safari";

    public static WebDriver getDriver(String browserType) {
        browserType = browserType.toLowerCase();
        WebDriver resultDriver;
        if (System.getProperty("os.name").toLowerCase().contains("windows") && browserType.contains("safari")) {
            return resultDriver=null;
        } else if (System.getProperty("os.name").toLowerCase().contains("mac")&& browserType.contains("edge")) {
            return resultDriver=null;
        }

        if (browserType.contains(FIREFOX)) {
            WebDriverManager.firefoxdriver().setup();
            resultDriver = new FirefoxDriver();


        } else if (browserType.contains(OPERA)) {
            WebDriverManager.operadriver().setup();
            resultDriver = new OperaDriver();

        } else if (browserType.contains("cromium")) {
            WebDriverManager.chromiumdriver().setup();
            resultDriver = new ChromeDriver();

        } else if (browserType.contains(EDGE)){
            WebDriverManager.edgedriver().setup();
            resultDriver = new EdgeDriver();

        } else if (browserType.contains(SAFARI)) {
            WebDriverManager.safaridriver().setup();
            resultDriver=new SafariDriver();

        }else {
            WebDriverManager.chromedriver().setup();//default chrome driver run
            resultDriver = new ChromeDriver();

        }
        resultDriver.manage().window().maximize();
        resultDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return resultDriver;
    }
}
