/*
//키워드 return의 역할

//함수안에서 return키워드의 역할 확인하기
//	• 메소드 종료 
//	• 메소드 종료 and 값 반환


return 키워드 역할
	• 값의 반환
	• 메소드 종료

*/
public class FunctionEx04 {

	public static void main(String[] args) {
		dividedby(4, 2);
		dividedby(6, 2);
		dividedby(8, 0);
		
		int returnResult = divide(6, 2);
		System.out.println("리턴된 결과: " + returnResult);
	}
	

	public static void dividedby(int num1, int num2)
	{
		if(num2==0)
		{
			System.out.println("(알림)0값으로 나눌 수 없습니다.");
			
			//메소드 종료
			return;
		}
		System.out.println("나눗셈 결과: " + (num1/num2));
	} 

	public static int divide(int num1, int num2)
	{
		int result = 0;
		if(num2==0)
		{
			System.out.println("(알림)0값으로 나눌 수 없습니다.");
			
		}else{
			result = num1/num2;
		}
		
		//메소드 종료 and 값 반환
		return result;
	} 
}
