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
		boolean flag = false;

		for (Map.Entry<Character, Integer> entry : hs.entrySet()) {

			char c = entry.getKey();
			int v = entry.getValue();

			switch (c) {

			case 'A':
				p = new MultipleItemsPromotion(c, v); // needs to change to have loose coupling
				totPrice += p.calculateDiscount();
				break;
			case 'B':
				p = new MultipleItemsPromotion(c, v); // needs to change to have loose coupling
				totPrice += p.calculateDiscount();
				break;
			case 'C':
				if (flag)
					break;
				if (!hs.containsKey('D')) {
					p = new MultipleItemsPromotion(c, v);
					totPrice += p.calculateDiscount();
				} else {
					p = new TwoItemsPromotion(v, hs.get('D'));
					totPrice += p.calculateDiscount();
					flag = true;
				}
				break;

			case 'D':
				if (flag)
					break;
				if (!hs.containsKey('C')) {
					p = new MultipleItemsPromotion(c, v);
					totPrice += p.calculateDiscount();
				} else {
					p = new TwoItemsPromotion(v, hs.get('C'));
					totPrice += p.calculateDiscount();
					flag = true;
				}

			}

		}

		return totPrice;

	}

}
