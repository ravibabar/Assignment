package com.promos.promotions;


import org.junit.Test;

import com.promos.MultipleItemsPromotion;


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

}
