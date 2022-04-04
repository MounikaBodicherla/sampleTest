package TourRadar.TourRadar;


import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.TourListings;



public class TestCases extends base {
	
	
	
	@Test (priority=1)
	public void travellerLogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage(webdriver);
		HomePage hp=new HomePage(webdriver);
		TourListings tl = new TourListings(webdriver);	

	lp.login("mounika.vasanthi@gmail.com","Jul@2013");
	Thread.sleep(2000);
	hp.searchTours("India");
	Thread.sleep(2000);
	tl.sort();
	Thread.sleep(2000);
	tl.clickOnDownLoadBrochure();
	Thread.sleep(2000);
	tl.clickonViewTour();
	Thread.sleep(5000);
	
	}
		

}
