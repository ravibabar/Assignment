package com.promos.utilities;

import java.util.HashMap;

public class ItemsAndPromotionsPricesHelper {

	private static HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
	final static double priceForMix=30.0;

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
			noOfUnits = NumberOfUnitsInGroup.A.getValue();
		} else if (ch == 'B') {
			noOfUnits = NumberOfUnitsInGroup.B.getValue();
		}
		return noOfUnits;
	}

	public static Double getPriceForNoOfUnits(Character ch) {
		Double noOfUnits = 0.0;
		if (ch == 'A') {
			noOfUnits = PricesForGroup.A.getValue();
		} else if (ch == 'B') {
			noOfUnits = PricesForGroup.B.getValue();
		}
		return noOfUnits;
	}
	
	public static Double getPriceForMixedUnits() {
		return priceForMix;
	}
	

}

enum NumberOfUnitsInGroup {
	A(3), B(2);

	private final int value;

	NumberOfUnitsInGroup(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}

enum PricesForGroup {
	A(130.0), B(45.0);

	private final double value;

	PricesForGroup(final double newValue) {
		value = newValue;
	}

	public double getValue() {
		return value;
	}
}

