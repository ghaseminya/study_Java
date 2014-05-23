package com.bank;

public class BankMainMinus {

	public static void main(String[] args) {
		
		BankAccountMinus bam = new BankAccountMinus(2002, "567890123", "태권브이", 10000, 100000);
		System.out.println();
			
		//한도 초과 출금
		bam.withdraw(300000);
		bam.getBalance();
		System.out.println();
		
		//정상 출금
		bam.withdraw(5000);
		System.out.println();
		
		//입금
		bam.deposit(300);
		System.out.println();
		
		//계좌정보 출력
		bam.getBalance();	

	}

}
