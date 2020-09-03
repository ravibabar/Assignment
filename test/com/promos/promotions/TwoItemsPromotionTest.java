package com.promos.promotions;


import org.junit.Test;


import junit.framework.Assert;

public class TwoItemsPromotionTest {

	@Test
	public void testPromotionForMixUnits1() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(2,1);

		Assert.assertEquals(50.0, promoEngine.calculateDiscount());
	}

	
	@Test
	public void testPromotionForMixUnits2() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(1,1);

		Assert.assertEquals(30.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMixUnits3() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(1,0);

		Assert.assertEquals(20.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMixUnits4() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(0,1);

		Assert.assertEquals(15.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMixUnits5() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(1,2);

		Assert.assertEquals(45.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMixUnits6() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(2,2);

		Assert.assertEquals(60.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMixUnits7() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(5,2);

		Assert.assertEquals(120.0, promoEngine.calculateDiscount());
	}

}
