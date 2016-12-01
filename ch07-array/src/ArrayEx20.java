//문자열 배열 내림차순 정렬(역순 소트)

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayEx20 {

	public static void main(String[] args) {
		String[] a = { "bbb", "AAA", "DDD", "똠방각하", "CCC", "aaa" };

	    Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);


	//////////////////////////////////////////////////
	    // 배열을 리스트로 변환
	    List<String> list = Arrays.asList(a);

	    // 리스트 뒤집어 주기
	    Collections.reverse(list);
	//////////////////////////////////////////////////


	    // 리스트를 배열로 다시 변환
	    a = list.toArray(new String[list.size()]);


	    // 순서 뒤집어진 배열을 문자열로 변환 후 출력
	    String s = Arrays.toString(a);
	    System.out.println(s);
	    // 출력 결과: [똠방각하, DDD, CCC, bbb, aaa, AAA]
	}

}
