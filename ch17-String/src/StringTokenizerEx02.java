//StringTokenizer - 문자열의 구분자가 여러개인 경우


import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		//문자열의 구분자가 여러개 인 경우		
		String source = "2020-03-12 16:24:50";
		
		//구분자 여러개를 한꺼번에 지정
		StringTokenizer st = new StringTokenizer(source, "-: ");
		
		while(st.hasMoreTokens()){	//반환할 토큰이 있는지 확인 -토큰이 있으면 true
			System.out.println(st.nextToken());	//다음 번 토큰 반환
		}				
	}
}


/*//출력결과
2020
03
12
16
24
50
*/