//문자열 배열 내림차순 정렬(역순 소트)
//객체 학습 후

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayEx20 {

	public static void main(String[] args) {
		String[] a = { "flower", "dragon", "DRAGON", "코드드레곤", "CODE", "code" };

		// String.CASE_INSENSITIVE_ORDER: 대소문자 구분 없이 정렬
	    Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);

	    System.out.println(Arrays.toString(a));
	    //[CODE, code, dragon, DRAGON, flower, 코드드레곤]
	    //대문자 순 정렬 -> 소문자 순 정렬 -> 대문자 순 정렬 -> 한글 순 정렬
	    
	    // 배열을 리스트로 변환
	    List<String> list = Arrays.asList(a);

	    // 리스트 뒤집어 주기
	    Collections.reverse(list);


	    // 리스트를 배열로 다시 변환
	    a = list.toArray(new String[list.size()]);


	    // 순서 뒤집어진 배열을 문자열로 변환 후 출력
	    String s = Arrays.toString(a);
	    System.out.println(s);
	    // 출력 결과: [똠방각하, DDD, CCC, bbb, aaa, AAA]
	}

}
