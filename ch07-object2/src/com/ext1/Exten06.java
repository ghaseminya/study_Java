/*
상위클래스의 static 변수
	• static 변수는 접근의 허용여부와 관계가 있습니다.
	• 상위 클래스의 static 변수에 하위 클래스도 그냥 이름만으로 접근이 가능합니다.

*/
package com.ext1;


class Money
{
	public static int balance=0;	//static멤버변수, 
	//static멤버변수는 접근 허용여부와 관련이 있으며 하위 클래스에도 그냥 이름만으로 접근 가능

	public void addMoney(int num){
		balance+=num;
	}
}

class SaveMoney extends Money
{
	public void saveMoney(int money){
		balance += money;
	}
	
	public void showMoney(){
		System.out.println("누적 금액: " + balance);
	}
}

public class Exten06 {

	public static void main(String[] args) {
		//상위 클래스의 static 변수에 이름으로 직접 접근이 가능
		
		Money money = new Money();
		SaveMoney saveMoney = new SaveMoney();
		money.addMoney(1000);
		saveMoney.showMoney();

		saveMoney.saveMoney(2000);
		saveMoney.showMoney();
		
		SaveMoney.balance+=500;		
		saveMoney.showMoney();
	}
}
