/*
메소드오버로딩 구현
- OverloadingEx02 비오버로딩을 오버로딩하여 구현

비슷한 동작을 수행하는 메서드(멤버함수)들을 모아 이름을 같게 하면 
다양한 메서드(멤버함수)들을 같은 이름으로 일관된 작업을 할 수 있게 합니다.
*/

public class OverloadingEx03 {

	public static void main(String[] args) {
		OverloadingEx03 oe3 = new OverloadingEx03();

		//같은 이름으로 다양한 기능을 하는 함수 호출
		oe3.getLength(1000);
		oe3.getLength(3.14f);
		oe3.getLength("10000");
	}


	public void getLength(int n){
		String s = String.valueOf(n);
		getLength(s);
	}
	void getLength(float n){
		String s = String.valueOf(n);
		getLength(s);
	}
	private int getLength(String str){
		System.out.println("입력한 값의 길이 : "+str.length());
		return 0;
	}
	
//	public void getLength(int n){
//	void getLength(float n){
//	private int getLength(String str){
//	와 같이 Overloading 함수에서 [접근제한], [반환형], 그리고 인자 이름은 아무런 영향을 주지 않습니다. 
//	메서드명이 같은 여러 개의 메서드를 구별하는 방법은
//	메서드에 사용되는 인자의 자료형 또는 인자의 수 다르거나
//	인자들의 위치(배치)가 서로 다른경우 각각의 메서드로 구별되어 존재합니다.

}