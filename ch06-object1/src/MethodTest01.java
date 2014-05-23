/* 인자전달 방식: 반환하는 리턴값이 있는 메서드
 * 
 * */

public class MethodTest01 {
	//메서드 리턴형태
	
	//인자전달 방식: 반환하는 리턴값이 있는 메서드
	public int add(int a, int b){
		return a+b;
	}
	
	//반환하는 데이터가 없는 메서드
	public void print(){
		System.out.println("반환하는 데이터가 없는 메서드");
		
		//반환하는 데이터가 없을 경우 일반적으로 생략
		return;	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
