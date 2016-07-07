package com.basic;
/*
Thread - 동기화 후 (synchronized 동기화 블럭 이용)

//----------------------------------------
동기화 방법
	• 메서드의 동기화 방법(synchronized기반 동기화 메소드)
*	• 특정 블록의 동기화 방법(synchronized기반 동기화 블록)


File Info
package com.basic;
ThreadEx06_before	동기화 전 (데이터 왜곡발생)
*ThreadEx06_after	동기화 후 (synchronized 동기화 블럭)

//----------------------------------------
공유자원을 변경하는 임계영역을 synchronized로 둘러싸여 있어서 
들어온 thread를 먼저 수행완료한 다음 다음 Thread로 제어를 넘깁니다.


Thread를 사용할 경우 주의
	• 가급적 공유자원 만들지 말 것.
	• 공유자원을 만들 경우 반드시 동기화 할 것

*/


class ATM implements Runnable{
	//공유자원
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
		
		//synchronized(this)에서 this는 동기화의 대상을 알리는 용도 로 사용이 되었다.
		//즉, 메소드가 호출된 인스턴스 자신을 대상으로 동기화를 진행하는 문장.
		synchronized (this) {
			for( int i=0; i<5; i++){
				try{
					Thread.sleep(1000);					
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				// 0이하면 반복문 빠져나옴
				if( depositMoney <= 0 ) break;
				
				withDraw(1000);
			}
		} //synchronized
	} //run
} //ATM

public class ThreadEx06_after {
	
	public static void main(String[] args){
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "mother") ;
		mother.start();
		
		Thread son = new Thread(atm, "son");
		son.start();
	}
} //ThreadEx06_after


//출력결과
//mother	9000
//mother	8000
//mother	7000
//mother	6000
//mother	5000
//son	4000
//son	3000
//son	2000
//son	1000
//son	0