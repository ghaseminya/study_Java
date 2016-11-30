//while문 - 증감값의 후행/선행 (주의)


public class WhileEx01 {

	public static void main(String[] args) {
		
		int i = 10;	//초기식
		
		//후행
		while( i >= 0){	//조건식
			System.out.println(i--);	//증감식			
		}		
		System.out.println("후행 후  i : " + i);
		System.out.println();
		
		
		//선행
		int j = 10;		
		while( j >= 0){	//조건식
			System.out.println(--j);	//증감식			
		}		
		System.out.println("선행 후  j : " + j);
		System.out.println();
	}
}


//출력결과
//10
//9
//8
//7
//6
//5
//4
//3
//2
//1
//0
//후행 후  i : -1
//9
//8
//7
//6
//5
//4
//3
//2
//1
//0
//-1
//선행 후  j : -1
