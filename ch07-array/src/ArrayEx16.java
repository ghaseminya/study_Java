//한글 정렬

import java.util.Arrays;

public class ArrayEx16 {

	public static void main(String[] args) {
		
		// 한글 문자열 배열 정렬 (가나다 순으로 정렬됩니다.)
		String myclass[] = { 
				"유재석", "박명수", "정준하", "하동훈", "노홍철", "정형돈",
				"사나", "다현", "지효", "모모", "미나", "채영", "나연", "정연",
				"윤아", "서현", "수영", "태연", "유리", "효연", "티파니", "써니", "제시카"
				};

		//import java.util.Arrays;
		Arrays.sort(myclass);
		System.out.println(Arrays.toString(myclass));
				
		
		
	}
}

/* 출력결과
[나연, 노홍철, 다현, 모모, 미나, 박명수, 사나, 서현, 수영, 써니, 유리, 유재석, 윤아, 정연, 정준하, 정형돈, 제시카, 지효, 채영, 태연, 티파니, 하동훈, 효연]

*/