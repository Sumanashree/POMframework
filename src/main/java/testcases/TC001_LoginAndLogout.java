package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmsfa()
		.clickleads()
		.clickcreatelead()
		;			
	}
	
	@Test(dataProvider="fetchData")
	public void Home_Page() {
		new HomePage()
		.clickcrmsfa();
	}

	@Test(dataProvider="fetchData")
	public void Leads()
	{
		new MyHomePage()
		.clickleads();
				
	}
	@Test(dataProvider="fetchData")
	public void Leads()
	{
		new MyHomePage()
		.clickleads();
				
	}
}

