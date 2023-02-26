package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Driver {
    public static final String CHROME="chrome";
    public static final String FIREFOX="firefox";
    public static final String EDGE="edge";
    public static final String OPERA="opera";
    public static final String SAFARI="safari";
    private Driver(){}

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();


    public static WebDriver getDriver(){
        if (driverPool.get()==null){
        String browserName=ConfigurationReader.getProperty("browser");
        switch (browserName){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                WebDriver driver=new ChromeDriver();
                driverPool.set(driver);
                driverPool.get().manage().window().maximize();
                driverPool.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driverPool.set(new FirefoxDriver());
                driverPool.get().manage().window().maximize();
                driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "remote-chrome":
                String gridAdress = "54.89.242.106"; // put your own Linux grid IP here
                try {
                    URL url = new URL("http://"+gridAdress+":4444/wd/hub");
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setBrowserName("chrome");
                    driverPool.set(new RemoteWebDriver(url,desiredCapabilities));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            case "saucelab-chrome":
                try{
                    URL url = new URL("https://oauth-sdetoscar-844c8:66e7117f-390e-4556-8105-07af96a01f7a@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setBrowserName("chrome");
                    driverPool.set(new RemoteWebDriver(url,desiredCapabilities));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }catch (MalformedURLException e){
                    e.printStackTrace();
                }
                break;
            case "saucelab-edge":
                EdgeOptions browserOptions = new EdgeOptions();
                browserOptions.setCapability("platformName", "Windows 11");
                browserOptions.setCapability("browserVersion", "latest");
                Map<String, Object> sauceOptions = new HashMap<>();
                sauceOptions.put("build", "<your build id>");
                sauceOptions.put("name", "<your test name>");
                browserOptions.setCapability("sauce:options", sauceOptions);
                URL url = null;
                try {
                    url = new URL("https://oauth-sdetoscar-844c8:66e7117f-390e-4556-8105-07af96a01f7a@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
                    driverPool.set(new RemoteWebDriver(url,browserOptions));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;


        }




        }
        return driverPool.get();
    }

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
