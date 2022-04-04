package PageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {


public HomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);	

}


@FindBy(id="ao-clp-clean-search__where-input")
public WebElement whereTextBox;

@FindBy(xpath="//ul[@class='autocomplete-list pre']")
public WebElement autosuggest;

@FindBy(id="ao-clp-clean-search__when-input")
public WebElement whenTextBox;

@FindBy(xpath="//div[@data-value='may-2022']")
public WebElement monthSelection;



@FindBy(xpath="//button[contains(text(),'Search')]")
public WebElement searchButton;



public void setLocation1(String textToSelect) throws InterruptedException {
	 
		
		whereTextBox.click();
		
		
		
		String innerHTML = autosuggest.getAttribute("innerHTML");
		System.out.println(innerHTML);
		
		List<WebElement> liElements = autosuggest.findElements(By.tagName("li"));
		Thread.sleep(3000);
		
		for (WebElement element : liElements) {
			//System.out.println(element.getText());
			if (element.getText().contains(textToSelect)) {
				System.out.println("Selected: " + element.getText());
				element.click();
				break;
			}
		}
	}


public void setLocation(String loc) {
	whereTextBox.sendKeys(loc);
}

public void setDate() throws InterruptedException {
	whenTextBox.click();
	Thread.sleep(2000);
	monthSelection.click();
}


public void clickSearch() {
	searchButton.click();
}



public void searchTours(String loc) throws InterruptedException
{
	this.setLocation1(loc);
	//this.setDate();
	Thread.sleep(5000);
	this.clickSearch();
}













}
