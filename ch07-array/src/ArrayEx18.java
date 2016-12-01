import java.util.Arrays;

// 숫자 정렬

public class ArrayEx18 {

	public static void main(String[] args) {

		// 숫자 배열 정렬 (1234 순으로 정렬됩니다.)
		double num[] = { 
				-1000, 0.0789026, 0.2, -0.184162, 
				0, 123, -0.32, 2016, -0.1, 
				1000, 0.4999 };

		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		//정수와 실수가 섞여져 있으면, 정수는 double형 실수로 자동형변환되어 출력됩니다
	}
}

/* 출력결과
[-1000.0, -0.32, -0.184162, -0.1, 0.0, 0.0789026, 0.2, 0.4999, 123.0, 1000.0, 2016.0]
*/