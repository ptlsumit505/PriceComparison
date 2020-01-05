package sumit1;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReviewHotel extends Base {
	
	@FindBy(xpath="//div[@title='Search']")
	WebElement  searchBoxTripadvisor;
	
	@FindBy(xpath="//*[@id=\'mainSearch\']")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\'SEARCH_BUTTON\']")
	WebElement clickSearchButton;
	
	@FindBy(xpath="//span[text()='Club Mahindra Madikeri, Coorg']")
	WebElement clickFastResult;
	
	@FindBy(xpath="//*[@id=\'component_12\']/div/div[2]/div/div[2]/div/div[1]")
	WebElement clickWriteReview;
	
	@FindBy(xpath="//*[@id=\'bubble_rating\']")
	WebElement Hover;
	
	@FindBy(xpath="//span[@class='ui_bubble_rating fl bubble_50']")
	WebElement clickStar;
	
	@FindBy(xpath="//*[@id=\'ReviewTitle\']")
	WebElement titleOfReview;
	
	@FindBy(xpath="//*[@id=\'ReviewText\']")
	WebElement yourReview;
	
	@FindBy(xpath="//*[@id='DQ_RATINGS']")
	WebElement hotelRatings;
	
	@FindBy(xpath="//*[@id=\'qid12_bubbles\']")
	WebElement 	hotelRatingServiceHover;
	
	@FindBy(xpath="//span[@class='answersBubbles ui_bubble_rating fl qid12 bubble_50']")
	WebElement hotelRatingServiceClick;
	
	@FindBy(xpath="//*[@id=\'qid190_bubbles\']")
	WebElement hotelRatingSleepQualityHover;
	
	@FindBy(xpath="//span[@class='answersBubbles ui_bubble_rating fl qid190 bubble_50']")
	WebElement hotelRatingSleepQualityClick;
	
	@FindBy(xpath="//*[@id=\'qid47_bubbles\']")
	WebElement hotelRatingLocationHover;
	
	@FindBy(xpath="//span[@class='answersBubbles ui_bubble_rating fl qid47 bubble_50']")
	WebElement hotelRatingLocationClick;
	
	@FindBy(xpath="//*[@id=\'qid11_bubbles\']")
	WebElement hotelRatingRoomsHover;
	
	@FindBy(xpath="//span[@class='answersBubbles ui_bubble_rating fl qid11 bubble_50']")
	WebElement hotelRatingRoomClick;
	
	@FindBy(xpath="//*[@id=\'qid13_bubbles\']")
	WebElement hotelRatingValueHover;
	
	@FindBy(xpath="//span[@class='answersBubbles ui_bubble_rating fl qid13 bubble_50']")
	WebElement hotelRatingValueClick;
	
	
	@FindBy(xpath="//*[@id=\'qid14_bubbles\']")
	WebElement hotelRatingCleanlinessHover;
	
	@FindBy(xpath="//span[@class='answersBubbles ui_bubble_rating fl qid14 bubble_50']")
	WebElement hotelRatingCleanlinessClick;
	
	@FindBy(xpath="//*[@id=\'noFraud\']")
	WebElement selectCheckBox;
	
	public ReviewHotel() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void searchClubMahindra() throws InterruptedException {
		
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		w1.until(ExpectedConditions.elementToBeClickable(searchBoxTripadvisor));
		Thread.sleep(5000);
		searchBoxTripadvisor.click();
	}
	
	
	public void  select1stResult() throws InterruptedException {
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		w1.until(ExpectedConditions.elementToBeClickable(searchBox));
		Thread.sleep(5000);
		searchBox.sendKeys("Club Mahindra");
		clickSearchButton.click();
	}
	
	public void clickfastHotel() throws InterruptedException {
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		w1.until(ExpectedConditions.elementToBeClickable(clickFastResult));
		Thread.sleep(5000);
		clickFastResult.click();
	}
	
	public void reviewOfHotel() throws InterruptedException {
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	WebDriverWait w1 = new WebDriverWait(driver, 60);
	w1.until(ExpectedConditions.elementToBeClickable(clickWriteReview));
	Thread.sleep(10000);	
	clickWriteReview.click();
	
	}
	
	public void ratingOfHotel() throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		WebDriverWait stars = new WebDriverWait(driver, 30);
		stars.until(ExpectedConditions.visibilityOf(Hover));
		
					Actions action1= new Actions(driver);
					action1.moveToElement(Hover).perform();
					
					Thread.sleep(3000);
			//		action1.moveToElement(clickOnStars).click().perform();
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("document.getElementById('bubble_rating').setAttribute('class','ui_bubble_rating fl bubble_50')");
					Thread.sleep(1000);
					clickStar.click();
					Thread.sleep(3000);
					
	}
	
	public void getTitleReview() {
		
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		w1.until(ExpectedConditions.elementToBeClickable(titleOfReview));
		titleOfReview.sendKeys("We enjoyed a lot at club Mahindra madikeri");
		
	}
	
	public void writeReview() throws InterruptedException {
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		w1.until(ExpectedConditions.elementToBeClickable(yourReview));
		yourReview.sendKeys("We enjoyed allot in madikeri rooms very need n clean... "
				+ "Food was tasty... Especially new celebration was really amazing.."
				+ " Thank u for giving good hospitality... "
				+ "In madikeri will visit again also will suggested to our family and friends..");
		Thread.sleep(3000);
		
		
		
	}
	
	public void hotelsRatingService() throws InterruptedException {
		try {
			JavascriptExecutor jsc = (JavascriptExecutor) driver;
			jsc.executeScript("arguments[0].scrollIntoView(true);",hotelRatings);
			
			if(hotelRatingServiceHover.isDisplayed()) {
		
		WebDriverWait w = new WebDriverWait(driver, 40);
		w.until(ExpectedConditions.elementToBeClickable(hotelRatingServiceHover));
		Actions action= new Actions(driver);
		action.moveToElement(	hotelRatingServiceHover).perform();
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('qid12_bubbles').setAttribute('class','answersBubbles ui_bubble_rating fl qid12 bubble_50')");
		Thread.sleep(1000);
		hotelRatingServiceClick.click();
		Thread.sleep(3000);
			}
		
		if(hotelRatingRoomsHover.isDisplayed()) {
			
		WebDriverWait w1 = new WebDriverWait(driver, 40);
		w1.until(ExpectedConditions.elementToBeClickable(hotelRatingRoomsHover));
		Actions action1= new Actions(driver);
		action1.moveToElement(  hotelRatingRoomsHover).perform();
		
		Thread.sleep(5000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("document.getElementById('qid11_bubbles').setAttribute('class','answersBubbles ui_bubble_rating fl qid11 bubble_50')");
		Thread.sleep(5000);
		hotelRatingRoomClick.click();
		Thread.sleep(5000);
		}
		
		if(hotelRatingCleanlinessHover.isDisplayed()) {
		WebDriverWait w2 = new WebDriverWait(driver, 40);
		w2.until(ExpectedConditions.elementToBeClickable(hotelRatingCleanlinessHover));
		Actions action2= new Actions(driver);
		action2.moveToElement(hotelRatingCleanlinessHover).perform();
		
		Thread.sleep(5000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("document.getElementById('qid14_bubbles').setAttribute('class','answersBubbles ui_bubble_rating fl qid14 bubble_50')");
		Thread.sleep(5000);
		hotelRatingCleanlinessClick.click();
		Thread.sleep(5000);	
		}
		
		if(hotelRatingLocationHover.isDisplayed()) {
		WebDriverWait w3 = new WebDriverWait(driver, 40);
		w3.until(ExpectedConditions.elementToBeClickable(hotelRatingLocationHover));
		Actions action3= new Actions(driver);
		action3.moveToElement(hotelRatingLocationHover).perform();
		
		Thread.sleep(5000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("document.getElementById('qid47_bubbles').setAttribute('class','answersBubbles ui_bubble_rating fl qid47 bubble_50')");
		Thread.sleep(5000);
		hotelRatingLocationClick.click();
		Thread.sleep(5000);	
		}
		
		if(hotelRatingSleepQualityHover.isDisplayed()) {
		WebDriverWait w4 = new WebDriverWait(driver, 40);
		w4.until(ExpectedConditions.elementToBeClickable(hotelRatingSleepQualityHover));
		Actions action4= new Actions(driver);
		action4.moveToElement(hotelRatingSleepQualityHover).perform();
		
		Thread.sleep(5000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("document.getElementById('qid190_bubbles').setAttribute('class','answersBubbles ui_bubble_rating fl qid190 bubble_50')");
		Thread.sleep(5000);
		hotelRatingSleepQualityClick.click();
		Thread.sleep(5000);	
		}
		
		if(hotelRatingValueHover.isDisplayed()) {
		WebDriverWait w5 = new WebDriverWait(driver, 40);
		w5.until(ExpectedConditions.elementToBeClickable(hotelRatingValueHover));
		Actions action5= new Actions(driver);
		action5.moveToElement(hotelRatingValueHover).perform();
		
		Thread.sleep(5000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("document.getElementById('qid13_bubbles').setAttribute('class','answersBubbles ui_bubble_rating fl qid13 bubble_50')");
		Thread.sleep(5000);
		hotelRatingValueClick.click();
		Thread.sleep(5000);	
		    }
	    }	
		catch(Exception ex) {
			//hostel ratings section isnt available
		}
			
	}
	
	public void selectCheckBox() throws InterruptedException {
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		w1.until(ExpectedConditions.elementToBeClickable(selectCheckBox));
		selectCheckBox.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
