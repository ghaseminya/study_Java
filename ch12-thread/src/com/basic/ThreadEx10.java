/*
쓰레드간 메모리 영역의 공유

두개의 스레드가 addNumber()을 호출하고 있습니다.

--------------------------------------------------
둘 이상의 쓰레드가 메모리 공간에 동시 접근하는 문제를 가지고 있다. 따라서 정상
적이지 못한 실행의 결과가 나올 수도 있습니다.


*/
package com.basic;

class Sum {
	int num;
	public Sum() { num=0; }
	public void addNumber(int n) { num+=n; }
	public int getNumber() { return num; }
}

class AdderThread extends Thread {	
	Sum sumInst;
	int start, end;
	
	public AdderThread(Sum sum, int s, int e) {
		sumInst=sum;
		start=s;
		end=e;
	}
	public void run() {
		for(int i=start; i<=end; i++)
			sumInst.addNumber(i);
	}
}

class ThreadEx10 {
	public static void main(String[] args) {
		//s의 인스턴스는 heap영역에 할당되고 동시 접근 가능
		Sum s=new Sum();
		AdderThread at1=new AdderThread(s, 1, 50);
		AdderThread at2=new AdderThread(s, 51, 100);
		at1.start();
		at2.start();
		
		try {
			at1.join();	//main thread는 at1 thread가 종료할 때까지 blocked상태가 됩니다. 
			at2.join();	//main thread는 at2 thread가 종료할 때까지 blocked상태가 됩니다. 
			//thread의 모든 작업이 완료되도록 하기 위해 join()호출
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100까지의 합: "+s.getNumber());
	}
}