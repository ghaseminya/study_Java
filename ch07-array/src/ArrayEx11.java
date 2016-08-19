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

		System.out.println("배열의 세로길이: "+arr.length);

		for(int i=0; i<arr.length; i++)
			System.out.printf("%d행의 길이: %d \n", i+1, arr[i].length);
		
	}
}


//출력결과
//배열의 세로길이: 5
//1행의 길이: 1 
//2행의 길이: 2 
//3행의 길이: 6 
//4행의 길이: 3 
//5행의 길이: 4 
