//메소드의 매개변수도 지역변수
//- 메소드의 매개변수도 메소드내에서만 유효한 지역변수 입니다.

public class VariableScopeEx02 {
	public static void main(String[] args)
	{
		callNum();
		
		int result = square(7);
		System.out.println(result);
		
		for(int num=1; num<10; num++){
			System.out.println(num);
		}
		
	}
	
	public static void callNum()
	{
		int num=30;
		System.out.println(num);
	}
	
	public static int square(int num)
	{
		int result = num*num;
		return result;
	}
}
