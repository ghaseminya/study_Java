//예외처리 - try~catch()
//ExceptionEx01 발생에러 예외처리하기
//try{} catch{}문 이해
//------------------------------
//학습내용
//	• 에러를 추적하여 표시
//		○ printStackTrace(): 예외가 발생되기까지의 모든 과정과 예외코드 라인번호를 출력
//	• 에러 문구 간단 표시
//		○ getMessage(): 간략하게 예외정보 출력
//	• 사용자가 정의한 에러문구 출력하기


package com.basic;

public class ExceptionEx02 {

	public static void main(String[] args) {
		
		int[] var = {10, 20, 30};
		
		for(int i=0; i<=3; i++){
			try{ // 예외가 발생할 가능성이 있는 코드 작성 영역
				System.out.println("var["+ i + "]: " + var[i]);				
			}catch(ArrayIndexOutOfBoundsException e){
				// 예외 발생시 대체할 수 있는 코드 명시하는 영역
				
				//에러를 추적하여 표시
				//printStackTrace(): 예외가 발생되기까지의 모든 과정과 예외코드 라인번호를 출력
//				e.printStackTrace();
				
				//에러 문구 간단 표시
//				System.out.println(e.toString());
				
				//사용자가 정의한 에러문구 출력하기
				System.out.println("없는 인덱스를 호출했습니다.");
			}		
		}
		System.out.println("프로그램 끝!!");
	}
}


/*//사용자가 정의한 에러문구 출력하기
var[0]: 10
var[1]: 20
var[2]: 30
없는 인덱스를 호출했습니다.
프로그램 끝!!
*/