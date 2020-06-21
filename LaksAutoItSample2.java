package com.LaksSauceTest;

import org.testng.annotations.Test;
import org.json.JSONObject;
import org.json.JSONArray;


import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;




 
import java.net.URL;
import com.LaksSauceTest.GuineaPigPage;

public class LaksAutoItSample2 {
  public static final String USERNAME =  System.getenv("SAUCE_USERNAME");
  public static final String ACCESS_KEY = System.getenv("SAUCE_ACCESS_KEY");
	
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
  public static void main(String[] args) throws Exception {
	  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	  caps.setCapability("platform", "Windows 7");
	  caps.setCapability("version", "11.0");
	  caps.setCapability("seleniumVersion","3.141.0");
	  caps.setCapability("name", "SampleAutoItSauceSampleWinSec");
	  
	  JSONObject jsonObj = new JSONObject();
	  jsonObj.put("executable", "sauce-storage:SampleWinSec.exe");
	  jsonObj.put("background", true);
	  JSONArray arr = new JSONArray();
	  arr.put("--silent");
	  arr.put("-a");
	  arr.put("-q");
	  jsonObj.put("args", arr);
	  
	  caps.setCapability("prerun",jsonObj);

	  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

	  driver.get("https://the-internet.herokuapp.com/basic_auth");
	  	  
      driver.quit();
  }
}