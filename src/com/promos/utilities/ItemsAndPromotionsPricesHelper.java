package com.promos.utilities;

import java.util.HashMap;

public class ItemsAndPromotionsPricesHelper {

	private static HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

	static {
		hs.put(new Character('A'), new Integer(50));
		hs.put(new Character('B'), new Integer(30));
		hs.put(new Character('C'), new Integer(20));
		hs.put(new Character('D'), new Integer(15));
	}

	public static Integer getPrice(Character ch) {
		return (Integer) hs.get(ch);
	}

	public static Integer getnoOfUnitsForUnits(Character ch) {
		int noOfUnits = 0;
		if (ch == 'A') {
			noOfUnits = 3;
		} else if (ch == 'B') {
			noOfUnits = 2;
		}
		return noOfUnits;
	}

	public static Double getPriceForNoOfUnits(Character ch) {
		Double noOfUnits = 0.0;
		if (ch == 'A') {
			noOfUnits = 130.0;
		} else if (ch == 'B') {
			noOfUnits = 45.0;
		}
		return noOfUnits;
	}
	
	public static Double getPriceForMixedUnits() {
		Double priceForMix = 30.0;
		return priceForMix;
	}

}
