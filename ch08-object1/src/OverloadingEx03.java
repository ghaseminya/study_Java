/*
//메소드오버로딩 구현
//- OverloadingEx02 비오버로딩을 오버로딩하여 구현

//비슷한 동작을 수행하는 메서드(멤버함수)들을 모아 이름을 같게 하면 
//다양한 메서드(멤버함수)들을 같은 이름으로 일관된 작업을 할 수 있게 합니다.



메서드 오버로딩(Overloading)
	• Overloading(중복정의)은 하나의 클래스 내에서 같은 이름을 가지는 메서드(멤버함수)를 여러 개 정의하는 것
	• 컴파일 시 컴파일러에 의해 정의된 각각의 메서드들이 구별되며 구별의 기준은 인자가 됩니다.


[메서드 오버로딩 형식]
[접근제한] [반환형] [메서드명](자료형 인자1, 자료형 인자2, …){ }

[접근제한] [반환형]			변경 가능
[메서드명]					반드시 동일명 사용
(자료형 인자1, 자료형 인자2, …)	반드시 다르게 지정(자료형 타입, 인자 개수)



[메소드 오버로딩 필요성]
같은 목적, 비슷한 기능을 수행하는 메서드(멤버함수)들을 모아 같은 이름을 가지게 하면 
프로그래머들에게 다양한 메서드(멤버함수)들을 같은 이름으로 호출하여 
일관된 작업을 할 수 있게 함으로써 시간과 비용을 줄일 수 있습니다. 



[메소드 오버로딩 특징]
	• 동일한 이름의 메소드를 둘 이상 동시에 정의하는 것.
	• 메소드의 매개변수 선언(개수 또는 자료형)이 다르면 메소드오버로딩 가능
	• 오버로딩된 메소드는 호출시 전달하는 인자를 통해서 구별됩니다.
	• 리턴 타입은 달라도 무관합니다.(접근제한과 반환형은 변경가능)



[메소드 오버로딩 사용 이유]
	• 객체지향 프로그래밍의 특징인 재사용성을 추구하는 방법
	• 같은 목적으로 비슷한 동작을 수행하는 메서드(멤버함수)들을 모아 이름을 같게 하면 
	• 프로그래머로 하여금 다양한 메서드(멤버함수)들을 같은 이름으로 호출하여 일관된 작업을 할 수 있게하는 편이성을 제공해 줄 수 있습니다. (개발속도 ↑)

*/

public class OverloadingEx03 {

	public static void main(String[] args) {
		OverloadingEx03 oe = new OverloadingEx03();

		//같은 이름으로 다양한 기능을 하는 함수 호출
		oe.getLength(1000);
		oe.getLength(3.14f);
		oe.getLength("10000");
	}

	//메소드 오버로딩 함수 정의
	public void getLength(String str){
		System.out.println("입력한 값의 길이 : "+str.length());
	}
	public void getLength(int n){
		String s = String.valueOf(n);
		getLength(s);
	}
	
	//반환값이 달라도 동일한 메소드로 취급
	//ERROR-Duplicate method getLength(int) in type OverloadingEx03
//	private int getLength(int n){
//		String s = String.valueOf(n);
//		getLength(s);
//		return 0;
//	}
	
	void getLength(float n){
		String s = String.valueOf(n);
		getLength(s);
	}

//-------------------------------
//	public void getLength(int n){
//	void getLength(float n){
//	private int getLength(String str){
//	와 같이 Overloading 함수에서 [접근제한], [반환형], 그리고 인자 이름은 아무런 영향을 주지 않습니다. 
//	메서드명이 같은 여러 개의 메서드를 구별하는 방법은
//	메서드에 사용되는 인자의 자료형 또는 인자의 수 다르거나
//	인자들의 위치(배치)가 서로 다른경우 각각의 메서드로 구별되어 존재합니다.
}


/*//출력결과
입력한 값의 길이 : 4
입력한 값의 길이 : 4
입력한 값의 길이 : 5
*/