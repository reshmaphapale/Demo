package CrossBrowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Demo {

	public static void main(String[] args) {
		Playwright playwright=	Playwright.create();
		Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		   BrowserContext brContext=browser.newContext();
		     Page p1=brContext.newPage(); 
		     p1.navigate("https://www.google.com/");
		     p1.fill("#logo","Google");
		     System.out.println(p1.title());
		     

		     BrowserContext brContext1=browser.newContext();
		     Page p2=brContext.newPage();
		     p2.navigate("https://automationpractice.com/");
		     p2.fill("#search-qurey-top", "Dress");
		     System.out.println(p2.title());
		     
	}

}
