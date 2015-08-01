//private멤버변수 상속

//private 멤버도 상속이 됩니다. 
//하지만 함께 상속된 다른 메소드를 통한 간접 접근만 가능합니다.

//private < default < protected < public
//클래스내부 < 동일패키지 < 상속 클래스 < 이외의 영역(아무 관계 없음)

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
		accumulate(money);	//accumulate: 축척하다, 모으다
		//private 멤버변수(balance)도 상속이 됩니다. 
		//하지만 함께 상속된 다른 메소드인 accumulate()를 통한 간접 접근만 가능합니다.
		
	}
	
	public void showMoney(){
		System.out.print("누적 금액: ");
		System.out.println(getBalance());
		
//		System.out.println(balance);	//ERROR - The field Bank.balance is not visible
										//private변수에 직접 접근시 에러, 같이 상속된 다른 메소드를 통한 간접 접근만 가능
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
