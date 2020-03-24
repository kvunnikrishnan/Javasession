package com.unni.oop2;

public class TelecoTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirtelAfrica ar=new AirtelAfrica();
		
		ar.call();
		ar.data();
		ar.sms();
		ar.International();
		ar.mobilemoney();
		
		System.out.println(TelecomSenegal.countryCode); // variabel will be access through static way. 
		System.out.println(TelecomRwanda.countrcode);
		
		System.out.println("**********************************");
		
		TigoAfrica tg=new TigoAfrica();
		
		tg.call();
		tg.churn();
		tg.data();
		tg.sms();
	

	}

}
