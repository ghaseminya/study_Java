/*
instanceof 연산자
	• 형변환이 가능한지를 묻는 연산자입니다.
	• 형변환이 가능하면 true를
	• 형변환이 가능하지 않으면 false를 반환합니다.
 

사용방법
[참조변수]가  [클래스명]의 클래스자료형으로 형변환 가능유무에 따라 true, false값 반환
[참조변수] instanceof [클래스명]

[참조변수] instanceof [클래스명]	반환값
형변환 가능						true
형변환 불가						false

box instanceof GoldPaperBox
box라는 참조변수가 GoldPaperBox로 	형변환 가능하면 true 반환
							불가능하면 false를 반환

*/
package com.ext2;

class Box {
	public void simpleWrap() {
		System.out.println("simple wrap");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("gold wrap");
	}
}

public class InstanceOfEx01 {

	public static void wrapBox(Box box){ //Box타입(부모클래스)타입으로 인자를 받고 있습니다.
										 //자식클래스타입 -> 부모클래스타입(자동형변환)
		if(box instanceof GoldPaperBox) //box가 GoldPaperBox로 형변환 가능하다면
			((GoldPaperBox)box).goldWrap();
		else if(box instanceof PaperBox) //box가 PaperBox로 형변환 가능하다면
			((PaperBox)box).paperWrap();
		else
			box.simpleWrap();
	}
	
	public static void main(String[] args){
		Box box1=new Box();
		PaperBox box2=new PaperBox();
		GoldPaperBox box3=new GoldPaperBox();
		//컴파일 완료된 후 문장이 끝난후 참조변수에 대한 자료형 정보를 가지고 있지만 
		//실제로 뭘 참조하는 지는(new Box(), new PaperBox(), new GoldPaperBox()) 객체 생성으로 지워지게 됩니다.
		
		wrapBox(box1); //simple wrap
		wrapBox(box2); //paper wrap
		wrapBox(box3); //gold wrap
	}
}


/*//출력결과
simple wrap
paper wrap
gold wrap
*/