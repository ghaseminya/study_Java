package com.basic;


@SuppressWarnings("serial")
class UserException11 extends Exception {
	private int port = 3306; //MySQL 기본포트

	public UserException11(String msg) {
		super(msg);
	}

	public UserException11(String msg, int port) {
		super(msg);
		this.port = port;
	}

	public int getPort() {
		return port;
	}
}

public class ExceptionEx11 {

	public void testFunction(String[] n) throws UserException11 {
		System.out.println("testFunction");
		if (n.length < 1)
			throw new UserException11("아무것도 입력되지 않았습니다."); // 강제 예외 발생1
		else {//1521 : Oracle 기본포트
			throw new UserException11("강제 예외 발생", 1521); // 강제 예외 발생2
		}
	}

	public static void main(String[] args) {

		ExceptionEx11 ex = new ExceptionEx11();
		
//		String[] arr = {}; // 강제 예외 발생1
		String[] arr = {"예외", "처리"}; // 강제 예외 발생2
		
		try {
			ex.testFunction(arr);
		} catch (UserException11 ue) {
//			System.out.println(ue.getMessage());
			ue.printStackTrace();
			
//			System.out.println(ue.getPort());
		}

	}
}
