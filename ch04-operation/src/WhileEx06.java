//while문 - 입력값 누적합구하기 및 강제 종료
//Ctrl+Q 강제종료
//0을 입력하면 종료

public class WhileEx06 {
	public static void main(String[] args){
		java.util.Scanner input= new java.util.Scanner (System.in);
		int i= 1;
		int sum = 0;
		System.out.println("더할 숫자를 입력해 주세요");

//		while(i>0){ //0입력하면 종료
		while(i>=0){
			i = input.nextInt();
			sum=sum+i;
			System.out.println("누적합계 : " + sum);
		}
		System.out.println("반복을 종료합니다");
		
		input.close();
	}
}


//출력결과
//더할 숫자를 입력해 주세요
//10
//누적합계 : 10
//7
//누적합계 : 17
//4
//누적합계 : 21
//11
//누적합계 : 32
//Ctrl+Q 강제종료


//출력결과 - 0을 입력하면 종료
//더할 숫자를 입력해 주세요
//7
//누적합계 : 7
//6
//누적합계 : 13
//0
//누적합계 : 13
//반복을 종료합니다