package com.basic;
/*
//예외처리 - try~catch()
	• ExceptionEx01 발생에러 예외처리하기
	• try{} catch{}문 이해

//------------------------------
학습내용
	• 에러를 추적하여 표시 (TODO 1)
		○ printStackTrace(): 예외가 발생되기까지의 모든 과정과 예외코드 라인번호를 출력
	• 에러 문구 간단 표시 (TODO 2)
		○ getMessage(): 간략하게 예외정보 출력
	• 사용자가 정의한 에러문구 출력하기 (TODO 3)
		○ System.out.println("없는 인덱스를 호출했습니다.");


File Info
ExceptionEx01	• 예외발생 확인
				• 배열의 인덱스 범위를 넘어가서 예외가 발생합니다.
				
->ExceptionEx02	• 예외처리 - try~catch
				• ExceptionEx01의 예외발생 예외처리

//------------------------------
예외(Exception)
	• 내가 예상하는 일외에 뜻하지 않은 일들이 생길 수 있습니다. 이렇게 예상하지 못한 일들을 ‘예외’라고 하고
	• 예외를 대비하고 준비하는 것이 ‘예외처리’입니다.


예외처리(Exception Handleing)에 대한 필요성과 이해
	• 자바에서 프로그램 실행 도중에 예외가 발생하면 발생된 그 시점에 프로그램이 바로 종료되게 됩니다.
	• 경우에 따라서는 예외가 발생 했을 때 -> 프로그램을 종료시키는 것이 좋은 판단일 수도 있습니다. 
	• 하지만 가벼운 예외이거나 예상을 하고 있었던 예외라면 -> 
	프로그램을 종료시키는 것보다는 해당 예외에 대응하는  적절한 처리를 하는것이 효율적입니다.
	• 그래서 예외 처리를 통해 프로그램의 비 정상적인 종료를 막고 
	발생한 예외에 대한 처리를 하여 정상적인 프로그램 실행을 계속 진행할 수 있도록 하는 것이 예외처리가 필요한 이유입니다.


예외처리 예
	• 나누기 연산시 0으로 나누는 경우
	• 배열의 크기를 벗어나는 배열 요소 접근
	• 데이터 전송시 네트워크 중단
	• 데이터 저장시 저장용량 초과 등...


예외 조치
호출하고자 하는 메소드가 예외를 발생시킬 수 있다면, 다음 두 가지 중 한가지 조치를 반드시 취해야 하므로, 
API 문서의 참조가 필요합니다.
	1) try~catch문을 통한 예외의 처리
	2) throws를 이용한 예외의 전달

*/

public class ExceptionEx02 {

	public static void main(String[] args) {
		
		int[] var = {10, 20, 30};
		
		for(int i=0; i<=3; i++){
			try{ // 예외가 발생할 가능성이 있는 코드 작성 영역
				System.out.println("var["+ i + "]: " + var[i]);				
			}catch(ArrayIndexOutOfBoundsException e){
				// 예외 발생시 대체할 수 있는 코드 명시하는 영역
				
				//TODO 1: 에러를 추적하여 표시
				//printStackTrace(): 예외가 발생되기까지의 모든 과정과 예외코드 라인번호를 출력
				e.printStackTrace();
				
				
				//TODO 2: 에러 문구 간단 표시
				//getMessage(): 간략하게 예외정보 출력
//				System.out.println(e.toString());
				
				
				//TODO 3: 사용자가 정의한 에러문구 출력하기
//				System.out.println("없는 인덱스를 호출했습니다.");
			}	
		}
		System.out.println("프로그램 끝!!");
	}
}


/*
//TODO 1: 에러를 추적하여 표시
var[0]: 10
var[1]: 20
var[2]: 30
java.lang.ArrayIndexOutOfBoundsException: 3
프로그램 끝!!
	at com.basic.ExceptionEx02.main(ExceptionEx02.java:55)



//TODO 2: 에러 문구 간단 표시
var[0]: 10
var[1]: 20
var[2]: 30
java.lang.ArrayIndexOutOfBoundsException: 3
프로그램 끝!!



//TODO 3: 사용자가 정의한 에러문구 출력하기
var[0]: 10
var[1]: 20
var[2]: 30
없는 인덱스를 호출했습니다.
프로그램 끝!!
*/