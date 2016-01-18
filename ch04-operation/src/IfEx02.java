/*
//조건문 - if~else문
//정수형 입력 받은 후 짝수 홀수 구분하기


[if~else문 형식]
if(true or false){
     //true시 수행되는 영역
}else{
     //false시 수행되는 영역
}

*/
public class IfEx02 {

	public static void main(String[] args) {
		
		//Scanner의 인스턴스를 생성
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a;
		
		System.out.print("정수형 데이터 하나를 입력 > ");
		a = input.nextInt();
				
		
		if(a%2 == 1){	//홀수 체크
			System.out.print("홀수 입니다.");
			
		}else{	// 짝수
			System.out.print("짝수 입니다.");			
		}
		
		//자원 해제, 자원 닫기
		input.close(); 
	}
}
