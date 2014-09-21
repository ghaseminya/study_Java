/* 인자 전달 방식: 값 호출(call by value)
 * 
 * */

public class MethodEx02 {
	
	
	//멤버변수
	
	//인자 전달 방식: 값 호출(call by value)
	public int increase(int n){
		++n;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//지역 변수
		int var1 = 100;
		MethodEx02 m = new MethodEx02();
		
		int var2 = m.increase(var1);


		System.out.println("var 1: " + var1);
		System.out.println("var 2: " + var2);

	}

}
