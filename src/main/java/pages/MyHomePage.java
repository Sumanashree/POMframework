package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {

	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(how=How.LINK_TEXT,using="Leads")//@find by is an annotation and it will be recognized only at method level so only after creating method write findby
	private WebElement eleLeadslink;

	public MyLeadsPage clickleads() {
		click(eleLeadslink);
		return new MyLeadsPage();
	}
}




