//예외처리 - 사용자 정의 예외 처리
//양수만 입력되게 하고 음수 입력시 예외처리하기
//--------------------------------
//사용자 정의 예외 클래스 작성: 예외문구만 받아서 처리하기 위해 사용

package com.basic;

//오노테이션 처리 방법
//경고메시지가 나오는 구문에 마우스 커스를 가져간 다음 나오는 창에서 
//Add @SuppressWarnings 'serial' to 'UserException' 링크 클릭

//사용자 정의 예외 클래스 정의: 예외문구만 받아서 처리하기 위해 사용
@SuppressWarnings("serial")
class UserException extends Exception{
	public UserException(String str){
		super(str);
	}
}

public class ExceptionEx07 {

	public static void main(String[] args) {

//		UserException ux = new UserException(str);
		
//		int a = -11;
		int a = 11;
		
		//양수만 입력되게 하고 음수 입력시 예외처리하기
		try{
//			
			if( a <=0 ){
				//사용자가 정의한 예외를 인위적으로 발생시킴
				//예외 발생시 UserException객체가 생성되고 해당 메시지가 전달됨
				throw new UserException("양수가 아닙니다");				
			}			
		}catch(UserException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(a);
	}
}


/*//int a = -11; 경우 출력결과
양수가 아닙니다
-11
*/

/*//int a = 11; 경우 출력결과
11
*/