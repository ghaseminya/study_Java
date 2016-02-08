/*

//확인 후 주석처리
//쓰레드 접근순서의 동기화 필요성
//
//-------------------------------------
//본 예제가 논리적으로 실행되려면 NewsWriter 쓰레드가 먼저 실행되고, 
//이어서 NewReader 쓰레드가 실 행되어야 한다. 
//하지만 이를 보장하지 못하는 구조로 구현이 되어 있습니다.
//그래서 출력결과가 하나만 나오게 됩니다.


//File Info
//package com.basic;
//ThreadEx13.java	• 실행순서 동기화 구현 전
//					• 스레드 접근순서의 동기화 필요성
//					• 실행순서를 보장하지 못합니다
//ThreadEx14.java	• 실행순서 동기화 구현

//-------------------------------------

package com.basic;

class MemoPaper{
	String strMemo;
	
	public void setMemo(String memo){
		strMemo=memo;
	}
	
	public String getMemo(){
		return strMemo;
	}
}

class MemoWriter extends Thread{
	MemoPaper paper;
	
	public MemoWriter(MemoPaper paper){
		this.paper=paper;
	}
	public void run(){
		paper.setMemo("오늘도 자바 열공중...");
	}
}

class MemoReader extends Thread{
	MemoPaper paper;
	
	public MemoReader(MemoPaper paper)	{
		this.paper=paper;
	}
	public void run(){
		System.out.println("Memo 내용: " + paper.getMemo());
	}
}

public class ThreadEx13 {
	public static void main(String[] args){
		MemoPaper paper=new MemoPaper();
		MemoReader reader=new MemoReader(paper);
		MemoWriter writer=new MemoWriter(paper);

		reader.start();
		writer.start();

		try	{
			reader.join();
			writer.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}


//출력결과
//Memo 내용: 오늘도 자바 열공중...
//Memo 내용: 오늘도 자바 열공중...

*/