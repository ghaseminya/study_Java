/*
//인자 전달 방식: 참조 호출(call by reference)


참조 호출 (Call by Reference)
	• 메서드 호출 시 전달하려는 인자를 참조(객체) 자료형을 사용하는 경우를 의미
	• 여기에는 기본 자료형이 아닌 일반 객체 또는 배열들이 여기에 속합니다.


//참조 도식도

//--------------------------------------------------------
값 호출(Call by Value)에서는 값(value)을 복사하여 전달하였으므로 호출 시의 실인자는 별도의 값으로 인식되어 영향을 받지 않으며

참조 호출(Call by Reference)에서는 주소(reference)가 복사되어 전달 되었으므로 
하나의 객체를 참조하는 변수가 2개가 되어 어느 한 곳에서 수정을 하게 되면 같은 객체를 참조하는 다른 쪽에서도 변경된 값을 참조하게 됩니다(영향을 받게 됨).

*/
public class MethodEx03 {
	
	//인자 전달 방식: 참조 호출(call by reference)
	public void increase(int[] n){ // n에 인자로 주소가 입력됩니다.
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
		
		//메서드를 호출 시 주소를 인자로 전달하는 방식
		m.increase(ref); //주소를 인자로전달
		
		for(int i=0; i<ref.length; i++){
			System.out.println(ref[i]);
		}
	}
}
