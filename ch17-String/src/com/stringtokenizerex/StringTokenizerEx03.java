package com.stringtokenizerex;

/*
//StringTokenizer 클래스 - 문자열 분리 클래스

StringTokenizer 클래스
	• 문자열 분리 객체
	• nextToken() 메서드를 이용하여 문자(열) 분리

*/
import java.util.StringTokenizer;

public class StringTokenizerEx03 {

	StringTokenizer st;
	
	//생성자 Overloading
	public StringTokenizerEx03(String str){
		System.out.println("str: " + str);
		
		//인자로 전달된 String객체인 str을 기본 구본문자인  white space, new line, tab등을 구분문자로 하여 분할할 StringTokenizer객체를 생성합니다.
		st = new StringTokenizer(str);
	}
	public StringTokenizerEx03(String str, String delim){
		System.out.println("str: " + str);
		
		//인자로 전달된 String객체인 str을 두 번째 인자인 delim을 구분문자로하여 분할할 StringTokenizer객체를 생성합니다.
		st = new StringTokenizer(str, delim);
	}
	
	public void print(){
		System.out.println("Token count: " + st.countTokens());
		System.out.println("분리된 문자열: ");
		
		//boolean hasMoreTokens() : 토큰이 더 존재하는지 여부를 반환합니다. 토큰이 있으면 true, 없으면 false
		while(st.hasMoreTokens()){
			//nextToken() : 다음 토큰을 리턴합니다.
			String token = st.nextToken();
			System.out.println(token);
		}
//		System.out.println("Token count: " + st.countTokens()); 토큰이 분리되어졌으므로 count는 0으로 출력
		System.out.println("-----------------------");
		
	}

	public static void main(String[] args) {

		StringTokenizerEx03 st1 = new StringTokenizerEx03("Mirry Christmas!!!");
		st1.print();
		
		StringTokenizerEx03 st2 = new StringTokenizerEx03("2034/12/25", "/");
		//존 티토(자신이 2036년 미래에서 온 1998년생 남성이라고 주장), 2034년 유럽 입자 물리 연구소(CERN)가 타임 머신 시제품 1호기를 실용화시킨다는 예언
		//입자가속기를 이용하면 타임머신이 개발이 가능하다는 주장이 있으나 어디까지나 이론에 불과
		st2.print();
		
	}
}


/*//출력결과
str: Mirry Christmas!!!
Token count: 2
분리된 문자열: 
Mirry
Christmas!!!
-----------------------
str: 2034/12/25
Token count: 3
분리된 문자열: 
2034
12
25
-----------------------


*/