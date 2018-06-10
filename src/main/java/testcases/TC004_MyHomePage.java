package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC004_MyHomePage extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC004_MyHomePage";
		testDescription="Click on Creatlead";
		testNodes="Leads";
		category="Smoke";
		authors="Sumana";
		browserName="chrome";
		dataSheetName="TC002";
	}

	@Test(dataProvider="fetchData")
	public void Leads()
	{
		new MyHomePage()
		.clickleads();
				
	}
}