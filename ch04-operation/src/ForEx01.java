/*
//for()문 - 비교 인자값 증가

[반복문(Repetitive statement)]
	• 원하는 특정한 문장을 정해진 규칙에 따라 반복처리하기 위한 제어문.
	• 모든 반복문은 무한루프에 빠지지 않도록 주의
	• for문, while문, do~while문


[for문]
원하는 특정한 명령들을 정해진 규칙에 따라 반복처리 할 때 사용하는 제어문입니다. 


[for문의 구성형식]
for(초기식 ; 조건식 ; 증감식){
        수행문1;
        수행문2;
}

초기식		• 가장 먼저 수행하는 부분이며 두 번 다시 수행되지 않습니다.
		• 반복문에 사용할 변수를 초기화
		• 다중 for문에서는 예외
	
조건식		• 초기식 다음으로 수행하는 부분이며
		• loop가 돌때마다 한번씩 비교하여 반복을 수행해야 할지 반복을 벗어나야 할지를 결정합니다. 
	
증감식		• 증감식은 loop를 수행할 때마다 조건식을 비교하기 전에 항상 수행하며(매 반복이 끝날때 마다 수행)
		• 조건식에 사용되는 변수의 값을 증가 시키거나 감소 시켜 loop를 수행하거나 무한 루프를 방지하는 부분입니다.


*/
public class ForEx01 {

	public static void main(String[] args) {
		
		//for(초기식 ; 조건식 ; 증감식){
		for( int i=1; i<=5; i++){
			//수행문
			System.out.print("\t"+i);
		}
		System.out.println();	//단순 줄바꿈
		System.out.print("\n");	//단순 줄바꿈
		System.out.println("프로그램을 종료합니다!!");
	}

}


//실행결과
//1	2	3	4	5
//
//프로그램을 종료합니다!!

