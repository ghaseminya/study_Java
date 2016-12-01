//영문 문자열 정렬

import java.util.Arrays;

public class ArrayEx17 {
	public static void main(String[] args) {
		String[] s = { "bbb", "AAA", "TTT", "mmm", "DDD", "CCC", "aaa" };
		// TODO 1: 대소문자 구분하여 정렬
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		// [AAA, CCC, DDD, TTT, aaa, bbb, mmm]
		

		// TODO 2: 대소문자 구분 없이 정렬
		Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(s));
		// AAA, aaa, bbb, CCC, DDD, mmm, TTT]
		//대문자 순 정렬 -> 소문자 순 정렬 -> 대문자 순 정렬 -> 소문자 순 정렬 -> 대문자 순 정렬
	}
}

