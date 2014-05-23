package com.bank;

public class BankAccountMinus extends BankAccount{
	
	//계좌 한도
	private long limit;
	
	//마이너스 계좌 개설
		public BankAccountMinus(int bAccount, String bPassword, String name, long bBalance, long limit){ 
			//부모 클래스 생성자 호출
			super(bAccount, bPassword, name, bBalance);			
			this.limit = limit;
			
			System.out.println( name + "님의 계좌는 마이너스 통장입니다.");
		}
		
	// 출금 메소드 재정의
	@Override
	public void withdraw(int coin){
	
			
		long totalBalance;
		totalBalance = getbBalance();
		
		if( Math.abs(totalBalance - coin) <= limit){		
			totalBalance -= coin;
			System.out.printf( getName() + "님 %,d 원이 출금되었습니다", coin);System.out.println();
			
			setBalance(coin);
			System.out.printf("계좌잔액:\t %,d", getbBalance());System.out.println();
			System.out.println("=========================");			
		}else{
			System.out.println("한도 초과입니다.");			
		}	
	}
	
	//계좌잔고 출력
	public void getBalance(){
		System.out.println("마이너스 계좌번호:\t" + getbAccount());
		System.out.println("비밀번호:\t\t" + getPassword());
		System.out.println("예금주:\t\t\t" + getName());
		System.out.printf("계좌잔액:\t\t%,d\n", getbBalance());
		System.out.printf("계좌한도:\t\t%,d\n", limit);
		System.out.println("=========================");
	}
}
