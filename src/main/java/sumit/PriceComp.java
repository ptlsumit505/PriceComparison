package sumit;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceComp extends Base {
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	WebElement searchBoxAmazon;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement submitBtnAmazon;
	
	@FindBy(xpath="(//*[contains(text(),'iPhone XR (64GB) - Yellow')])[4]")
	WebElement iphoneXR64GBAmazon;
	
	@FindBy(xpath="//*[@id='add-to-cart-button']")
	WebElement addcart;
	
	@FindBy(xpath="//*[@id='priceblock_ourprice']")
	WebElement iphonePriceAmazon;
	
	@FindBy(xpath="//*[contains(text(),'✕')]")
	WebElement closeLoginPromptFlipkart;
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	WebElement searchBoxFlipkart;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtnFlipkart;
	
	@FindBy(xpath="//*[contains(text(),'iPhone XR') and contains(text(),'64') and contains(text(),'Yellow')]")
	WebElement iphoneXR64GBYellowFlipkart;
	
	@FindBy(xpath="//div[@class='_1vC4OE _3qQ9m1']")
	WebElement iphonePriceFlipkart;
	

	
	public PriceComp() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchIPhoneAmazon () throws InterruptedException {
		
		WebDriverWait w1 = new WebDriverWait(driver, 20);
		w1.until(ExpectedConditions.elementToBeClickable(submitBtnAmazon));
		Thread.sleep(12000);
		searchBoxAmazon.sendKeys("iPhone XR (64GB) - Yellow");
		submitBtnAmazon.click();
	}
	
	public void selectMatchOnAmazon() throws InterruptedException{
		WebDriverWait w1 = new WebDriverWait(driver, 20);
		w1.until(ExpectedConditions.elementToBeClickable(submitBtnAmazon));
		iphoneXR64GBAmazon.click();
		Thread.sleep(7000);
		
	}
	
	public String priceOnAmazon() throws InterruptedException {
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		WebDriverWait w1 = new WebDriverWait(driver, 20);
		w1.until(ExpectedConditions.elementToBeClickable(submitBtnAmazon));
		String priceAmazon = iphonePriceAmazon.getText();
		driver.quit();
		
		return priceAmazon;
		
		
	}
	
	public void searchIPhoneFlipkart() throws InterruptedException {
		Thread.sleep(10000);
		try{
				closeLoginPromptFlipkart.click();
		}
		catch (Exception e) {
			
		}
		Thread.sleep(5000);
		WebDriverWait w1 = new WebDriverWait(driver, 20);
		w1.until(ExpectedConditions.elementToBeClickable(submitBtnFlipkart));
		Thread.sleep(3000);
		searchBoxFlipkart.sendKeys("iPhone XR (64GB) - Yellow");
		submitBtnFlipkart.click();
		Thread.sleep(5000);
	}
	
	public void selectMatchOnFlipkart() throws InterruptedException{
		
		WebDriverWait w1 = new WebDriverWait(driver, 20);
		w1.until(ExpectedConditions.elementToBeClickable(submitBtnFlipkart));
		iphoneXR64GBYellowFlipkart.click();
		Thread.sleep(7000);
		
	}
	
	public String priceOnFlipkart() throws InterruptedException {
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		WebDriverWait w1 = new WebDriverWait(driver, 20);
		w1.until(ExpectedConditions.elementToBeClickable(submitBtnFlipkart));
		String priceFlipkart = iphonePriceFlipkart.getText();
		
		return priceFlipkart;
		
	}

}
