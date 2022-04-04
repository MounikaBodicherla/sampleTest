package PageObjects;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {


public LoginPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	

}


@FindBy(xpath="//div[@class='js-ao-header-navigation__profile-placeholder ao-header-navigation__profile-placeholder']")
public WebElement profileButton;

@FindBy(xpath="//a[contains(@href,'/account')]/span")
public WebElement profileUserButton;

@FindBy(xpath="//a[contains(@href,'/login')]")
public List<WebElement> loginButtons;

@FindBy(xpath="//a[contains(@href,'/registration')]")
public List<WebElement> signUpButtons;

@FindBy(xpath="//a[contains(@href,'/travellers/logout?type=web')]")
public List<WebElement> logoutButtons;

@FindBy(id="g_email")
public WebElement emailTextBox;

@FindBy(id="g_password")
public WebElement password;

@FindBy(xpath="//span[contains(text(),'Log In')]")
public WebElement loginButton;

public void setUserName(String strUserName) {
	emailTextBox.sendKeys(strUserName);
}


public void setPassword(String strPassword) {
    password.sendKeys(strPassword);
}


public void clickLogin() {
	loginButton.click();
}

public void logoutButton() {
	logoutButtons.get(0).click();
}

public void clickLoginInHomePage() {
	loginButtons.get(0).click();
}

public void clickOnProfile() {
	profileButton.click();
}

public void clickOnProfileUser() {
	profileUserButton.click();
}

public void login(String email,String pwd) throws InterruptedException
{
	this.clickOnProfile();
	Thread.sleep(5000);
	this.clickLoginInHomePage();
	Thread.sleep(2000);
	this.setUserName(email);
	this.setPassword(pwd);
	this.clickLogin();
}


public void logout() throws InterruptedException
{
	
	this.clickOnProfileUser();
	Thread.sleep(5000);
	this.logoutButton();
}













}
