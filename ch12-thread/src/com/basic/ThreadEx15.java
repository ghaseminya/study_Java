/*
//확인 후 주석처리
//실행순서 동기화
//
//File Info
//package com.basic;
//ThreadEx14.java	• 실행순서 동기화 구현 전
//					• 스레드 접근순서의 동기화 필요성
//					• 실행순서를 보장하지 못합니다

//ThreadEx15.java	• 실행순서 동기화 구현

//--------------------------------------
//wait과 notifyAll 메소드에 의한 동기화가 진행될때, 
//ThreadEx13에서 달라지는 부분은 쓰레드 클래스 가 아닌 쓰레드에 의해 접근이 이뤄지는 MemoPaper 클래스라는 사실에 주목하기 바란다

//★ Object의 wait(),notify(), notifyAll()의 흐름도

package com.basic;


class MemoPaper{
	String strMemo;
	boolean isTodayNews=false;
	
	public void setMemo(String memo) {
		strMemo=memo;
		isTodayNews=true;
		
		//TODO : Synchronized 블록이 아닌 경우에 사용할 경우 java.lang.IllegalMonitorStateException이 발생
		//Runtime ERROR - Exception in thread "Thread-2" java.lang.IllegalMonitorStateException
//		notifyAll();
		
		synchronized(this) {
			notifyAll();	//Thread를 깨움
		}
	}
	
	public String getMemo() {
		if(isTodayNews==false) {
			try {
				synchronized(this) {
					wait();	//Thread를 블로킹 상태로
				}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return strMemo;
	}
}

class MemoWriter extends Thread {
	MemoPaper paper;
	
	public MemoWriter(MemoPaper paper) {
		this.paper=paper;
	}
	
	public void run() {
		paper.setMemo("오늘도 자바 열공중...");
	}
}

class MemoReader extends Thread {
	MemoPaper paper;
	
	public MemoReader(MemoPaper paper) {
		this.paper=paper;
	}
	
	public void run() {
		System.out.println("Memo 내용: "+paper.getMemo());
	}
}

public class ThreadEx15 {
	public static void main(String[] args) {
		MemoPaper paper=new MemoPaper();
		MemoReader reader1=new MemoReader(paper);
		MemoReader reader2=new MemoReader(paper);
		MemoWriter writer=new MemoWriter(paper);

		try {
			reader1.start();
//			reader2.start();
			
			Thread.sleep(1000);			
			writer.start();
	
			reader1.join();
//			reader2.join();
			writer.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}


//출력결과
//Memo 내용: 오늘도 자바 열공중...
//Memo 내용: 오늘도 자바 열공중...

*/