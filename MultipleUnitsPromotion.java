package com.promos.discounts;

public class MultipleUnitsPromotion implements Promotion{
	
	int noOfUnits;
	char unit;
	double price;
	double groupPrice;
	
	int items;
	private double dis;
	
	public MultipleUnitsPromotion( char unit) {
		this.unit = unit;
		this.price = UnitsPricesHelper.getPrice(new Character(unit)).intValue();
		this.noOfUnits=UnitsPricesHelper.getnoOfUnitsForUnits(unit);
		this.groupPrice=UnitsPricesHelper.getPriceForNoOfUnits(unit);
	}
	public int getNoOfUnits() {
		return noOfUnits;
	}

	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}

	public char getUnit() {
		return unit;
	}

	public void setUnit(char unit) {
		this.unit = unit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	@Override
	public double calculateDiscount(){
		double dis = 0;
		double totPrice=0;

		int rem=items%noOfUnits;
		totPrice=price*rem; 
		totPrice+=(items/noOfUnits)*groupPrice;

		dis=(items*price)-totPrice;
		this.setDis(dis);
		
		return totPrice;
		
	}

	private void setDis(double dis) {
       this.dis=dis;		
	}
	

	public double getDis(){
       return this.dis;	
	}

}
