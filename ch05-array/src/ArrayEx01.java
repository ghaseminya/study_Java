
public class ArrayEx01 {

	public static void main(String[] args) {
		// 배열 선언 단계: 배열 선언/배열 생성/배열 초기화/배열 출력
		// 배열선언 방법 1 2 3
		
		//배열 선언
		char[] ch;
		
		//배열 생성
		ch = new char[4];
		
//		배열 초기화
		ch[0]='J';
		ch[1]='A';
		ch[2]='V';
		ch[3]='A';
		
		//배열명 출력 : char배열일때만 참조값이 아닌 배열값을 보여준다. (참조값을 배열값으로 한번 더 가공해서 보여준다)
		System.out.println(ch);
		
		//배열의 index 0을 개별 호출
		System.out.println(ch[0]);
		
		//반복문을 이용해서 배열의 내용 출력
		System.out.println();
		for(int i=0; i < ch.length; i++ ){
			
			System.out.print("배열 " + i + "번째 데이타: ");
			System.out.println(ch[i]);			
		}
		
		
		//배열선언 방법 1: 배열 선언 및 생성
		int i[] = new int[7];
		
		//배열선언 방법 2: 배열 선언 및 생성, 초기화 (명시적 배열 생성)  
		char[] ch2 = new char[]{'H','E','L','L', 'O'};
		
		//배열선언 방법 2: 배열 선언 및 생성, 초기화 (암시적 배열 생성)
		char[] ch3 = {'자', '바'};
		
	}
}
