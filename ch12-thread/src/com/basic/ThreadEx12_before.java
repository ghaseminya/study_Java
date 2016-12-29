package com.basic;
/* Thread - 동기화 전 (데이터 왜곡발생)

File Info
package com.basic;
->ThreadEx06_before	동기화 전 (데이터 왜곡발생)
ThreadEx06_after	동기화 후 (synchronized 동기화 블럭)


스레드의 동기화 문제
스레드의 동기화 문제는 다중 스레드일 때 발생가능하며 
여러 스레드가 동시에 실핼 될 때 2개 이상의 스레드가 동일한 데이터에 접근하여 작업할 경우 문제가 발생할 수 있습니다.
그러므로, 하나의 스레드가 조작하고 있는 공유자원(변수, 데이터)를 
다른 스레드가 조작하지 못하도록 하기 위해서 동기화가 필요합니다.


Synchronization(동기화)
	• 임계영역에서 스레드들이 순서를 갖춰 자원을 사용하게 하는 것을 동기화하고 합니다.
	• 임계영역이란 멀티 스레드에 의해 공유자원이 서로 참조될 수 있는 코드의 범위를 말합니다.
	• 멀티 스레드 프로그램에서 임계영역을 제대로 처리하지 못 하는 경우 심각한 문제가 발생할 수 있습니다.
	• 이러한 문제 상황을 해결하는 방법이 동기화를 이용하는 것입니다. 
	그래서 하나의 자원을 한번에 하나의 스레드만 사용하도록 하는 기술입니다.
	• 동기화 메소드를 구현하기 위해서는 synchronized 키워드를 사용하여야 합니다.
	• 동기화 메소드를 스레드가 호출할 경우 이미 접근한 스레드가 작업을 완료할 때까지 기다려야 접근할 수 있습니다.
	
	• 동기화를 처리하기 위해 모든 객체에 락(lock)을 포함 시켰습니다.
	• 락(lock)이란 공유 객체에 여러 스레드가 동시에 접근하지 못하도록 하기 위한 것으로 
	모든 객체가 힙 영역에 생성될 때 자동으로 만들어 집니다.


임계영역(Critical Section)
	• 크리티컬 섹션은 한번에 한 스레드만 사용할 수 있는 코드 영역
	• 멀티 스레드에 의해 공유자원이 서로 참조될 수 있는 코드 범위


*/


class ATM_1 implements Runnable{
	//공유자원
	//long 정수형 8byte
	private long depositMoney = 10000;
	
	//임계영역
	public void withDraw(long howMuch){
		if(depositMoney > 0){
			depositMoney -= howMuch;
			System.out.println(Thread.currentThread().getName() + "\t" + depositMoney);			
		}else{
			System.out.println(Thread.currentThread().getName() + "잔액이 부족합니다.");			
		}
	}
		
	@Override
	public void run(){
		//this: 동기화할 객체
		//synchronized (this) {	
			for( int i=0; i<5; i++){
				try{
					Thread.sleep(1000);					
				}catch(InterruptedException e){
					e.printStackTrace();					
				}
				// 0이하면 반복문 빠져나옴
				if( depositMoney <= 0 ) 
					break;
				
				withDraw(1000);
			}
//		}
	}
} //ATM_1

public class ThreadEx12_before {
	
	public static void main(String[] args){
		ATM_1 atm = new ATM_1();
		Thread mother = new Thread(atm, "mother") ;
		mother.start();
		
		Thread son = new Thread(atm, "son");
		son.start();
	}
}


//출력결과
//mother	8000
//son	8000
//mother	7000
//son	7000
//son	6000
//mother	6000
//son	4000
//mother	4000
//mother	2000
//son	2000
