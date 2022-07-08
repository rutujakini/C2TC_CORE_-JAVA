package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	//constructor
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
	
	//methods
	@Override
	public void bookProduct(float charges) {
//		
		System.out.println("For Normal user Charges are: " + getCharges() + " with Delivery charge: "+ getDeliveryCharges());
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
