/*
메소드오버로딩 구현
- OverloadingEx02 비오버로딩을 오버로딩하여 구현

비슷한 동작을 수행하는 메서드(멤버함수)들을 모아 이름을 같게 하면 
다양한 메서드(멤버함수)들을 같은 이름으로 일관된 작업을 할 수 있게 합니다.

*/

public class OverloadingEx03 {

	public static void main(String[] args) {
		OverloadingEx03 oe3 = new OverloadingEx03();

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
}