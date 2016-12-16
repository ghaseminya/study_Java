/*
//문자열 덧셈
• + 연사자를 통한 문자열 덧셈
• += 연사자를 통한 문자열 덧셈

concat("문자열"); //문자열 연결 함수

TODO : 두개의 문자열 +연결
TODO : 문자열 + 문자
TODO : 문자열 + 숫자
TODO : 숫자 + 문자열 + 숫자
TODO : +=연산자를 통한 문자열 덧
*/
public class StringEx06 {

	public static void main(String[] args) {

		//TODO : 두개의 문자열 +연결
		String str1 = "Java" + "love";
		String str11 = "Java".concat("love");
		// -> Java의 스트링 인스턴스가 만들어지고 그 스트링인스턴스를 대상으로 concat()메소드를 호출하면서 
		// 인자를 전달하게되면서
		// "Java"와 "love"가 합쳐지면서 새로운 스트링인스턴스를 만들어서 그 참조값을 str1에 저장하게 됩니다.
		// 자동으로 concat()호출로 바꿔주기 때문에 두문자열을 +연산자로 덧셈을 할수 있게 됩니다.

		System.out.println(str1); // Javalove
		System.out.println(str11); // Javalove
		
		
		
		//TODO : 문자열 + 문자
		String str2 = "Java" + 'A';
		String str22 = "Java".concat(String.valueOf('A'));
		// -> String.valueOf()에 의해 'A'가 문자열로 전환되고 해당 문자열의 인스턴스를 반환합니다.

		System.out.println(str2); // JavaA
		System.out.println(str22); // JavaA
		
		
		
		//TODO : 문자열 + 숫자
		String str3 = "Java" + 3;
		String str33 = "Java".concat(String.valueOf('3'));
		// -> String.valueOf()에 의해 '3'가 문자열로 전환되고 해당 문자열의 인스턴스를 반환합니다.

		System.out.println(str3); // Java3
		System.out.println(str33); // Java3
		
		
		
		//TODO : 숫자 + 문자열 + 숫자
		String str4 = 3 + "Java" + 7;
		String str44 = String.valueOf('3').concat("Java").concat(String.valueOf('7'));
		// 이럴경우 문자열 인스턴스가 많이 생성되는 것을 방지하기 위해서
		// StringBuilder클래스를 사용하여 두개의 인스턴스만 생성됩니다.
		// StringBuilderEx03.java에서 추가설명

		System.out.println(str4); // 3Java7
		System.out.println(str44); // 3Java7
		
		
		//TODO : +=연산자를 통한 문자열 덧셈
		str4 += '!';
		System.out.println(str4); // 3Java7!
	}
}


/*//출력결과
Javalove
JavaA
Java3
3Java7
3Java7!

*/
