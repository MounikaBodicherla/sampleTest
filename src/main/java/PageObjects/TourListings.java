package PageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TourListings {


public TourListings(WebDriver driver)
{
PageFactory.initElements(driver, this);	

}


@FindBy(xpath="//a[contains(@href,'/t/166957')]")
public WebElement viewTour;

@FindBy(xpath="//button[@class='aa-btn aa-btn--secondary aa-btn--xs but pdf br__button-wrapper-view-cta--secondary']")
public List<WebElement> downloadBrochure;

@FindBy(name="sort")
public WebElement sortTour;

@FindBy(xpath="//a[@class='but blue popup__input-button-link']")
public WebElement downloadBrochureButton;

@FindBy(xpath="//button[@class='mfp-close']")
public WebElement closeButton;





public void sort() throws InterruptedException
{
	Select s = new Select(sortTour);
	s.selectByIndex(1);
}

public void clickonViewTour() throws InterruptedException
{
	viewTour.click();
}

public void clickOnDownLoadBrochure() throws InterruptedException
{
	downloadBrochure.get(0).click();
	//downloadBrochureButton.click();
	closeButton.click();
}














}
