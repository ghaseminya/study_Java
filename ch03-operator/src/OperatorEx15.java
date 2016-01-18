/*
증감 연산자
	• 1씩 증가 또는 감소시키는 연산자입니다. 
	• 모든 수치 데이터 형식과 열거형식에서 사용
	• ++ 또는 -- 연산자가 변수 앞에 위치하느냐? 아니면 변수 뒤에 위치하느냐? 가 중요한 연산자입니다.


[증감 연산자 종류]
연산자		의미
++		1씩 증가
--		1씩 감소


[증감 연산자 선행/후행 실행후 결과값 확인]
a++		선 연산, 후 증가 (먼저 연산하고 그 다음 증가)
a--		선 연산, 후 감소 (먼저 연산하고 그 다음 감소)
++a		선 증가, 후 연산 (먼저 증가하고 그 다음 연산)
--a		선 감소, 후 연산 (먼저 감소하고 그 다음 연산)


//증감 연산자 선행/후행 실행후 결과값 확인
//증감연산자 후행에서는 증가/감소값이 해당 연산 수행문에서는 적용이 되지 않고 다음 문장 부터 적용이 되게 됩니다. (주의)
*/
public class OperatorEx15 {

	public static void main(String[] args) {

		int n1=7;
		int result1=0;
		result1 = ++n1;
		System.out.println("++n : " + result1);	//++n : 8
		
		
		int n2=7;
		int result2 =0;
		result2= --n2;
		System.out.println("--n : " + result2);	//--n : 6
		
		
		int n3=7;
		int result3 =0;
		result3= n3++;
		System.out.println("n++ : " + result3);	//n++ : 7
		
		
		int n4=7;
		int result4 =0;
		result4= n4--;
		System.out.println("n-- : " + result3);	//n-- : 7
		//증감연산자 후행에서는 증가/감소값이 해당 연산 수행문에서는 적용이 되지 않고
		//다음 문장 부터 적용이 되게 됩니다. (주의)
	}
}
