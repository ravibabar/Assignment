package com.promos.discounts;

public class MixUnitsPromotion implements Promotion {

	char unit1;
	double price;
	char unit2;

	public MixUnitsPromotion(char unit1, char unit2) {
		this.unit1 = unit1;
		this.unit2 = unit2;
        this.price=UnitsPricesHelper.getPriceForMixedUnits();
	}

	private double dis;

	@Override
	public double calculateDiscount() {
		double dis = 0;
		double totPrice = 0;

		int min = 0;
		int max = 0;
		int remn = 0;

		if (unit1 > unit2) {
			min = unit2;
			max = unit1;

			remn = max - min;
			totPrice = remn
					* UnitsPricesHelper.getPrice(new Character(unit1))
							.intValue();

		} else {
			min = unit1;
			max = unit2;

			remn = max - min;
			totPrice = remn
					* UnitsPricesHelper.getPrice(new Character(unit2))
							.intValue();
		}

		totPrice += min * price;

		// for future purpose
		dis = ((UnitsPricesHelper.getPrice(new Character(unit1)).intValue() * unit1) + (UnitsPricesHelper
				.getPrice(new Character(unit2)).intValue() * unit2)) - totPrice;

		return totPrice;

	}

}
