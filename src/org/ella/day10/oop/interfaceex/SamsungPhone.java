package org.ella.day10.oop.interfaceex;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void pirntLogo() {
		System.out.println("===== SAMSUNG =====");
	}

	@Override
	public void sendCall() {
		System.out.println("===== S-PHONE CALL =====");
	}

}
