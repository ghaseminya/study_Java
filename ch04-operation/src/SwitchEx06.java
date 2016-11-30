/*
문자열을 통한  switch~case문 비교
JDK ver7.0부터  switch()문에 인자값으로 문자열 전달 가능
*/

public class SwitchEx06 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String operator;
		String result="";
		
		//next(): 문자 또는 문자열을 공백을 기준으로 한단어 또는 한문자를 입력 받습니다
		//버퍼에 입력된 문자나 문자열에서 공백전까지의 단어 가져오기

		System.out.print("한국어를 입력하세요 > ");
		operator = input.nextLine();
		//nextLine(): 문자 또는 문자열 한라인 전체를 입력 받습니다.
		
		switch(operator){
			case "안녕하세요. 신사 숙녀 여러분":{
				result = "Hello, Radies and Gentlemen.";			
				break;
			}
			case "안녕히 가세요":{
				result = "Good-bye";			
				break;
			}
			case "잘 생기셨네요":{
				result = "You're handsome.";
				break;
			}
				
			default:{
				result= "머라카노~~~";			
//				System.exit(0);	//프로그램 종료
			}
		}
		
		System.out.println();//한줄 줄 바꿈
		System.out.print(operator + " : " + result);
		
		input.close();
	}
}


/*
한국어를 입력하세요 > 안녕하세요. 신사 숙녀 여러분

안녕하세요. 신사 숙녀 여러분 : Hello, Radies and Gentlemen.



한국어를 입력하세요 > 오빠야~

오빠야~ : 머라카노~~~
*/