//2차원 배열 길이 확인

public class ArrayEx11 {

	public static void main(String[] args) {

		//2차원 배열 생성
		int[][] arr={
				{1},
				{2, 3},
				{1, 2, 3, 4, 5, 6},
				{4, 5, 6},
				{7, 8, 9, 10}
		};

		//배열의 전체 길이
		System.out.println("배열의 세로길이: "+arr.length); //배열의 세로길이: 5

		//각 행의 길이 (가로)
		for(int i=0; i<arr.length; i++)
			System.out.printf("%d행의 길이: %d \n", i+1, arr[i].length);
		
		
		//2차월 배열 출력
		for( int i=0; i<arr.length; i++){ //행
			
			for(int j=0; j<arr[i].length; j++){ //열
				System.out.println("arr[" + i + "][" + j +"] = "+ arr[i][j]);				
			}	//j<arr[i].length : 이을 통해 2차원 배열은 둘이상의 1차원 배열을 묶은 형태라는 것을 알수 있습니다.
		}
		
	}
}


//출력결과
//배열의 세로길이: 5
//1행의 길이: 1 
//2행의 길이: 2 
//3행의 길이: 6 
//4행의 길이: 3 
//5행의 길이: 4 
//arr[0][0] = 1
//arr[1][0] = 2
//arr[1][1] = 3
//arr[2][0] = 1
//arr[2][1] = 2
//arr[2][2] = 3
//arr[2][3] = 4
//arr[2][4] = 5
//arr[2][5] = 6
//arr[3][0] = 4
//arr[3][1] = 5
//arr[3][2] = 6
//arr[4][0] = 7
//arr[4][1] = 8
//arr[4][2] = 9
//arr[4][3] = 10

