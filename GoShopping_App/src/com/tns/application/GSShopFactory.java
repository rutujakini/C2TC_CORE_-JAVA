package com.tns.application;

import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {
	//methods
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		System.out.println(GsPrime.toString());
		return GsPrime;
	}

	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc GsNormal = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		System.out.println(GsNormal.toString());
		return GsNormal;
	}
}	