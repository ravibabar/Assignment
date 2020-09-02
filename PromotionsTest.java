package test;

import org.junit.Test;

import com.promos.discounts.MultipleUnitsPromotion;

import junit.framework.Assert;

public class PromotionsTest {

	@Test
	public void testPromotionForMultipleUnits1() {
		MultipleUnitsPromotion promoEngine = new MultipleUnitsPromotion('A', 5);

		Assert.assertEquals(230.0, promoEngine.calculateDiscount());
	}

	@Test
	public void testPromotionForMultipleUnits2() {
		MultipleUnitsPromotion promoEngine = new MultipleUnitsPromotion('B', 5);

		Assert.assertEquals(120.0, promoEngine.calculateDiscount());
	}

}
