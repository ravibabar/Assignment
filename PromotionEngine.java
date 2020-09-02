package com.promos.discounts;

import java.util.HashMap;
import java.util.Map;

public class PromotionEngine {

	public double getTotalPrice(HashMap<Character, Integer> hs) {

		double totPrice = 0.0;
		Promotion p = null;

		for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
			
			char c = entry.getKey();
			int  v = entry.getValue();
			p = new MultipleUnitsPromotion(c, v); // needs to change to have loose coupling 
			totPrice += p.calculateDiscount();

			/*
			 * switch(c){
			 * 
			 * case 'A':
			 * 
			 * case 'B':
			 * 
			 * }
			 */
		}

		return totPrice;

	}

}
