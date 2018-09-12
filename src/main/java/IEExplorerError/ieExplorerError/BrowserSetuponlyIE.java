package IEExplorerError.ieExplorerError;


import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSetuponlyIE extends Basepage {
	
	LoadProp loadprop =new LoadProp();
	String browser = loadprop.getProperty("browser");
	public void selectBrowser(){

        browser.equalsIgnoreCase("ie");
            System.setProperty("webdriver.ie.driver", "src\\test\\java\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        
	}
}
