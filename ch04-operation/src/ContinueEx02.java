/*
//3의 배수가 아니거나 7의 배수가 아니라면 출력하고 카운트 증가시키기

제한사항
3의 배수이거나 7의 배수만 출력하고 카운트를 증가
3의 배수이거나 7의 배수가 아니라면 출력하지 않고 continue문 수행

*/
public class ContinueEx02 {

	public static void main(String[] args) {

		int num=0;
		int count=0;
		
		while((num++)<100)
		{
			//3으로 나눠서 0이 아니라면 7로 나눠서 0이 아니라면 (3의 배수가 아니거나 7의 배수가 아니라면)
			if(num%3!=0 || num%7!=0)
				continue;	//이하 부분 생략하고 조건문으로 이동
			
			count++;
			System.out.println(num);
		}
		
		System.out.println("count: " + count);
		
	}
}
