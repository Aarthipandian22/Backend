package com.java.basics;

abstract class payment{
	abstract void processpayment();
}
class UPIpayment extends payment{
	@Override
	void processpayment() {
		System.out.println("payment processed through UPI");
	}
}
class CreditCardPayment extends payment{
	@Override
	void processpayment(){
		System.out.println("payment processed through credit card");
	}
}
public class paymentAbstract {

	public static void main(String[] args) {
		payment p;
		p = new UPIpayment();
		p.processpayment();
		
		p=new CreditCardPayment();
		p.processpayment();
	}

}
