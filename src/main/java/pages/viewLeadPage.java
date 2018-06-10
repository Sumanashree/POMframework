package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class viewLeadPage extends ProjectMethods{

	public viewLeadPage()
	{
		PageFactory.initElements(driver,this);
}

	@FindBy(how=How.XPATH,using="//span[@class='requiredField']")
	private WebElement eleverifyfnme;
	
	public viewLeadPage clickcreatelead(String data) {
		verifyExactText(eleverifyfnme,data);
	return this;

	}
}
