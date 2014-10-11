/*
//실행순서 동기화
//
//
//--------------------------------------
//wait과 notifyAll 메소드에 의한 동기화가 진행될때, 
//ThreadEx13에서 달라지는 부분은 쓰레드 클래스 가 아닌 쓰레드에 의해 접근이 이뤄지는 NewsPaper 클래스라는 사실에 주목하기 바란다


package com.basic;

public class ThreadEx14 {
	public static void main(String[] args) {
		MemoPaper paper=new MemoPaper();
		MemoReader reader1=new MemoReader(paper);
		MemoReader reader2=new MemoReader(paper);
		MemoWriter writer=new MemoWriter(paper);

		try {
			reader1.start();
			reader2.start();
			
			Thread.sleep(1000);			
			writer.start();
	
			reader1.join();
			reader2.join();
			writer.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class MemoPaper
{
	String strMemo;
	boolean isTodayNews=false;
	
	public void setMemo(String memo) {
		strMemo=memo;
		isTodayNews=true;
		
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
}*/