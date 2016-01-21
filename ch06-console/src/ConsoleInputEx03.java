//Scanner클래스의 다양한 메소드 사용


import java.util.Scanner;

public class ConsoleInputEx03 {

	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("당신의 이름은? ");

		//nextLine() : 한라인의 문자열을 입력값으로 가져옵니다.
		String str=keyboard.nextLine();
		System.out.println("안녕하세요 "+str+'님');
		
		
		System.out.print("당신은 잘 생겼다고 생각하십니까, 예(true)/아니오(false)? ");
		
		//nextBoolean() : boolean타입의 자료형 값을 입력값으로 가져옵니다.
		boolean isTrue=keyboard.nextBoolean();
		if(isTrue==true)
			System.out.println("오~ 멋쟁이님");
		else
			System.out.println("헐~ 대박 .");
	
		
		System.out.print("당신과 짝꿍의 영어점수는 어떻게 되나요? ");
		
		//nextDouble(): Double타입의 자료형 값을 가져옵니다.
		double num1=keyboard.nextDouble();
		double num2=keyboard.nextDouble();
		double diff=num1-num2;
		if(diff>0)
			System.out.println("당신이 "+diff+"만큼 크군요.");
		else
			System.out.println("당신이 "+(-diff)+"만큼 작군요.");
		
		System.out.print("당신의 키는? ");
		double num3=keyboard.nextDouble();
		System.out.println("당신의 키는 "+ num3 +"입니다.");
		
		keyboard.close();
	}
	
}
