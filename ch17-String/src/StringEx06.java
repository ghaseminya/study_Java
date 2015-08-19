//String 클래스 - 암시적 객체 생성/명시적 객체 생성

//<암시적 객체 생성>: 스트링 객체 생성-리터럴을 이용하여 문자열 생성
//	• 객체 비교 
//	• 객체의 내용(문자열) 비교

//<명시적 객체 생성>: 명시적 객체 생성- new연산자를 이용하여 문자열 생성
//	• 객체 비교- 동일위치를 참조하는지 조건 검사
//	• 객체의 내용(문자열) 비교
//-----------------------------------------------------
//명시적으로 객체 생성시 다른 객체이며 hashCode() 값이 동일하게 나와도 다른 객체입니다. 그래서 객체 비교를 해보면 객체가 다름을 확인 할 수 있습니다.
//이는 내부적으로 String을 다르게 처리해 주고 있기 때문입니다. 
//(중요) 문자열 비교시 equals()로 비교해야 합니다.


public class StringEx06 {

	public static void main(String[] args) {
		System.out.println("암시적 객체 생성 ==============");
		//암시적 객체 생성
		String str1 ="Hello";
		String str2 ="Hello";

		//객체 비교 
		if( str1 == str2){
			System.out.println("str1과 str2는 같은 객체"); //출력
		}else{
			System.out.println("str1과 str2는 다른 객체");
		}
				
		//객체의 내용(문자열)비교
		if(str1.equals(str2)){
			System.out.println("str1과 str2의 내용이 같습니다"); //출력
		}else{
			System.out.println("str1과 str2의 내용이 다릅니다");
		}
		System.out.println(str1.getClass()); //class java.lang.String
		System.out.println(str2.getClass()); //class java.lang.String
		System.out.println(str1.hashCode()); //69609650
		System.out.println(str2.hashCode()); //69609650
		System.out.println(str1); //Hello
		System.out.println(str2); //Hello
		
		
		System.out.println("명시적 객체 생성 ==============");
		//명시적 객체 생성
		String msg1 = new String("World");
		String msg2 = new String("World");
		
		//객체 비교- 동일위치를 참조하는지 조건 검사
		if( msg1 == msg2){	
			System.out.println("msg1과 msg2는 같은 객체");
			//동일한 World문자열이지만 매번 새롭게 생성되기 때문에 위치값이 서로 다르게 됩니다.
		}else{
			System.out.println("msg1과 msg2는 다른 객체"); //출력
		}
		
		//객체의 내용 비교
		if(msg1.equals(msg2)){
			System.out.println("msg1과 msg2의 내용이 같습니다"); //출력
		}else{
			System.out.println("msg1과 msg2의 내용이 다릅니다");
		}
		
		System.out.println(msg1.getClass()); //class java.lang.String
		System.out.println(msg2.getClass()); //class java.lang.String
		System.out.println(msg1.hashCode()); //83766130
		System.out.println(msg2.hashCode()); //83766130
		System.out.println(msg1); //World
		System.out.println(msg2); //World
	}
}


/*//출력결과
암시적 객체 생성 ==============
str1과 str2는 같은 객체
str1과 str2의 내용이 같습니다
class java.lang.String
class java.lang.String
69609650
69609650
Hello
Hello
명시적 객체 생성 ==============
msg1과 msg2는 다른 객체
msg1과 msg2의 내용이 같습니다
class java.lang.String
class java.lang.String
83766130
83766130
World
World
*/
