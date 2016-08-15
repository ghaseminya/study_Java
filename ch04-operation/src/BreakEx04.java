/* //LAB
//3의 배수이고 7의배수인 정수를 찾기
//3의 배수이고 7의배수인 정수 찾으면 더 이상 수행하지 않고 while문 빠져나가기


[제한사항]
	• 1~100까지의 수 중
	• 3의 배수이고 7의배수인 정수 찾으면 더 이상 수행하지 않고 while문 빠져나가기
	• while문 빠져나온후 찾은 정수 출력하고, 찾지못한 경우는 찾지 못했다고 출력하기

*/

public class BreakEx04 {

	public static void main(String[] args) {

		int num=1;
		boolean result=false;
		
//		while(num<10)	//찾은 못한경우 검증시 코드
		while(num<100){
			
			//3의 배수이고 7의 배수인 정수이면 while문 빠져나가기
			if(num%3==0 && num%7==0){
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
