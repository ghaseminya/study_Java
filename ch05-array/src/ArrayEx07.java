
public class ArrayEx07 {

	public static void main(String[] args) {
		// 2차원 배열
		
		//배열 선언
		int test[][];
		
		//배열 생성
		test = new int[2][3];
		
		//배열 초기화
		test[0][0] =100;
		test[0][1] =200;
		test[0][2] =300;

		test[1][0] =400;
		test[1][1] =500;
		test[1][2] =600;		
		
		//2차월 배열 출력
		for( int i=0; i<test.length; i++){
			
			for(int j=0; j<test[i].length; j++){
				System.out.println("test[" + i + "][" + j +"] = "+ test[i][j]);				
			}
		}
		
		//================== 배열 선언 방법
		//배연 선언과 동시에 생성
		int[][] exam1 = new int[2][3];
		
		//배열 선언 및 생성, 초기화 동시 수행(명시적 배열 생성)
		int[][] exam2 = new int[][]{{100,200,300}, {400,500,600}};
		
		//배열 선언 및 생성, 초기화 동시 수행 (암시적 배열 생성)
		int[][] exam3 = { {100,200,300},{400,500,600} };
		
		int[][] exam4 = { 
							{100,200,300},
							{400,500,600} 
						};
		
	}
}
