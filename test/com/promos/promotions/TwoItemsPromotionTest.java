package com.promos.promotions;


import org.junit.Test;

import com.promos.TwoItemsPromotion;

import junit.framework.Assert;

public class TwoItemsPromotionTest {

	@Test
	public void testPromotionForMultipleUnits1() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(2,1);

		Assert.assertEquals(50.0, promoEngine.calculateDiscount());
	}

	
	@Test
	public void testPromotionForMultipleUnits2() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(1,1);

		Assert.assertEquals(30.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMixUnits1() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(1,0);

		Assert.assertEquals(20.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMixUnits2() {
		TwoItemsPromotion promoEngine = new TwoItemsPromotion(0,1);

		Assert.assertEquals(15.0, promoEngine.calculateDiscount());
	}

}
