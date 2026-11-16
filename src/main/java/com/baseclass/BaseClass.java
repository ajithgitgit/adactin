package com.baseclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class BaseClass {
         protected  WebDriver driver;
        
        public void launchBrowser(String browserName){
            
            if(browserName.equalsIgnoreCase("chrome")){
                driver = new ChromeDriver();
            } else if ( browserName.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
                
            } else if ( browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();

            }
            else {
                throw new IllegalArgumentException(
                        "invalid browser :" + browserName);

            }
            driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

        public void launch_Url(String url){
            driver.get(url);
        }


        public void close_Browser(){
            if (driver != null){
                driver.quit();
                driver = null;
            }
        }
    }

