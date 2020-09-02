package test;

import org.junit.Test;

import com.promos.discounts.MixUnitsPromotion;
import com.promos.discounts.MultipleUnitsPromotion;

import junit.framework.Assert;

public class MixUnitsPromotionsTest {

	@Test
	public void testPromotionForMultipleUnits1() {
		MixUnitsPromotion promoEngine = new MixUnitsPromotion('C','D');

		Assert.assertEquals(30.0, promoEngine.calculateDiscount());
	}

}
