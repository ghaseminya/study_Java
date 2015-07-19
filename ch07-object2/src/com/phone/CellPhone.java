package com.phone;

//기본적인 휴대폰 기능
public class CellPhone {
	
	//같은 패키지에서만 호출 가능 / 상속시에도 호출가능
	//보통 상속관계에서 패키지가 다르더라도 호출가능하도록 하기 위해 protected를 주로 사용합니다.
	protected String model;		//모델
	protected String number;	//제품번호
	protected int bellsound;		//벨소리
	
	public String getModel(){
		return model;
	}
	
	public String getNumber(){
		return number;
	}
	
	public int getBellSound(){
		return bellsound;
	}

}
