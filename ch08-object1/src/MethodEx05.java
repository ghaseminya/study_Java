/*
//캡슐화에서 멤버변수와 멤버함수
//인스턴스변수와 인스턴스 함수 사용하기

[instance변수(개인이 소유하고 있는 물컵)]
객체가 생성될 때 각 객체들마다 따로 따로 생성 되어 고유의 값을 받아 각 객체의 속성으로 자리 잡는 변수


[static변수(약수터에 있는 물 바가지)]
여러 개의 객체가 생성될 때 단 하나만 생성 되며 모든 객체들이 공유하는 개념으로 사용되는 변수

*/
public class MethodEx05 {

	// 멤버 변수들
	int var1,var2;

	//[접근제한] [반환형] [메서드명](자료형 인자1, 자료형 인자2)
	public int sum(int a, int b){ // 메서드(멤버 함수)
		//수행구문;
		return a+b;
	}

	public int times(int a, int b){ // 메서드(멤버 함수)
		return a*b;
	}

	public static void main(String[] args){
		MethodEx05 mm = new MethodEx05();

		int result = mm.sum(77, 11);
		System.out.println("result="+result);

		result = mm.times(77, 11);
		System.out.println("result="+result);
	}
}
