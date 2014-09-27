/*
StringBuffer클래스를 이용하여 문자열 조합

연속해서 함수호출이 가능한 이유는
append 메소드가 stringBuilder의 참조 값을 반환하기 때문입니다.
*/
public class StringBuilderEx01 {

	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder("Orange");
		//buffer: Orange	-> AB가 버퍼에 저장(AB가 단순히 데이터로 버퍼에 저장되고 표현될 때 문자열로 바꿔서 표현)
		System.out.println(stringBuilder);
		
		
		stringBuilder.append(27);
		//25숫자가 ""뒤에  덧붙여짐
		//buffer: Orange27
		System.out.println(stringBuilder);
		
		
		stringBuilder.append('J').append(true);
		//stringBuilder의 참조값이 반환되고 여기에 계속 append됩니다.
		//buffer: Orange27Jtrue
		System.out.println(stringBuilder);		
		
		
		stringBuilder.insert(9, "ava");
		//buffer: Orange27Javatrue
		System.out.println(stringBuilder);
		
		
		stringBuilder.insert(stringBuilder.length(), 'Z');
		//buffer: Orange27JavatrueZ
		System.out.println(stringBuilder);
	}

}
