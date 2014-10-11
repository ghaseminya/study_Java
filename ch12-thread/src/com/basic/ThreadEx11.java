/*
synchronized 기반 동기화 메소드



synchronized 선언으로 인해서 
up(), down() 메소드는 스레드에 안전한 함수가 됩니다.

 */
package com.basic;


public class ThreadEx11 {

	public static void main(String[] args) {

		SharedData data = new SharedData();
		UpThread t = new UpThread(data, "UP Thread");
		DownThread t2 = new DownThread(data, "Down Thread");

		t.start();
		t2.start();
	}

}

class SharedData{
	int data;

	//동기화 메소드의 선언
	public synchronized void up (String name){
		System.out.print( name +": "+ data );
		data++;
		System.out.println( "를 "+ data +"로 증가시킴");
	}
	//동기화 메소드의 선언
	public synchronized void down (String name){
		System.out.print( name +": "+ data );
		data--;
		System.out.println( "를 "+ data +"로 감소시킴");
	}
}

class UpThread extends Thread{

	SharedData data;
	String name;
	public UpThread(SharedData data, String name ){
		this.data = data;
		this.name = name;
	}
	public void run(){

		for(int i=0; i < 4; i++ ){	
			try{
				Thread.sleep(500);
			}catch(Exception e){ e.printStackTrace();}

			data.up(name);
		}
	}
}

class DownThread extends Thread{

	SharedData data;
	String name;
	public DownThread(SharedData data, String name ){
		this.data = data;
		this.name = name;
	}
	public void run(){

		for(int i=0; i < 4; i++ ){
			try{
				Thread.sleep(500);
			}catch(Exception e){ e.printStackTrace();}
			data.down(name);
		}
	}

}