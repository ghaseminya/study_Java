/* 인자 전달 방식: 참조 호출(call by reference)
 * 
 * */

public class MethodEx03 {
	
	//인자 전달 방식: 참조 호출(call by reference)
	public void increase(int[] n){// n에 인자로 주소가 입력됩니다.
		for(int i=0; i<n.length; i++){
			n[i]++;
		}		
	}	
	public static void main(String[] args) {

		int[] ref = {100, 200, 300};
		
		for(int i=0; i<ref.length; i++){
			System.out.println(ref[i]);
		}
		
		System.out.println();
		System.out.println("===============================");		
		MethodEx03 m = new MethodEx03();
		
		m.increase(ref);	//주소를 인자로전달
		
		for(int i=0; i<ref.length; i++){
			System.out.println(ref[i]);
		}
	}
}
