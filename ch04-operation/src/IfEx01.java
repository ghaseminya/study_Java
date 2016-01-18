/*
//조건문 - 단일 If문 


if문
	• 한번에 하나의 조건을 판단하여 분기
	• boolean형(true/false)의 결과를 가지는 조건식이 있어야 하며 그 조건식의 결과로 수행해야하는 문장을 결정하게 되는 분기문입니다.
	• 중괄호({)는 하나의 문장만 올 경우 생략 가능합니다.


[if문 형식]
if(true or false)
    //true시 수행되는 문장;


if(true or false){
    //true시 수행되는 문장;
    //true시 수행되는 문장;
}

*/
public class IfEx01 {

	public static void main(String[] args) {		
		
//		int n =4;
		int n =10;
		
		if( n > 5){
			System.out.println("n은 5보다 크다");
		}
		
		System.out.println("프로그램 종료");
	}
}
