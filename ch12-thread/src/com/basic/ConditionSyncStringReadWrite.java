/*
새로운 동기화 방식

lock( )와 unlock( )를 통한 동기화블록
await, signal, signalAll에 의한 실행순서의  동기화

*/
package com.basic;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.Scanner;

class StringComm
{
	String newString;
	boolean isNewString=false;
	
	private final ReentrantLock entLock=new ReentrantLock();
	private final Condition readCond=entLock.newCondition();
	private final Condition writeCond=entLock.newCondition();
	
	public void setNewString(String news)
	{
		//임계영역
		entLock.lock();
		try
		{
			if(isNewString==true)
				writeCond.await();	//readCond를 대상으로 블락상태
				
			newString=news;
			isNewString=true;
			readCond.signal();	//readCond를 대상으로 잠김 스레드를 깨움
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		finally
		{
			entLock.unlock();
		}
	}
	
	public String getNewString()
	{
		String retStr=null;
		
		entLock.lock();
		try
		{
			if(isNewString==false)
				readCond.await();
			
			retStr=newString;
			isNewString=false;		
			writeCond.signal();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}		
		finally
		{
			entLock.unlock();
		}
			
		return retStr;
	}
}

class StringReader extends Thread
{
	StringComm comm;
	
	public StringReader(StringComm comm)
	{
		this.comm=comm;
	}
	public void run()
	{
		Scanner keyboard=new Scanner(System.in);
		String readStr;
		
		for(int i=0; i<5; i++)
		{
			readStr=keyboard.nextLine();
			comm.setNewString(readStr);
		}
	}
}

class StringWriter extends Thread
{
	StringComm comm;
	
	public StringWriter(StringComm comm)
	{
		this.comm=comm;
	}
	public void run()
	{
		for(int i=0; i<5; i++)
			System.out.println("read string: "+comm.getNewString());
	}
}

class ConditionSyncStringReadWrite
{
	public static void main(String[] args)
	{
		StringComm strComm=new StringComm();
		StringReader sr=new StringReader(strComm);
		StringWriter sw=new StringWriter(strComm);
	
		System.out.println("입출력 쓰레드의 실행...");
		sr.start();
		sw.start();
	}
}