package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCname;

	public CreateLeadPage enterFname(String data) {
		type(eleCname,data);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFname;

	public CreateLeadPage enterSname(String data) {
		type(eleFname,data);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLname;

	public CreateLeadPage eleLname(String data)
	{
		type(eleLname,data);
		return this;
	}


	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleCreateLead;

	public viewLeadPage clickeleCreateLead(String data)
	{
		click(eleCreateLead);
		return new viewLeadPage();
	}

}
