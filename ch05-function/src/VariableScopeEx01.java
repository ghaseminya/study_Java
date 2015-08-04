//변수의 범위 확인

public class VariableScopeEx01 {
	
	public static void main(String[] args)	//args의 범위
	{
		
		boolean scope=true;
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

