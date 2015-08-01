/*
StringBuilder의 문자열 조합
-문자열의 복잡한 조합의 과정에서는 StringBuilder의 인스턴스가 활용되며
-때문에 추가로 생성되는 인스턴스의 수는 최대 두 개이다

*/
public class StringBuilderEx03 {

	public static void main(String[] args) {
		//숫자 + 문자열 + 숫자
		String str1=3+"Java"+7;
		//String.valueOf('3').concat("Java").concat(String.valueOf('7'))
		//이럴경우 문자열 인스턴스가 많이 생성되는 것(5개)을 방지하기 위해서
		
		//StringBuilder클래스를 사용하여 두개의 인스턴스만 생성됩니다.
		//new StringBuilder().append(3).append("Java").append(7).toString();
		//StringBuilder() 인스턴스 생성 한개 
		//toString() 인스턴스 생성 한개

		System.out.println(str1);
	}
}
