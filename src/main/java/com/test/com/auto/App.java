//package com.test.com.auto;
//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.DriverCommand;
//import org.openqa.selenium.remote.RemoteExecuteMethod;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//
///**
// * Hello world!
// *
// */
//public class App {
//
//	public static RemoteWebDriver driver;
//
//	// @BeforeMethod
//	public void setup() {
//
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		// capabilities.setCapability("deviceName", "Administrator’s iPhone");
//		//
//		// capabilities.setCapability("udid",
//		// "0c23f1d6577d7c1a884544895b1221016949dd3f");
//		//
//		// capabilities.setCapability("platformName", "iOS");
//		//
//		// capabilities.setCapability("platformVersion", "9.3.2");
//		//
//		// capabilities.setCapability("browserName", "safari");
//		//
//		// capabilities.setCapability(MobileCapabilityType.APP,
//		// "/Users/appiumautomation/appium-1.5.3/node_modules/appium-ios-driver/build/SafariLauncher/SafariLauncher.app");
//
//		capabilities.setCapability("platformName", "iOS");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
//		capabilities.setCapability("automationName", "XCUITest");
//		// capabilities.setCapability("deviceName", "iPhone 7");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Sri");
//		capabilities.setCapability(MobileCapabilityType.UDID, "bea2bce97220d05cbc1a949c5173117bf80f34a8");
//		// capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
//		// "Bac");
//		// capabilities.setCapability(MobileCapabilityType.UDID,
//		// "6bbef872a63a670d48faf045b996a3024bfe1f39");
//		// capabilities.setCapability("xcodeConfigfile",
//		// "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/Config.xcconfig");
//		capabilities.setCapability("xcodeConfigfile",
//				"/Users/innamsr/appium-1.6.1/node_modules/appium-xcuitest-driver/WebDriverAgent/myconfig.xcconfig");
//		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
//		capabilities.setCapability("realDeviceLogger", "/usr/local/lib/node_modules/deviceconsole/deviceconsole");
//		// capabilities.setCapability("showIOSLog", true);
//		// System.out.println(port1);
//		try {
//
//			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//			
//			//safariClearHistoryCookies(driver);
//			// driver = new IOSDriver(new
//			// URL("http://192.168.1.152:4444/wd/hub"), capabilities);
//			clearCookies();
//			driver.manage().deleteAllCookies();
//			driver.get("http://vzw.com");
//		
//			
//			
////			 String homeWindow = driver.getWindowHandle();
////		       Set<String> allWindows = driver.getWindowHandles();
////
////		        //Use Iterator to iterate over windows
////		        Iterator<String> windowIterator =  allWindows.iterator();
////
////		        //Verify next window is available
////		        while(windowIterator.hasNext()){
////
////		            //Store the Recruiter window id
////		            String childWindow = windowIterator.next();
////
////		            //Here we will compare if parent window is not equal to child window 
////		            if (! homeWindow.equals(childWindow)){
////		                //driver.switchTo().window(childWindow);
////		                driver.close();
////		            }
////		        }
////		        
////		        driver.get("http://vzw.com");
//			
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//
//		}
//	}
//	 
//	 
//
//	@SuppressWarnings("rawtypes")
//	//@BeforeMethod
//	public void native_Android() {
//
//		//File app = new File("/Users/innamsr/Downloads/919.apk");
//		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		
//		//capabilities.setCapability("appPackage", "com.vzw.mobilefirst");
//		capabilities.setCapability("appPackage", "com.vzw.hss.myverizon");
//		capabilities.setCapability("deviceName", "smartphones");
//		capabilities.setCapability("version", "5.0.0");
//		//capabilities.setCapability("udid", deviceID);
//		//capabilities.setCapability("app", "/Users/v983853/Downloads/app-phone-debugWithTest-11.1.35-121.apk");
//		//capabilities.setCapability("appActivity",".setup.views.activity.TestActivity");
//		//capabilities.setCapability("androidActivity","com.vzw.hss.myverizon.ui.activities.LauncherActivity");
//		//capabilities.setCapability("androidActivity","com.vzw.hss.myverizon.ui.activities.TestActivity");
//		//capabilities.setCapability("androidActivity","com.vzw.hss.myverizon/com.vzw.mobilefirst.setup.views.activity.SetUpActivity");
//		capabilities.setCapability("appActivity",".ui.activities.TestActivity");
//		capabilities.setCapability("intentAction", "android.intent.action.LAUNCH_MVM_TESTSCREEN");
//		//capabilities.setCapability("intentAction", "android.intent.action.LAUNCH_MVM_TESTSCREEN");
//		capabilities.setCapability("fullReset", "false");
//		capabilities.setCapability("noReset", "true");
//		
//
//		
//		//capabilities.setCapability("automationName", "appium");
//		//capabilities.setCapability("platformName", "Android");
//		//capabilities.setCapability("platformVersion", "5.1.1");
//		//capabilities.setCapability("deviceName", "SAMSUNG-SM-G900V");
//		//capabilities.setCapability("app", app.getAbsolutePath());
//
//		try {
//			//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//			driver = new RemoteWebDriver(new URL("http://oneselenium.verizon.com:4444/wd/hub"), capabilities);
//			// driver.installApp("/Users/innamsr/Downloads/selendroid-test-app-0.17.0.apk");
//
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	
//	
//	@Test
//	public void test1(){
//		//driver.findElement(By.className("android.widget.EditText")).sendKeys("12345");
//		System.out.println("testing");
//	}
//	
//	//@BeforeMethod
//		public static void browser_Android() {
//
//			//File app = new File("/Users/innamsr/Downloads/selendroid-test-app-0.17.0.apk");
//
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities.setCapability("automationName", "appium");
//			//capabilities.setCapability("automationName", "XCUITest");
//			capabilities.setCapability("platformName", "Android");
//			capabilities.setCapability("platformVersion", "5.1.1");
//			capabilities.setCapability("deviceName", "emulator-5554");
//			capabilities.setCapability("udid", "emulator-5554");
//			capabilities.setCapability("browserName", "Chrome");
//			//capabilities.setCapability("app", app.getAbsolutePath());
//
//			try {
//				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//				//driver = new RemoteWebDriver(new URL("http:143.91.240.197:4444/wd/hub"), capabilities);
//				// driver.installApp("/Users/innamsr/Downloads/selendroid-test-app-0.17.0.apk");
//
//			} catch (MalformedURLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			
//			driver.get("http://vzw.com");
//
//		}
//		
//		public static void main(String[] args) {
//			
//			browser_Android();
//		}
//
//	@Test
//
//	public void testShouldBeAbleToEnterText() {
//		WebElement inputField = driver.findElement(By.id("my_text_fieldCD"));
//		inputField.sendKeys("Selendroid");
//		Assert.assertEquals("Selendroid", inputField.getText());
//
//	}
//
//	 //@BeforeMethod
//	public void native_IOS() {
//
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("platformName", "iOS");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
//		capabilities.setCapability("automationName", "XCUITest");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Sri");
//		// capabilities.setCapability(MobileCapabilityType.UDID,
//		// "bea2bce97220d05cbc1a949c5173117bf80f34a8");
//		// capabilities.setCapability("xcodeConfigfile",
//		// "/Users/innamsr/appium-1.6.1/node_modules/appium-xcuitest-driver/WebDriverAgent/myconfig.xcconfig");
////		capabilities.setCapability(MobileCapabilityType.APP,
////				"/Users/innamsr/Library/Developer/Xcode/DerivedData/UICatalog-epobmnodfcqmuogozdznjsqjqwbu/Build/Products/Debug-iphoneos/UICatalog.app");
//		// capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,
//		// "Safari");
//		// capabilities.setCapability("realDeviceLogger",
//		// "/usr/local/lib/node_modules/deviceconsole/deviceconsole");
//
//		try {
//
//			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//
//			// driver = new IOSDriver(new
//			// URL("http://192.168.1.152:4444/wd/hub"), capabilities);
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//
//		}
//	}
//	 
//	 
//	// @Test
//	 public void sampletest() throws InterruptedException {
//	 driver.findElement(By.xpath("//UIAApplicationIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).click();
//	 driver.findElement(By.xpath("//UIAApplicationIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).click();
//	 driver.findElement(By.name("OK")).click();
//	 Thread.sleep(2000);
//	
//	 
//	 }
//
//	// @Test
//	public void testiOS() throws InterruptedException {
//		driver.findElement(
//				By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).click();
//		driver.findElement(By.name("Back")).click();
//	}
//
//	@AfterMethod
//
//	public void quit() {
//		clearCookies();
//		closeSafariTabs();
//		driver.quit();
//
//	}
//	
//	
//	public void clearCookies(){
//		((JavascriptExecutor)driver).executeScript("var cookies = document.cookie.split(\";\");"
//		+ "for (var i = 0; i < cookies.length; i++) {"
//		+ "var cookie = cookies[i];"
//		+ "	var eqPos = cookie.indexOf(\"=\");"
//		+ "	var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;"
//		+ "	document.cookie = name + \"=;expires=Thu, 01 Jan 1970 00:00:00 GMT\";"
//		+ "	};");
//		}
//	
//	public void closeSafariTabs(){
//		try{
//			Set<String> contextNames = ((AppiumDriver) driver).getContextHandles();
//			for (String contextName : contextNames) {                       
//				System.out.println("contextName " + contextName);
//				if (contextName.contains("WEBVIEW")) 
//					((AppiumDriver) driver).context(contextName);
//				driver.close();
//			}
//		}catch(Exception e){};
//	}
//
//	// @BeforeMethod
//	public void IOS9support() {
//
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("platformName", "iOS");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3.4");
//		capabilities.setCapability("automationName", "XCUITest");
//		// capabilities.setCapability("deviceName", "iPhone 7");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Verizon ipad");
//		capabilities.setCapability(MobileCapabilityType.UDID, "bea2bce97220d05cbc1a949c5173117bf80f34a8");
//		// capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
//		// "Bac");
//		// capabilities.setCapability(MobileCapabilityType.UDID,
//		// "6bbef872a63a670d48faf045b996a3024bfe1f39");
//		// capabilities.setCapability("xcodeConfigfile",
//		// "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/Config.xcconfig");
//		capabilities.setCapability("xcodeConfigfile",
//				"/Users/innamsr/appium-1.6.1/node_modules/appium-xcuitest-driver/WebDriverAgent/myconfig.xcconfig");
//		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
//		capabilities.setCapability("realDeviceLogger", "/usr/local/lib/node_modules/deviceconsole/deviceconsole");
//		// capabilities.setCapability("showIOSLog", true);
//		// System.out.println(port1);
//		try {
//
//			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//			
//			
//
//			// driver = new IOSDriver(new
//			// URL("http://192.168.1.152:4444/wd/hub"), capabilities);
//			driver.get("http://vzw.com");
//			
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	public void safariClearHistoryCookies(AppiumDriver<WebElement> driver) {
//
//		// Click on Home button
//		deviceHome(driver);
//
//		// Close settings if its running
//		closeApplication(driver, "Settings");
//
//		// Start settings
//		openApplication(driver, "Settings");
//
//		// Switch the context to Native
//		switchToContext(driver, "NATIVE_APP");
//
//		// Check if the control is in another option - by checking whether back
//		// button is displayed - Click on Back 2 times depending on where in the
//		//settings the control is present - For example if the settings open in 
//		//Software update, then we have to click twice on Back to come to Settings
//		//main screen
//		try {
//			driver.findElement(By.name("Back")).click();
//		} catch (Exception NoSuchElementException) {
//		}
//		try {
//			driver.findElement(By.name("Back")).click();
//		} catch (Exception NoSuchElementException) {
//		}
//
//		// Click on Safari
//		try {
//			driver.findElement(By.xpath("//UIATableCell[@name='Safari']")).click();
//		} catch (Exception NoSuchElementException) {
//			//driver.scrollToExact("Safari");
//			driver.findElement(By.xpath("//UIATableCell[@name='Safari']")).click();
//		}
//
//		// Click on Clear history and website data
//		try {
//			driver.findElement(By.xpath("//UIATableCell[@name='Clear History and Website Data']")).click();
//		} catch (Exception NoSuchElementException) {
//			//driver..scrollTo("Clear History and Website Data");
//			driver.findElement(By.xpath("//UIATableCell[@name='Clear History and Website Data']")).click();
//		}
//
//		// Click on Clear History and Data only if its enabled
//		if (driver.findElement(By.name("Clear History and Data")).getAttribute("enabled").equals("true"))
//			driver.findElement(By.name("Clear History and Data")).click();
//
//		// Close settings
//		closeApplication(driver, "Settings");
//
//	}
//
//	public static void deviceHome(RemoteWebDriver driver2) {
//		System.out.println("hitting device HOME key");
//		Map<String, Object> params1 = new HashMap<String, Object>();
//		driver2.executeScript("mobile:handset:ready", params1);
//	}
//
//	public static void openApplication(RemoteWebDriver driver, String AppName) {
//		System.out.println("opening application: " + AppName);
//		String command = "mobile:application:open";
//		Map<String, Object> Parms = new HashMap<String, Object>();
//		Parms.put("name", AppName);
//		driver.executeScript(command, Parms);
//	}
//
//	public static void switchToContext(RemoteWebDriver driver, String context) {
//		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(driver);
//		Map<String, String> params = new HashMap<String, String>();
//		params.put("name", context);
//		executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
//	}
//
//	public static void closeApplication(RemoteWebDriver driver, String AppName) {
//		System.out.println("closing application: " + AppName);
//		String command = "mobile:application:close";
//		Map<String, Object> Parms = new HashMap<String, Object>();
//		Parms.put("name", AppName);
//		driver.executeScript(command, Parms);
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}
