/* 메서드 오버로딩
 * 
 * */

public class OverloadingTest {	
	//멤버변수
	int var1;	
	
	/*멤버메서드
	메서드 오버로딩: 기능이 같은 메서드를 여러개 만들 때 사용함
	- 메서드 명은 같고 인자의 타입을 다르게 명시
	- 타입이 같으면 인자의 갯수를 다르게 명시
	- 갯수가 같으면 순서를 다르게 명시*/
	public void getLength(int n){
					//int -> Sting
		String s = String.valueOf(n);
		getLength(s);		
	}
	
	//ERROR: Duplicate method getLength(int)in type OverloadingTest
	// 인자명은 같아도 상관없으나 자료형이 달라야 한다.
//	public void getLength(int a){
//	}
	
	public void getLength(float f){
					//float -> Sting
		String s = String.valueOf(f);
		getLength(s);
	}
	
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
	
	//인자 순서가 드르면 다른 것으로 인식합니다.
	public void getLength(int a, float f ){
		String s = String.valueOf(f) + String.valueOf(a);
		getLength(s);
	}
	
	public void getLength(String str){		
		System.out.println("입력한 값의 길이: " + str.length());		
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
	
	
	/*private void getLength(String str){		
	System.out.println("입력한 값의 길이: " + str.length());
	}	*/
	
	/*public int getLength(String str){		
		System.out.println("입력한 값의 길이: " + str.length());
		return 0;
	}	*/
	

	public static void main(String[] args) {		
		
		//1000, 3.14F, "대한민국"
		
		OverloadingTest ot = new OverloadingTest();
		ot.getLength(1000);		//1000		->	"1000"
		ot.getLength(3.14F);	//3.14F		->	"3.14"
		ot.getLength("대한민국");	//"대한민국"	->	"대한민국"
		ot.getLength(1000, 3.14F);
		ot.getLength(3.14F, 1000);
		ot.getLength("대한민국", 3.14F);
		ot.getLength(3.14F, "대한민국");
		ot.getLength(1000, 3.14F, "대한민국");
	}
}
