package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

import wdMethods.ProjectMethods;

public class TC003_HomePage extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC003_HomePage";
		testDescription="Click on leads";
		testNodes="Leads";
		category="Smoke";
		authors="Sumana";
		browserName="chrome";
		dataSheetName="TC002";
	}

	@Test(dataProvider="fetchData")
	public void Home_Page() {
		new HomePage()
		.clickcrmsfa();

	}
}