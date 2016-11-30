/*
//switch문에 문자 비교
	• if문의 조건값은 boolean형인데 비해 
	• switch문의 조건값은 long형을 제외한 정수형(byte, short, int) 또는 char형이 올 수 있습니다. 

if			switch
boolean		byte
			short
			int
			char

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
