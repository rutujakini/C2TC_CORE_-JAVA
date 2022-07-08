package com.tns.framework;

//1	abstract class
public abstract class ShopAcc {

	//fields
	private int accNo;
	private String accNm;
	private float charges;

	//constructor
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;

	}


	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

//	 methods
	public void bookProduct(float book) {
	};

	public void items(float item) {
	};
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	};
	
	
}