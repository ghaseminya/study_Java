package com.basic;
/* Thread - 동기화 전 (데이터 왜곡발생)

File Info
package com.basic;
*ThreadEx06_before	동기화 전 (데이터 왜곡발생)
ThreadEx06_after	동기화 후 (synchronized 동기화 블럭)

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
}

public class ThreadEx06_before {
	
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
