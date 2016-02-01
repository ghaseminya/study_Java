/*
//인터페이스를 통한 다중상속 효과
//인터페이스와 클래스를 상속

//강의 내용(인터페이스를 통한 다중상속 절차)
//TODO 1: 클래스와 인터페이스 정의
//TODO 2: 다중상속효과를 위한 인터페이스의 추상메소드를 구현하는 클래스 생성
//TODO 3: 클래스 상속, 인테페이스 구현한 클래스의 인스턴스 생성
//TODO 4: 해당 인스턴스를 통해 메소드 호출

*/

package com.inter1;

//TODO 1: 클래스와 인터페이스 정의
class DMB
{
	public void onDMB()
	{
		System.out.println("DMB 출력");
	}
}

interface Mp3
{
	public void onMp3();
}

//SmartPhone클래스에서 직접 onMp3()를 구현할 경우 상속의 의미가 없어지기 때문에
//인터페이스 Mp3의 onMp3()를 보충하기 위한 클래스를 보통 생성하여 구현합니다.
class Mp3Impl
{	
	public void onMp3()
	{
		System.out.println("MP3 재생");
	}
}

//TODO 2: 다중상속효과를 위한 인터페이스의 추상메소드를 구현하는 클래스 생성
class SmartPhone extends DMB implements Mp3
{
	Mp3Impl mp3=new Mp3Impl(); //인스턴스 생성	
	
	@Override
	public void onMp3() {
		mp3.onMp3(); //인스턴스를 통한 메소드 호출
					 //인터페이스를 통해 다중 상속의 효과를 출수 있습니다.
	}
	
	public void powerOn()
	{
		onMp3();
		onDMB();
	}
}

public class InterfaceEx09 {

	public static void main(String[] args)
	{
		//TODO 3: 클래스 상속, 인테페이스 구현한 클래스의 인스턴스 생성
		SmartPhone smartPhone=new SmartPhone();
		smartPhone.powerOn();
		
		//TODO 4: 해당 인스턴스를 통해 메소드 호출
		//SmartPhone 클래스가 DMB 클래스를, 그리고 Mp3클래스를 동시에 상속 하고 있는 것처럼 보입니다. 
		//그러나 자바는 다중 상속을 지원하지 않습니다!
		//이 부분이 가능하다는 것은 하나는 클래스고 다른 하나는 인터페이스라는 것을 추측할 수 있다.
		DMB dmb=smartPhone;
		Mp3 mp3=smartPhone;
		
		dmb.onDMB();
		mp3.onMp3();

	}
}


/*//출력결과
MP3 재생
DMB 출력
DMB 출력
MP3 재생
*/
