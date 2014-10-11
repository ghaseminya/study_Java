/*
동기화 블록


--------------------------------------------
동기화 블록을 이 용하면 동기화의 기준을 다양화할 수 있다
두개의 동기화 인스턴스 중 하나는 this로 지정하는 것이 보다 일반적인 형태입니다. 



*/
package com.basic;

public class ThreadEx12 {
	public static void main(String[] args) {
		IHaveTwoNum numInst=new IHaveTwoNum();
		
		AccessThread at1=new AccessThread(numInst);
		AccessThread at2=new AccessThread(numInst);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		numInst.showAllNums();
	}
}

class IHaveTwoNum {
	int num1=0;
	int num2=0;
	
	public void addOneNum1() {
		//key1 인스턴스를 대상으로 동기화 진행
		synchronized(key1) {
			num1+=1; 
		}
	}
	public void addTwoNum1() { 
		synchronized(key1) {
			num1+=2; 
		}
	}	
	
	//key2 인스턴스를 대상으로 동기화 진행
	public void addOneNum2() { 
		synchronized(key2) {
			num2+=1; 
		}
	}
	public void addTwoNum2() { 
		synchronized(key2) {
			num2+=2; 
		}
	}
	
	public void showAllNums() {
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}
	
	Object key1=new Object();
	Object key2=new Object();
}

class AccessThread extends Thread {
	IHaveTwoNum twoNumInst;
	
	public AccessThread(IHaveTwoNum inst) {
		twoNumInst=inst;
	}
	
	public void run() {
		twoNumInst.addOneNum1();
		twoNumInst.addTwoNum1();
		
		twoNumInst.addOneNum2();
		twoNumInst.addTwoNum2();
	}
}