package com.promos.promotions;

import com.promos.utilities.ItemsAndPromotionsPricesHelper;

public class MultipleItemsPromotion implements Promotion {

	int noOfUnits;
	char unit;
	double price;
	double groupPrice;
	int items;

	public MultipleItemsPromotion(char unit, int items) {
		this.unit = unit;
		this.items = items;
		this.price = ItemsAndPromotionsPricesHelper.getPrice(new Character(unit)).intValue();
		this.noOfUnits = ItemsAndPromotionsPricesHelper.getnoOfUnitsForUnits(unit);
		this.groupPrice = ItemsAndPromotionsPricesHelper.getPriceForNoOfUnits(unit);
	}

	@Override
	public double calculateDiscount() {
		double dis = 0;
		double totPrice = 0;
		int rem = 0;

		if (noOfUnits != 0) {
			rem = items % noOfUnits;
			totPrice = price * rem;
			totPrice += (items / noOfUnits) * groupPrice;
			// calculated for future purpose if required to check promotion
			// based on discount
			dis = (items * price) - totPrice;
		} else {
			totPrice = price;
		}
		return totPrice;

	}

}
