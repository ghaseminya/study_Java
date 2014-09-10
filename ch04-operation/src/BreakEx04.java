/*
3의 배수이고 7의배수인 정수를 찾기

*/
public class BreakEx04 {

	public static void main(String[] args) {

		int num=1;
		boolean result=false;
		
		while(num<100)
		{
			//3의 배수이고 7의 배수인 정수이면 while문 빠져나가기
			if(num%3==0 && num%7==0)
			{
				result=true;
				break;
			}
			num++;
		}
		
		if(result)
			System.out.println("찾는 정수 : " + num);
		else
			System.out.println("3의 배수이고 7의 배수인 정수를 찾지 못했습니다.");
	}

}
