package org.google.search.selenide;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class GoogleSearch {
	private final String HOST ="https://www.google.com/";
	
	@Before
	public void openHost() {
		open(HOST);	
	}
	
	@Test
	public void CookiesHandler() {
		$("button#vc3jof.neDYw.tHlp8d").click();
		$("li.Ge0Aub").isSelected();
		sleep(500);
		$("#L2AGLb.tHlp8d").click();
		sleep(1000);
	}
	
	@Test
	public void GoogleSearchBox() {
		$("input[name=q]").click();
		$("input[name=q]").setValue("Selenide");
		sleep(1000);
		$("input[name=q]").pressEnter();
		sleep(500);
		$("div.hdtb-mitem").doubleClick();
		sleep(1000);
	}
	
	@After
	  public void endUp(){
	        sleep(2000);

	    }

}