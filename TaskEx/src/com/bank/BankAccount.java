package com.bank;

public class BankAccount {
	
//	public BankAccount(){}
	
	private int bAccount;
	private String bPassword;
	private String name;
	private long bBalance;

	//계좌 개설
	public BankAccount(int bAccount, String bPassword, String name, long bBalance){
		this.bAccount = bAccount;
		this.bPassword = bPassword;
		this.name = name;
		this.bBalance = bBalance;
		System.out.println( name + "님의 계좌가 개설 되었습니다");
	}
	
	//입금
	public void deposit(int coin){
		bBalance += coin;
		System.out.printf( name + "님 %,d 원이 입금되었습니다", coin);System.out.println();
		System.out.printf("계좌잔액:\t %,d", bBalance);System.out.println();
		System.out.println("=========================");
	}
	
	//출금
	public void withdraw(int coin){
		
		if( (bBalance - coin) > 0){
			bBalance -= coin;
			System.out.printf( name + "님 %,d 원이 출금되었습니다", coin);System.out.println();
			System.out.printf("계좌잔액:\t %,d", bBalance);System.out.println();
			System.out.println("=========================");			
		}else{
			System.out.println("잔고가 부족합니다");			
		}		
		
	}
	
	//계좌정보 출력
	public void getBalance(){
		System.out.println("계좌번호:\t" + bAccount);
		System.out.println("비밀번호:\t" + bPassword);
		System.out.println("예금주:\t\t" + name);
		System.out.printf("계좌잔액:\t %,d\n", bBalance);
		System.out.println("=========================");
	}
	
	
	//마이너스 계좌계설로 추가되는 항목
	public String getName(){
		return this.name;
	}
	
	public int getbAccount(){
		return this.bAccount; 
	}
		
	public String getPassword(){
		return this.bPassword; 
	}

	
	
	public long getbBalance(){
		return this.bBalance;
	}
	
	public void setBalance(long coin){
		this.bBalance = coin;
	}
}
