//은닉화, 캡슐화(클래스 분리)

//3개의 경우 확인
//	• 같은 클래스에서 호출했을 때-정상(1) - 외부클래스 정의하지 않고 주클래스에서 private변수 선언
//	• 은닉화된 클래스를 외부에서 접근했을 때-Error(2) - 외부클래스 정의후 인스턴스를 통해 인스턴스 변수에 접근
//	• 메소드(method)를 통해서 접근했을 때-정상(3) - 외부 클래스 정의후 메소드를 통해 접근


//은닉화된 클래스를 외부에서 접근했을 때 Error(2) - 1/2
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
	
	/*
	//같은 클래스에서 호출(1) - 1/2
	private int a;
	
	public void setA(int n){
		a = n;
	}
	
	public int getA(){
		return a;
	}
	*/

	public static void main(String[] args) {
		
		/*
		//같은 클래스에서 호출(1) - 2/2
		//같은 클래스에서는 호출가능합니다.
		CapsuleMain csm = new CapsuleMain();
		
		csm.a = 10;
		System.out.println(csm.a);
		
		csm.a = -10;
		System.out.println(csm.a);
		*/
		
		
		/*
		//은닉화된 클래스를 외부에서 접근했을 때 Error(2) - 2/2
		//은닉화된 클래스 접근
		Capsule cs = new Capsule();
		
//		ERROR: The field Capsule.a is not visible
//		접근지정자가 private이면 같은 클래스에서만 호출 가능(은닉화)
		cs.a = 10;
		System.out.println(cs.a);
		*/
		

		/*
		//메소드(method)를 통해서 접근(3)
		//메소드(method)를 통해서만 접근가능
		Capsule cs = new Capsule();
		
		cs.setA(100);		
		System.out.println( cs.getA() );
		
		cs.setA(-200);		
		System.out.println( cs.getA() );
		*/
		
	}
}
