package sumit1;

import org.testng.annotations.Test;

public class ReviewTest extends Base {
	ReviewHotel ReviewHotel;
	
	public ReviewTest() {
		super();
	}
	@Test
	public void ClubMahindraHotels() throws InterruptedException {
		initialize("https://www.tripadvisor.in");
		ReviewHotel = new ReviewHotel();
		ReviewHotel.searchClubMahindra();
		ReviewHotel.select1stResult();
		ReviewHotel.clickfastHotel();
		ReviewHotel.reviewOfHotel();
		ReviewHotel.ratingOfHotel();
		ReviewHotel.getTitleReview();
		ReviewHotel.writeReview();
		ReviewHotel.hotelsRatingService();
		ReviewHotel.selectCheckBox();		
		
	}
	

}
