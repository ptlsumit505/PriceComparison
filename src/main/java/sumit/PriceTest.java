package sumit;

import java.math.BigDecimal;

import org.testng.annotations.Test;

public class PriceTest extends Base {
	PriceComp pricecomp;
	
	public PriceTest() {
		super();
	}
	
	@Test
	public void iphonepriceamazonflipkart() throws InterruptedException {
		
		initialize("https://www.amazon.in");
		pricecomp = new PriceComp();
		pricecomp.searchIPhoneAmazon();
		pricecomp.selectMatchOnAmazon();
		String priceonamazon1 = pricecomp.priceOnAmazon();
		String priceonamazon2 = priceonamazon1.replaceAll("[^\\d.]", "");
		BigDecimal number = new BigDecimal(priceonamazon2);  
	//	String priceonamazon = number.stripTrailingZeros().toPlainString();
		int priceonamazon = Integer.parseInt(number.stripTrailingZeros().toPlainString());
		System.out.println(priceonamazon);
		initialize("https://www.flipkart.com");
		pricecomp = new PriceComp();
		pricecomp.searchIPhoneFlipkart();
		pricecomp.selectMatchOnFlipkart();
		String priceonflipkart1 = pricecomp.priceOnFlipkart();
		String priceonflipkart2 = priceonflipkart1.replaceAll("[^\\d.]", "");
		int priceonflipkart = Integer.parseInt(priceonflipkart2);
		System.out.println(priceonflipkart);
		
		if (priceonamazon<priceonflipkart)
		{
			System.out.println("Amazon has the lower price :" +priceonamazon);
		}
		else if(priceonflipkart<priceonamazon)
		{
			System.out.println("Flipkart has the lower price :" +priceonflipkart);
		}
		else
		{
			System.out.println("Both offer the same price");
		}
		
		
	}
}
