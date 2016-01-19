/*
//무한 루프 적절한 사용 예제
//17배수이고 13의 배수인 정수 찾기

무한루프(무한반복)와 break
	• 모든 반복문은 무한루프에 빠지지 않도록 주의
	• 무한루프는 보편적으로 break문과 함께 사용됩니다.

*/
public class LoopEx01 {

	public static void main(String[] args) {

		int num=1;

		while(true)
		{
			if(num%17==0 && num%13==0)	//무한반복을 빠져나오기위한 구문
				break;
			num++;			
		}

		System.out.println("찾는 정수: " + num);	//찾는 정수: 221
	}
}
