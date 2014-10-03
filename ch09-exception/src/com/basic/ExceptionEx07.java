/* 예외처리 - 사용자 정의 예외 처리
 * 
 * 
 * 양수만 입력되게 하고
 * 음수 입력시 예외처리하기
 * 
 * 
 * 사용자 정의 예외 클래스 작성: 예외문구만 받아서 처리하기 위해 사용
 */

package com.basic;

//사용자 정의 예외 클래스
class UserException extends Exception{
	public UserException(String str){
		super(str);
	}
}

public class ExceptionEx07 {

	public static void main(String[] args) {
		
//		UserException ux = new UserException(str);
		
		try{
			int a = -11;
			if( a <=0 ){
				//사용자가 정의한 예외를 인위적으로 발생시킴
				//예외 발생시 UserException객체가 생성되고 해당 메시지가 전달됨
				throw new UserException("양수가 아닙니다");				
			}			
		}catch(UserException e){
			System.out.println(e.getMessage());
		}
	}
}
