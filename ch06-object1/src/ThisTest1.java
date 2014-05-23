/* 기본 생성자 호출을 통한 초기화
 * 
 */


public class ThisTest1 {

	//생성자
	public ThisTest1(){
		// this: 참조 변수
		// (this) 객체 내에서 나의 객체 참조
		System.out.println("객체 생성\t: " + this);
	}	
	
	public static void main(String[] args) {
		// 객체 생성
		// (tt1) 참조변수: 객체 밖에서 객체 참조
		ThisTest1 tt1 = new ThisTest1();
		
		// 객체 생성 후 
		System.out.println("객체 생성 후\t: " + tt1);
	}
}
