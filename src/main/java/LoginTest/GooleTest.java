package LoginTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class GooleTest {

	public static void main(String[] args) {
		 Playwright playwright=Playwright.create();
		    Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		   BrowserContext brContext=browser.newContext();
		     Page page=brContext.newPage(); 
		     page.navigate("https://www.goole.com/");
		     System.out.println(page.title());
		     page.type("input[name='q']", "automation testing");
		     page.click("input[@name='btnk'");
		     browser.close();
		     playwright.close();
		     
		     
		     
		     
	
		    }

	}

