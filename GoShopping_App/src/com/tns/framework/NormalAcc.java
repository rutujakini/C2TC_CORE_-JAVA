package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {

	//Field
	private final static float deliveryCharges = 55.0f;

	// Constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
	}

	public static float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	//methods
	@Override
	public void bookProduct(float book) {

	}

	@Override
	public String toString() {
		return super.toString() + " NormalAcc{" + "deliveryCharges=" + deliveryCharges + '}';
	}
}