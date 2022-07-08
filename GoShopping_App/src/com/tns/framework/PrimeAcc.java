package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {

	//field
	private boolean isPrime = true;
	private static final float deliveryCharges = 50.0f;

	//Constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	public boolean getisPrime() {
		return this.isPrime;
	}

	public float getDeliverycharges() {
		return deliveryCharges;
	}

	//methods
	@Override
	public void bookProduct(float book) {

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
	
