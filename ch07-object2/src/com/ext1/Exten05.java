/*
private멤버변수 상속

private 멤버도 상속이 됩니다. 
하지만 함께 상속된 다른 메소드를 통한 간접 접근만 가능합니다.

*/
package com.ext1;

class Bank
{
	private int balance;	//private멤버변수, 같은 클래스에서만 접근 가능
	
	Bank(int init){
		balance=init;
	}	
	
	protected void accumulate(int number){
		if(number<0)      // 음수는 누적 대상에서 제외
			return;
		balance+=number;
	}
	
	protected int getBalance(){
		return balance;
	}
}

class SaveAccount extends Bank
{
	public SaveAccount(int initDeposit){
		super(initDeposit);      // 통장개설 시 첫 입금액
	}
	
	public void saveMoney(int money){
		accumulate(money);
		//private 멤버변수(balance)도 상속이 됩니다. 
		//하지만 함께 상속된 다른 메소드(accumulate())를 통한 간접 접근만 가능합니다.
		
	}
	
	public void showMoney(){
		System.out.print("누적 금액: ");
		System.out.println(getBalance());
	}
}

public class Exten05 {

	public static void main(String[] args) {

		SaveAccount sa=new SaveAccount(10000);
		
		sa.saveMoney(10000);
		sa.saveMoney(10000);
		sa.showMoney();
	}
}
