package test;

import org.junit.Test;

import com.promos.discounts.MixUnitsPromotion;
import com.promos.discounts.MultipleUnitsPromotion;

import junit.framework.Assert;

public class MixUnitsPromotionsTest {

	@Test
	public void testPromotionForMultipleUnits1() {
		MixUnitsPromotion promoEngine = new MixUnitsPromotion(2,1);

		Assert.assertEquals(50.0, promoEngine.calculateDiscount());
	}

	
	@Test
	public void testPromotionForMultipleUnits2() {
		MixUnitsPromotion promoEngine = new MixUnitsPromotion(1,1);

		Assert.assertEquals(30.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMixUnits1() {
		MixUnitsPromotion promoEngine = new MixUnitsPromotion(1,0);

		Assert.assertEquals(20.0, promoEngine.calculateDiscount());
	}
	
	@Test
	public void testPromotionForMixUnits2() {
		MixUnitsPromotion promoEngine = new MixUnitsPromotion(0,1);

		Assert.assertEquals(15.0, promoEngine.calculateDiscount());
	}

}
