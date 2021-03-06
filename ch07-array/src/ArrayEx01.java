/*
// 배열 선언 방법/배열 사용 단계

배열(Array)
	• 같은 자료 형들끼리 모아둔 하나의 묶음(집합)입니다.
	• 자바에서 하나의 배열은 하나의 객체로 인식됩니다.



배열의 종류
1차원 배열		같은 자료 형들끼리 모아둘 수 있는 묶음이 하나밖에 없는 경우
다차원 배열		1차원 배열이 여러 개 있는 경우
객체형 배열		객체를 참조하는 참조변수들의 묶음
기본 자료형 배열	boolean, char, int등과 같은 기본 자료 형의 배열



도식도
http://cfile30.uf.tistory.com/image/211C084655BFFBE4038A89




배열 작업 단계  (단계별 생성)
1	배열 선언
2	배열 생성
3	배열 초기화
4	배열 사용


배열 선언 방법 1 2 3 (선언과 동시에 생성)
배열선언 방법 1: 배열 선언 및 생성
배열선언 방법 2: 배열 선언 및 생성, 초기화 (명시적 배열 생성)
배열선언 방법 3: 배열 선언 및 생성, 초기화 (암시적 배열 생성), C언어의 배열 초기화 방법과 비슷


배열의 접근방법
	• 배열의 접근에는 0부터 시작하는 인덱스 값이 사용됩니다. 
	• 배열의 크기가 N이라면 가장 첫 번째 배열 요소의 인덱스는 0이고 N번째 요소의 인덱스는 N-1입니다.
	• 배열 인스턴스의 멤버변수 length에는 배열의 길이정보가 저정되어 있습니다.

int[] arr=new int[3]{1, 2, 3};
arr[0]
arr[1]
arr[2]
*/
public class ArrayEx01 {

	public static void main(String[] args) {
		
		//배열 사용 단계: 1)배열 선언/2)배열 생성/3)배열 초기화/4)배열 출력
		//TODO : 1)배열 선언
		char[] ch;
		
		//TODO : 2)배열 생성
		ch = new char[4];
		
		//TODO : 3)배열 초기화
		ch[0]='J';
		ch[1]='A';
		ch[2]='V';
		ch[3]='A';
		
		//TODO : 4)배열 출력
		//배열명 출력 : char배열일때만 참조값이 아닌 배열값을 보여준다. (참조값을 배열값으로 한번 더 가공해서 보여준다)
		System.out.println(ch);	//JAVA
		
		//배열의 index 요소를  개별적으로 호출
		System.out.println(ch[0]);	//J
		System.out.println(ch[2]);  //V
		
		//반복문을 이용해서 배열의 내용 출력
		System.out.println();
		for(int i=0; i < ch.length; i++ ){
			
			System.out.print("배열 " + i + "번째 데이타: ");
			System.out.println(ch[i]);			
		}
		
		
//-------------------------------------------		
		//TODO : 배열 선언 방법 3가지
		//배열선언 방법 1: 배열 선언 및 생성
		int i[] = new int[7];
		
		//배열선언 방법 2: 배열 선언 및 생성, 초기화 (명시적 배열 생성)  
		char[] ch2 = new char[]{'H','E','L','L', 'O'};
		
		//배열선언 방법 3: 배열 선언 및 생성, 초기화 (암시적 배열 생성), C언어의 배열 초기화 방법과 비슷
		char[] ch3 = {'자', '바'};
		
		
//-------------------------------------------		
		//TODO : 배열 생성시 주의
		//{}로 배열을 초기화할 경우 배열 선언과 동시에만 가능하며 배열 선언 후에는 {}로 초기화할 수 없습니다.
//		char[] cha;
//		cha = {'자', '바'}; //ERROR-Array constants can only be used in initializers
		
		//초기화 방법 1
		//배열 선언과 동시에 {}로 배열을 초기화
//		char[] cha = {'자', '바'};
		
		//초기화 방법 2
		//배열 선언, 배열 생성후에는  배열요소에 값을 직접 넣어줘서 배열 초기화
//		char[] cha;
//		cha = new char[2];
//		cha[0]='자';
//		cha[1]='바';
		
	}
}


//출력결과
//JAVA
//J
//V
//
//배열 0번째 데이타: J
//배열 1번째 데이타: A
//배열 2번째 데이타: V
//배열 3번째 데이타: A
