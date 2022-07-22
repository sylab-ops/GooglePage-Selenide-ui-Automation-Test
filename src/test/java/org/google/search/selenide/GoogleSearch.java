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
		$("#L2AGLb.tHlp8d").click();
	}
	
	@Test
	public void SearchBox() {
		$("input.gLFyf.gsfi").setValue("Abraham Sylvester");
	}
	
	@After
	  public void endUp(){
	        sleep(2000);

	    }

}