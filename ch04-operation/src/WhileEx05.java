/*

do~while문
	• while문이 		[선 비교, 후 처리]라 하면 
	  do ~ while문은	[선 처리, 후 비교]이다. 
	• 즉 조건식에 불만족하더라도 무조건 한번은 수행하게 되어 있습니다.
	• while 조건식 뒤의 ;(세미콜론) 잊지 말것


[do~while 구성 및 동작]
do{ 
     수행구문

}while(조건식);


//------------------------------------
조건식이 만족하는 경우의 결과확인
조건식이 만족하지않은 경우의 결과확인
*/
public class WhileEx05 {

	public static void main(String[] args) {
		
//		int num=0;	//초기값 (조건식 만족)
		
		int num=10;	//조건식을 만족시키지 않는 초기값
		
		do 
		{
			System.out.println("I Love JAVA - " + num);	//무조건 한번은 수행됨
			num++;		//반복문을 종료하기 위한 구문
		}while(num<7);	//반복 조건
	}
}
