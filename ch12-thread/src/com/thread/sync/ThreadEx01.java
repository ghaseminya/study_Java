package com.thread.sync;

import com.basic.ThreadEx15;

public class ThreadEx01 {

	int num;
	public synchronized void plus(String tname){
		System.out.print(tname + " : " + num);
		num++;
		System.out.println(" >> 잔액 " + num + "증가");
	}
	
	public synchronized void minus(String tname){
		System.out.print(tname + " : " + num);
		num--;
		System.out.println(" >> 잔액" + num + "감소");
	}
	
	
	public static void main(String[] args) {
		ThreadEx01 system = new ThreadEx01();
		ThreadEx02 te1 = new ThreadEx02(system, "예금");
		ThreadEx03 te2 = new ThreadEx03(system, "출금");
		
		te1.start();
		te2.start();
		
	}
}
