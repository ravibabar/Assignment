package com.promos.engine;


import java.util.HashMap;
import org.junit.Test;
import junit.framework.Assert;

public class PromotionsEngineTest {

	PromotionEngine promotionEngine = new PromotionEngine();

	@Test
	public void testPromotionForTwoUnits1() {

		// scenario 1
		// 1 * C
		// 1 * D

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		hs.put('C', 1);
		hs.put('D', 1);

		Assert.assertEquals(30.0, promotionEngine.getTotalPrice(hs));
	}
	
	@Test
	public void testPromotionForMultipleUnitsForTwoUnits1() {

		// scenario 2
		// 5 * A
		// 5 * B

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		hs.put('A', 5);
		hs.put('B', 5);

		Assert.assertEquals(350.0, promotionEngine.getTotalPrice(hs));
	}

	@Test
	public void testPromotionForMultipleUnitsForTwoUnits2() {

		// scenario 3
		// 1 * A
		// 1 * B

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		hs.put('A', 1);
		hs.put('B', 1);

		Assert.assertEquals(80.0, promotionEngine.getTotalPrice(hs));
	}
	
	@Test
	public void testPromotionForMultipleUnitsForManyUnits2() {

		// scenario 4
		// 1 * A
		// 1 * B
		// 1 * C
		// 1 * D

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		hs.put('A', 1);
		hs.put('B', 1);
		hs.put('C', 1);

		Assert.assertEquals(100.0, promotionEngine.getTotalPrice(hs));
	}
	
	@Test
	public void testPromotionForMultipleUnitsForManyUnits() {

		// scenario 5
		// 1 * A
		// 1 * B
		// 1 * C
		// 1 * D

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		hs.put('A', 1);
		hs.put('B', 1);
		hs.put('C', 1);
		hs.put('D', 1);

		Assert.assertEquals(110.0, promotionEngine.getTotalPrice(hs));
	}
	
	
	
	

}
