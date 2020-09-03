package com.promos.promotions;


import org.junit.Test;


import junit.framework.Assert;

public class MultipleItemsPromotionTest {

	@Test
	public void testPromotionForMultipleUnits1() {
		MultipleItemsPromotion promoEngine = new MultipleItemsPromotion('A', 5);

		Assert.assertEquals(230.0, promoEngine.calculateDiscount());
	}

	@Test
	public void testPromotionForMultipleUnits2() {
		MultipleItemsPromotion promoEngine = new MultipleItemsPromotion('B', 5);

		Assert.assertEquals(120.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMultipleUnits3() {
		MultipleItemsPromotion promoEngine = new MultipleItemsPromotion('B', 1);

		Assert.assertEquals(30.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMultipleUnits4() {
		MultipleItemsPromotion promoEngine = new MultipleItemsPromotion('A', 1);

		Assert.assertEquals(50.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMultipleUnits5() {
		MultipleItemsPromotion promoEngine = new MultipleItemsPromotion('C', 1);

		Assert.assertEquals(20.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMultipleUnits6() {
		MultipleItemsPromotion promoEngine = new MultipleItemsPromotion('D', 1);

		Assert.assertEquals(15.0, promoEngine.calculateDiscount());
	}
	

}
