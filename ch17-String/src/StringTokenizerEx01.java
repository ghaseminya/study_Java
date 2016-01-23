//StringTokenizer - 문자열의 구분자가 있는 경우
//
//String객체 생성
//StringTokenizer사용을 위해 import


import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		
		//구분자가 같은 경우
		String source = "100,200,300,400,500";
		//StringTokenizer(토큰을 나눌 대상 문자열정보, "구분자정보");
		StringTokenizer st = new StringTokenizer(source, ",");
		
		//데이터 있는지 검증한 후 있으면 추출
		//데이터 검증하기 - hasMoreTokens()
		while(st.hasMoreTokens()){
			// 데이터 추출하기 - nextToken()
			System.out.println(st.nextToken());
		}
	}
}


/*//출력결과
100
200
300
400
500
*/