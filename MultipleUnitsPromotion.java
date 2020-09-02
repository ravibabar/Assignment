package com.promos.discounts;

public class MultipleUnitsPromotion implements Promotion {

	int noOfUnits;
	char unit;
	double price;
	double groupPrice;
	int items;

	public MultipleUnitsPromotion(char unit, int items) {
		this.unit = unit;
		this.items = items;
		this.price = UnitsPricesHelper.getPrice(new Character(unit)).intValue();
		this.noOfUnits = UnitsPricesHelper.getnoOfUnitsForUnits(unit);
		this.groupPrice = UnitsPricesHelper.getPriceForNoOfUnits(unit);
	}

	@Override
	public double calculateDiscount() {
		double dis = 0;
		double totPrice = 0;

		int rem = items % noOfUnits;
		totPrice = price * rem;
		totPrice += (items / noOfUnits) * groupPrice;

		// calculated for future purpose if required to check promotion
		// based on discount
		dis = (items * price) - totPrice;

		return totPrice;

	}

}
