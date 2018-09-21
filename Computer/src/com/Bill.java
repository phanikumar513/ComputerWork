package com;

public class Bill {
	int baseProductPrice;
	int billNo;
	int serviceTax;
	int TransportTax;
	double centralTax;
	double stateTax;
	double finalPrice;
	public double CentralTax(int baseProductPrice)
	{
		centralTax=(baseProductPrice/100)*5;
		return centralTax;
	}
	public double stateTax(int baseProductPrice)
	{
		stateTax=(baseProductPrice/100)*5;
		return stateTax;
	}
	public double FinalPrice(int baseProductPrice)
	{
		finalPrice=baseProductPrice+serviceTax+TransportTax+centralTax+stateTax;
		return finalPrice;
	}
	
}
