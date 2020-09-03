package com.promos.engine;

import java.util.HashMap;
import java.util.Map;

import com.promos.promotions.MultipleItemsPromotion;
import com.promos.promotions.Promotion;
import com.promos.promotions.TwoItemsPromotion;

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
				p = new MultipleItemsPromotion(c, v); // needs to change to have
														// loose coupling
				totPrice += p.calculateDiscount();
				break;
			case 'B':
				p = new MultipleItemsPromotion(c, v); // needs to change to have
														// loose coupling
				totPrice += p.calculateDiscount();
				break;
			case 'C':
				cValue = v;
				if(!hs.containsKey('D')){
					p = new TwoItemsPromotion(c, v);
					totPrice += p.calculateDiscount();
				}
				break;

			case 'D':
				p = new TwoItemsPromotion(c, v);
				totPrice += p.calculateDiscount();

			}

		}

		return totPrice;

	}

}
