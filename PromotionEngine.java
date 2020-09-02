package com.promos.discounts;

import java.util.HashMap;
import java.util.Map;

public class PromotionEngine {

	public double getTotalPrice(HashMap<Character, Integer> hs) {

		double totPrice = 0.0;
		Promotion p = null;

		for (Map.Entry<Character, Integer> entry : hs.entrySet()) {

			char c = entry.getKey();
			int v = entry.getValue();

			int cValue = 0;

			switch (c) {

			case 'A':
				p = new MultipleUnitsPromotion(c, v); // needs to change to have
														// loose coupling
				totPrice += p.calculateDiscount();
				break;
			case 'B':
				p = new MultipleUnitsPromotion(c, v); // needs to change to have
														// loose coupling
				totPrice += p.calculateDiscount();
				break;
			case 'C':
				cValue = v;
				if(!hs.containsKey('D')){
					p = new MixUnitsPromotion(cValue, v);
					totPrice += p.calculateDiscount();
					break;

				}

			case 'D':
				p = new MixUnitsPromotion(cValue, v);
				totPrice += p.calculateDiscount();

			}

		}

		return totPrice;

	}

}
