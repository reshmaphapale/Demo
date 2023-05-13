package LoginTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FacebookLoginTest {

	public static void main(String[] args) {
	Playwright playwright=	Playwright.create();
	Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	   BrowserContext brContext=browser.newContext();
	     Page page=brContext.newPage(); 
	     page.navigate("https://www.facebook.com/");
	     page.type("//input[@id='email']", "abc12@gmail.com");
	     page.type("//input[@id='pass']", "abc123");
	     page.click("//button[@name='login']");
	     

	}

}
