/* Thread - 동기화 전 (데이터 왜곡발생)
 * 
 * 
 */


package com.basic;

class ATM_1 implements Runnable{
	//공유자원
	private long depositMoney = 10000;
	
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
				if( depositMoney <= 0 ) break;
				
				withDraw(1000);
			}			
//		}		
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

public class ThreadEx06_1 {
	
	public static void main(String[] args){
		ATM_1 atm = new ATM_1();
		Thread mother = new Thread(atm, "mother") ;
		mother.start();
		Thread son = new Thread(atm, "son");
		son.start();
	}

}
