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

}
