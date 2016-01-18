
/*
초기화 시에만 변환 적용됩니다.

[형 변환 종류]
프로모션
디모션

[프로모션]
	• 더 큰 자료형으로 변환(자동 형변환)
	• 작은 자료형 -> 큰 자료형
	• 정보의 손실 없음
short s=7;
float f = s + 3.14f;


[디모션]
	• 더 작은 자료형으로 변환(명시적 형변환)
	• 큰 자료형 -> 작은 자료형
	• 경우에 따라 정보의 손실 발생
int i = 0;
short s=10;
i = (int)(10 + 3.5f) 


[명시적 형변환]
	• 자동 형 변환 발생지점을 표시하기 위해서 사용(의도한 형 변환임을 표시)
	• 자동 형 변환의 규칙에 위배되지만 변환이 필요한 상황에 사용(디모션)
	• 중괄호 사용하여 표현


//자동형 변환을 통해 문자의 유니코드 값 출력
*/
public class CastEx01 {

	public static void main(String[] args)
	{
		char ch1='A';
		char ch2='Z';
			
		int num1=ch1;
		int num2=(int)ch2;

		System.out.println("문자 A의 유니코드 값: "+num1);
		System.out.println("문자 Z의 유니코드 값: "+num2);	
	}
}
