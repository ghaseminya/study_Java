//2차원 배열 길이 확인

public class ArrayEx11 {

	public static void main(String[] args) {

		//2차원 배열 생성
		int[][] arr={
				{10},
				{20, 30},
				{11, 22, 33, 44, 55, 66},
				{40, 50, 60},
				{70, 80, 90, 100}
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
//arr[0][0] = 10
//arr[1][0] = 20
//arr[1][1] = 30
//arr[2][0] = 11
//arr[2][1] = 22
//arr[2][2] = 33
//arr[2][3] = 44
//arr[2][4] = 55
//arr[2][5] = 66
//arr[3][0] = 40
//arr[3][1] = 50
//arr[3][2] = 60
//arr[4][0] = 70
//arr[4][1] = 80
//arr[4][2] = 90
//arr[4][3] = 100


