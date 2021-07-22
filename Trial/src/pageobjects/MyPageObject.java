package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Google"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = "//input[@name='q']")
	public WebElement searchTerm;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('div:nth-child(2) > div > div > div:nth-child(1) > div > div > div > div.yuRUbf > a')")
	public WebElement provarSalesforceTestingIntuitiveTestingSolutionhttpsWwwProvartestingCom;
			
}
