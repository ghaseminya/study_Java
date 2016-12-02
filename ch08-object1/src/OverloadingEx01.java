/*
//메서드 오버로딩
//메소드 오버로딩시 인자를 여러개 사용하여 정의하기


//-------------------------------------------
//메서드 오버로딩: 기능이 같은 메서드를 여러개 만들 때 사용함


[메소드 오버로딩 규칙]
	• 메서드 명은 같고 인자의 타입을 다르게 명시
	• 타입이 같으면 인자의 갯수를 다르게 명시
	• 갯수가 같으면 순서를 다르게 명시



[메소드 오버로딩 사용 이유]
	• 객체지향 프로그래밍의 특징인 재사용성을 추구하는 방법
	• 같은 목적으로 비슷한 동작을 수행하는 메서드(멤버함수)들을 모아 이름을 같게 하면 
	• 프로그래머로 하여금 다양한 메서드(멤버함수)들을 같은 이름으로 호출하여 일관된 작업을 할 수 있게하는 편이성을 제공해 줄 수 있습니다. (개발속도 ↑)

*/
public class OverloadingEx01 {	
	
	//멤버메서드
	public void getLength(String str){		
		System.out.println("입력한 값의 길이: " + str.length());		
	}
	
	public void getLength(int n){
					//int -> Sting
		String s = String.valueOf(n);
		getLength(s);		
	}
	
	//ERROR: Duplicate method getLength(int)in type OverloadingTest
	// 인자명은 같아도 상관없으나 자료형이 달라야 합니다.
//	public void getLength(int a){
//	}
	
	public void getLength(float f){
					//float -> Sting
		String s = String.valueOf(f);
		getLength(s);
	}

	//접근지정자를 public에서 void로 바꿔
	//지정자를 다르게 하더라도 메서드 오버로딩에서는 다르게 인식 되지 않습니다.
	/*void getLength(float f){
		//float -> Sting
		String s = String.valueOf(f);
		getLength(s);
	}*/	
	
	
	public void getLength(float f, int a ){
		String s = String.valueOf(f) + String.valueOf(a);
		getLength(s);
	}
	
	//인자 순서가 다르면 다른 것으로 인식합니다.
	public void getLength(int a, float f ){
		String s = String.valueOf(f) + String.valueOf(a);
		getLength(s);
	}
	
	public void getLength(String str, float f ){
		String s = str + String.valueOf(f);
		getLength(s);
	}
	
	public void getLength(float f, String str ){
		String s = String.valueOf(f) + str;
		getLength(s);
	}
	
	public void getLength(int n, float f, String str ){
		String s = String.valueOf(n) + String.valueOf(f) + str;
		getLength(s);
	}
	
	
	//접근지정자와 반환형를 다르게 하더라도 메서드 오버로딩에서는 다르게 인식 되지 않습니다.
//	private void getLength(String str){		
//	System.out.println("입력한 값의 길이: " + str.length());
//	}
	
//	public int getLength(String str){		
//		System.out.println("입력한 값의 길이: " + str.length());
//		return 0;
//	}
	

	public static void main(String[] args) {		
		
		//1000, 3.14F, "대한민국"
		
		OverloadingEx01 oe = new OverloadingEx01();
		oe.getLength(1000);		//1000		->	"1000"
		oe.getLength(3.14F);	//3.14F		->	"3.14"
		oe.getLength("대한민국");	//"대한민국"	->	"대한민국"
		oe.getLength(1000, 3.14F);
		oe.getLength(3.14F, 1000);
		oe.getLength("대한민국", 3.14F);
		oe.getLength(3.14F, "대한민국");
		oe.getLength(1000, 3.14F, "대한민국");
	}
}


/*//출력결과
입력한 값의 길이: 4
입력한 값의 길이: 4
입력한 값의 길이: 4
입력한 값의 길이: 8
입력한 값의 길이: 8
입력한 값의 길이: 8
입력한 값의 길이: 8
입력한 값의 길이: 12
*/