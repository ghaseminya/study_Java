//StringBuffer - 문자열 변경

//학습내용
//• 객체 생성
//• 특정 인덱스에 문자 삽입
//• 문자열 끝에 문자열 붙이기
//• 문자열 대체
//• 문자열 삭제
//• 문자열 변경완료후 스트링으로 저장하기


public class StringBufferEx02 {

	public static void main(String[] args) {
		//
		StringBuffer sb = new StringBuffer("자바 정말 쉽다!!");
		//자바  정말  쉽다!!
		//012 345 6789
		System.out.println("1: " + sb); //1: 자바 정말 쉽다!!
		
		//특정 인덱스에 문자 삽입
		sb.insert(2, '는');
		System.out.println("2: " +sb); //2: 자바는 정말 쉽다!!
		
		//문자열 끝에 문자열 붙이기
		sb.append("오라클은");
		System.out.println("3: " +sb); //3: 자바는 정말 쉽다!!오라클은
				
		sb.append(" 재미있다");
		System.out.println("4: " +sb); //4: 자바는 정말 쉽다!!오라클은 재미있다
		
		//문자열 대체
		sb.replace(0,  3, "C#");
		System.out.println("5: " +sb); //5: C# 정말 쉽다!!오라클은 재미있다
		
		//문자열 삭제
		sb.delete(0, 3);
		System.out.println("6: " +sb); //6: 정말 쉽다!!오라클은 재미있다
		
		//문자열 변경완료후 스트링으로 저장하기
		String str = sb.toString();
		System.out.println("7: " +str); //7: 정말 쉽다!!오라클은 재미있다
	}
}
