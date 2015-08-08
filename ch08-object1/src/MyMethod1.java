//캡슐화에서 멤버변수와 멤버함수
//인스턴스변수와 인스턴스 함수 사용하기

public class MyMethod1 {

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
		MyMethod1 mm = new MyMethod1();

		int result = mm.sum(77, 11);
		System.out.println("result="+result);

		result = mm.times(77, 11);
		System.out.println("result="+result);
	}
}
