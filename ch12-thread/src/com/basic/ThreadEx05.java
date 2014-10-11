/* 
Thread 우선순위 설정
  
기본우선순위 확인
스레드 스케줄러에 의한 실행 순서 확인
우선순위 설정
우선순위 설정후 실행 순서확인
----------------------------------
실행순서 확인 후
우선순위 설정없이 결과확인(우선순위와 관련해서 별도의 지시를 하지 않으면, 동일한 우선순위의 쓰레드들이 생성됩니다.)
우선순위 설정 후 결과확인(확률적으로 먼저 수행됨, 반드시 먼저 수행되는 것은 아님) 
섬세하게 실행순서를 제어할 수 는 없으며 실행순서보다는 데이터 처리에 집중하는 것이 더 의미있음.
*/ 

package com.basic;

public class ThreadEx05 {
	public static void main(String[] args){
		ThreadTest01 th1 = new ThreadTest01();
		ThreadTest02 th2 = new ThreadTest02();

		//Thread 우선순위 7로 높이기
//		th1.setPriority(7);
		th2.setPriority(7);
		
		//Thread 우선순위 확인, getPriority()의 반홖값을 통해서 쓰레드의 우선순위를 확인 
		System.out.println("th1 (-): " + th1.getPriority());
		System.out.println("th2 (*): " + th2.getPriority());
		
		th1.start();
		th2.start();
	}
}

class ThreadTest01 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("-");
		}
	}	
}


class ThreadTest02 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("*");
		}		
	}
}
