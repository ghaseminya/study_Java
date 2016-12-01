//숫자 거꾸로 정렬

import java.util.Arrays;

public class ArrayEx19 {

	public static void main(String[] args) {

		int[] i = { -1, 0, 299, 2, 956, 0, 9, -900 };

		
		// 정렬
		//import java.util.Arrays;
		Arrays.sort(i);

		// 오른차순 정렬 결과
		System.out.println(Arrays.toString(i));
		
		// 배열 순서 거꾸 바꾸기
		reverseArrayInt(i);		

		// 순서 뒤집어진 정수 배열을 문자열로 변환 후 출력
		System.out.println(Arrays.toString(i));
		// 출력 결과: [956, 299, 9, 2, 0, 0, -1, -900]
	}

	public static void reverseArrayInt(int[] array) {
		int temp;

		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = temp;
		}
	}
}
