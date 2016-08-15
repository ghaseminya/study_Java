/*
//단일 for - 단 입력 받은 후 구구단 출력하기

다중 for문
	• 단일 for문에서 끝나는 것이 아니라 그것을 다시 여러 번 반복하는 제어문입니다. 
	• 다시 말해서 for문 안에 for문이 있는 구문을 다중 for문이라 합니다. 


[다중 for문 형식]
for(초기식1 ; 조건식1 ; 증감식1) {
              
    for(초기식2 ; 조건식2 ; 증감식2){
		명령어2;
    }
         
        명령어1;
}
 
명령어3; 


*/
public class ForEx04 {

	public static void main(String[] args) {
		
		int dan;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("단 입력하세요 > ");
		dan = input.nextInt();
		
		System.out.print("== " + dan + "단 == \n");
		
		for(int i=1; i<10; i++){
			System.out.println(dan + "X" + i + " = " + (dan*i));			
		}
		
		input.close();
	}
}


//출력결과
//단 입력하세요 > 3
//== 3단 == 
//3X1 = 3
//3X2 = 6
//3X3 = 9
//3X4 = 12
//3X5 = 15
//3X6 = 18
//3X7 = 21
//3X8 = 24
//3X9 = 27
