/*
//변수의 범위 확인

변수의 영역(scope, 가시영역)
	• 변수가 사용될 수 있는 범위
	• 변수가 선언된 지역({ })을 벗어나면 변수는 자동 소멸됩니다.
	• 변수의 영역이 다르면 동일한 변수 명을 가질 수 있습니다.
	• 메소드의 매개변수도 메소드내에서만 유효한 지역변수입니다.

*/
public class VariableScopeEx01 {
	
	public static void main(String[] args)
	{
		
		boolean scope=true; //scope의 범위
		
		if(scope)
		{
			int num=10;	//num의 범위
			num++;
			System.out.println(num);
		}
		else
		{
			int num=20;	//num의 범위
			System.out.println(num);
		}
		
		callNum();
	}
	
	public static void callNum()
	{
		int num=30;		//num의 범위
		System.out.println(num);
	}
}

