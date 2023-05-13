package LoginTest;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Amazon {

	public static void main(String[] args) {
		Playwright playwright=	Playwright.create();
		Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		   BrowserContext brContext=browser.newContext();
		     Page page=brContext.newPage(); 
		     page.locator("//input[@id='twotabsearchtextbox']").fill("ipone");
		Locator totalAmzonlink=     page.locator("//a[Contains(text(),'Amazon']");
		     System.out.println("totalAmzonlink");
		List<String> textlink=     totalAmzonlink.allInnerTexts();
for(String e:textlink)
{
	System.out.println(e);
}
	}

}
