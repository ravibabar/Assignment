package test;

import java.util.HashMap;
import org.junit.Test;
import com.promos.discounts.PromotionEngine;
import junit.framework.Assert;

public class PromotionsEngineTest {

	PromotionEngine promotionEngine = new PromotionEngine();

	@Test
	public void testPromotionForMultipleUnitsForTwoUnits1() {

		// scenario 1
		// 5 * A
		// 5 * B

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		hs.put('A', 5);
		hs.put('B', 5);

		Assert.assertEquals(350.0, promotionEngine.getTotalPrice(hs));
	}

	@Test
	public void testPromotionForMultipleUnitsForTwoUnits2() {

		// scenario 1
		// 1 * A
		// 1 * B

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		hs.put('A', 1);
		hs.put('B', 1);

		Assert.assertEquals(80.0, promotionEngine.getTotalPrice(hs));
	}

}