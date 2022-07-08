package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	//Field
	private static final float charges = 80.0f;

	//constructor
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	public float getCharge() {
		return GSPrimeAcc.charges;
	}

	//methods
	@Override
	public void bookProduct(float book) {

		System.out.println("For Prime user Charges are: " + getCharges()+" with NO Delivery charges");
	}

	@Override
	public String toString() {
		return super.toString();
	}

}