//기본 생성자 호출을 통한 초기화 (객체 ID출력)


public class ThisEx01 {

	//생성자
	public ThisEx01(){
		// this: 참조 변수
		// this 참조변수: 객체 내에서 나의 객체 참조
		System.out.println("객체 생성: " + this);
	}	
	
	public static void main(String[] args) {
		// 객체 생성
		// tt1 참조변수: 객체 밖에서 객체 참조
		ThisEx01 tt1 = new ThisEx01();
		
		// 객체 생성 후 
		System.out.println("객체 생성 후: " + tt1);
	}
}
