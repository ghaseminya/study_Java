/* Thread - 동기화 후 (synchronized 동기화 블럭 이용)
 * 
 * -----------------------------------------------------------
 * 공유자원을 변경하는 임계영역을
 * synchronized로 둘러싸여 있어서 들어온 thread를 먼저 수행완료한 다음 다음 Thread로 제어를 넘긴다.
 * 
 * Thread를 사용할 경우 주의
 * - 가급적 공유자원 만들지 말것.
 * - 공유자원을 만들경우 반드시 동기화 할것
 * 
 */

package com.basic;


class ATM implements Runnable{
	//공유자원
	private long depositMoney = 10000;
	
	@Override
	public void run(){
		//this: 동기화할 객체
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
		}		
	}
	
	//임계영역
	public void withDraw(long howMuch){
		if(depositMoney > 0){
			depositMoney -= howMuch;
			System.out.println(Thread.currentThread().getName() + "\t" + depositMoney);			
		}else{
			System.out.println(Thread.currentThread().getName() + "잔액이 부족합니다.");			
		}
	}	
}

public class ThreadEx06 {
	
	public static void main(String[] args){
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "mother") ;
		mother.start();
		Thread son = new Thread(atm, "son");
		son.start();
	}

}
