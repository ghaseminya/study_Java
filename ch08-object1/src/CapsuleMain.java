/*
//은닉화, 캡슐화(클래스 분리)

//3개의 경우 확인
//	• 같은 클래스에서 호출했을 때-정상(1) - 외부클래스 정의하지 않고 주클래스에서 private변수 선언
//	• 은닉화된 클래스를 외부에서 접근했을 때-Error(2) - 외부클래스 정의후 인스턴스를 통해 인스턴스 변수에 접근
//	• 메소드(method)를 통해서 접근했을 때-정상(3) - 외부 클래스 정의후 메소드를 통해 접근

정보은닉(Information Hiding)
	• 정보에 직접 접근하는 것을 허용하지 않겠다는 것
	• 클래스안에 있는 정보를 보이지 않도록 감싸는 것
	• 객체간에 약속되지 않은 부분을 숨기는 것
	• Data Hiding이라고도 합니다.


은닉성(Encapsulation)
	• 최소한의 기능만을 노출하고 내부는 모두 감추는 것
	• 상속성(Inheritance)과 다형성(Polymorphism)과 함께 OOP의 3대 특성
	• 보통, 상수를 제외한 필드는 무조건 감추는 것이 좋습니다.(대체로 필드는 모두 감추고 메소드는 꼭 노출이 필요한 것만 공개하여 접근 한정자로 공개 수준 결정합니다)
	• (객체 지향 프로그래밍의 원칙) 클래스의 필드는 기본적으로 private으로 설정하여 외부로터의 접근을 완전히 제한하는 것이 일반적이며
	• 메서드는 외부에서 호출해야 하는 것은 public으로 하고 내부에서만 사용되는 것들은 private으로 설정합니다.


인스턴스 변수의 private
	• private과 같은 키워드를 접근지정자(접근제어 지시자)라고 합니다.
	• private선언으로인해 메소드(method)를 통해서만 접근가능하며
	• 외부에서는 접근할 수 없습니다.(class 코드 밖에서는 접근할 수 없습니다.)
//--------------------------------------------------
*/


//TODO 2: 선언_은닉화된 클래스를 외부에서 접근했을 때 Error(2) - 1/2
//외부 클래스 정의
class Capsule{
	//private 인스턴스 변수 선언
	private int a;
//	private 키워드로 접근지정자 선언
//	• private선언으로 인해 메소드(method)를 통해서만 접근가능하며
//	• 외부에서는 접근할 수 없습니다.(class 코드 밖에서는 접근할 수 없습니다.)
	
	public void setA(int n){
		
		if( n >= 0){
			a = n;
		}else{
			System.out.println("음수는 허용되지 않습니다.");
		}			
	}
	
	public int getA(){
		return a;
	}	
}


public class CapsuleMain {
	
	//TODO 1: 선언_같은 클래스에서 호출(1) - 1/2
	private int a;
	
	public void setA(int n){
		a = n;
	}
	
	public int getA(){
		return a;
	}

	public static void main(String[] args) {
		
		//TODO 1: 호출_같은 클래스에서 호출(1) - 2/2
		//같은 클래스에서는 호출가능합니다.
		CapsuleMain csm = new CapsuleMain();
		
		csm.a = 10;
		System.out.println(csm.a); //10
		
		csm.a = -10;
		System.out.println(csm.a); //-10
		
		
		//TODO 2: 호출_은닉화된 클래스를 외부에서 접근했을 때 Error(2) - 2/2
		//은닉화된 클래스 접근
		Capsule cs = new Capsule();
		
		//ERROR: The field Capsule.a is not visible
		//접근지정자가 private이면 같은 클래스에서만 호출 가능(은닉화)
//		cs.a = 10;
//		System.out.println(cs.a);
		

		//메소드(method)를 통해서 접근(3)
		//메소드(method)를 통해서만 접근가능
		Capsule csu = new Capsule();
		
		csu.setA(100);		
		System.out.println( csu.getA() ); //100
		
		//데이터 저장시 유효한 값인지 체크 후 저장
		//"음수는 허용되지 않습니다."라는 메시지가 출력됩니다.
		csu.setA(-200);		
		System.out.println( csu.getA() ); //100
	}
}


//출력결과
//10
//-10
//100
//음수는 허용되지 않습니다.
//100

