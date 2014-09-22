/*
은닉화, 캡슐화(클래스 분리)
*/

class Capsule{
	private int a;
	
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
	
	/*private int a;
	
	public void setA(int n){
		a = n;
	}
	
	public void getA(){
		return a;
	}*/
	

	public static void main(String[] args) {
		/*CapsuleMain csm = new CapsuleMain();
		
		//같은 클래스에서는 호출가능합니다.
		csm.a = 10;
		System.out.println(csm.a);
		
		csm.a = -10;
		System.out.println(csm.a);*/
		
		
		//은닉화된 클래스 접근
		Capsule cs = new Capsule();
		
		/*ERROR: The field Capsule.a is not visible
		접근지정자가 private이면 같은 클래스에서만 호출 가능(은닉화)*/
		/*cs.a = 10;
		System.out.println(cs.a);*/
		cs.setA(100);		
		System.out.println( cs.getA() );
		
		cs.setA(-200);		
		System.out.println( cs.getA() );
	}
}
