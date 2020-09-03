package com.promos.promotions;

import com.promos.utilities.ItemsAndPromotionsPricesHelper;

public class TwoItemsPromotion implements Promotion {

	double unit1;
	double price;
	double unit2;

	public TwoItemsPromotion(double unit1, double unit2) {
		this.unit1 = unit1;
		this.unit2 = unit2;
        this.price=ItemsAndPromotionsPricesHelper.getPriceForMixedUnits();
	}

	private double dis;

	@Override
	public double calculateDiscount() {
		double dis = 0;
		double totPrice = 0;

		double min = 0;
		double max = 0;
		double remn = 0;

		if (unit1 > unit2) {
			min = unit2;
			max = unit1;

			remn = max - min;
			totPrice = remn
					* ItemsAndPromotionsPricesHelper.getPrice(new Character('C'))  // needs to remove hardcoding
							.intValue();

		} else {
			min = unit1;
			max = unit2;

			remn = max - min;
			totPrice = remn
					* ItemsAndPromotionsPricesHelper.getPrice(new Character('D')) // needs to remove hardcoding
							.intValue();
		}

		totPrice += min * price;

		// for future purpose
		dis = ((ItemsAndPromotionsPricesHelper.getPrice(new Character('C')).intValue() * unit1) + (ItemsAndPromotionsPricesHelper
				.getPrice(new Character('D')).intValue() * unit2)) - totPrice;

		return totPrice;

	}

}
