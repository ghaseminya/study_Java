package com.bank;


public class BankMain {

	public static void main(String[] args) {
		
		//1) 생성자를 통한 계좌 개설
		BankAccount ba = new BankAccount(1001, "123456", "태권브이", 10000);
		ba.getBalance();
		
		System.out.println();
		//2) 입금
		ba.deposit(200000);
		ba.getBalance();

		System.out.println();
		//3) 출금
		ba.withdraw(9000);		//정상 출금
		
		ba.withdraw(500000);	//잔액 부족한 경우
		
		//4) 잔고
		ba.getBalance();
		
		
	}

}
