//2차원 배열 길이 확인


public class ArrayEx11 {

	public static void main(String[] args) {

		//2차원 배열 생성
		int[][] arr={
				{1},
				{2, 3},
				{4, 5, 6},
				{7, 8, 9, 10}
		};

		System.out.println("배열의 세로길이: "+arr.length);

		for(int i=0; i<arr.length; i++)
			System.out.printf("%d행의 길이: %d \n", i+1, arr[i].length);
	}
}
