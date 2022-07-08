package com.tns.main;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;
import com.tns.application.*;
public class Main{
public static void main(String[] args) {
//	a. Assign instance of GSShopFactory to ShopFactory reference
		ShopFactory shopObj = new GSShopFactory();

//	b. Instantiate GSPrimeAcc and refer it through reference PrimeAcc
		PrimeAcc primeAccObj = new GSPrimeAcc(6056, "PrimeAccount_name", 1022f, true);


//	c. Instantiate GSNormalAcc and refer it through reference NormalAcc
		NormalAcc normalAccObj = new GSNormalAcc(5355, "NormalAccount_name", 3023f, NormalAcc.getDeliveryCharges());

//	d. Invoke bookProduct() method
		primeAccObj.bookProduct(3023f);
		normalAccObj.bookProduct(3023f);

//	e. Invoke toString() method
		primeAccObj.toString();
		normalAccObj.toString();
	}
}