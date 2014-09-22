/*
switch문에 문자 비교
*/

public class SwitchEx02 {

	public static void main(String[] args) {
		
		//char a = 'A';
		//char a = 'B';
		char a = 'C';
		//char a ='D';
		
		switch(a){	//char -> int 형변환 됨(아스키 코드로 인식됨)
		case 'A':
			System.out.println("A 출력하였습니다.");
			break;
		case 'B':
			System.out.println("B 출력하였습니다.");
			break;
		case 'C':
			System.out.println("C 출력하였습니다.");
			break;
		default:
			System.out.println("A, B, C가 아닌 문자 입니다.");		
		}
	}
}
