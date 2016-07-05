package com.basic;
/*
synchronized 기반 동기화 메소드

synchronized 선언으로 인해서 
up(), down() 메소드는 스레드에 안전한 함수가 됩니다.

Step by Step
TODO 1: up(), down() 메소드 
TODO 2: up(), down() 메소드에 synchronized 선언하기 

//----------------------------------------

동기화 방법
*	• 메서드의 동기화 방법(synchronized기반 동기화 메소드)
	• 특정 블록의 동기화 방법(synchronized기반 동기화 블록)

//----------------------------------------

메서드의 동기화 방법(synchronized기반 동기화 메소드)
	• synchronized 선언으로 인해서 synchronizedMethod메소드는 쓰레드에 안전한 함수가 됩니다
	• 그러나 엄청난 성능의 감소를 동반합니다. 그렇기 때문에 이런 synchronizedMethod 메소드의 빈번한 호출은 성능에 문제가 될 수 있습니다.

접근지정자 synchronized 리턴타입 메소드명( ) {  
}

public synchronized void synchronizedMethod(){
        //임계영역 코딩
}

*/


class SharedData{
	int data;

	//동기화 메소드의 선언 (동기화 메소드의 선언 전/후 결과 확인)
	public void up (String name){
//	public synchronized void up (String name){
		System.out.print( name +": "+ data );
		data++;
		System.out.println( "를 "+ data +"로 증가시킴");
	}
	
	//동기화 메소드의 선언 (동기화 메소드의 선언 전/후 결과 확인)
	public void down (String name){
//	public synchronized void down (String name){
		System.out.print( name +": "+ data );
		data--;
		System.out.println( "를 "+ data +"로 감소시킴");
	}
}

class UpThread extends Thread{

	SharedData data;
	String name;
	
	//생성자
	public UpThread(SharedData data, String name ){
		this.data = data;
		this.name = name;
	}
	
	@Override
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
	
	//생성자
	public DownThread(SharedData data, String name ){
		this.data = data;
		this.name = name;
	}
	
	@Override
	public void run(){

		for(int i=0; i < 4; i++ ){
			try{
				Thread.sleep(500);
			}catch(Exception e){ e.printStackTrace();}
			data.down(name);
		}
	}
}

public class ThreadEx11 {

	public static void main(String[] args) {

		SharedData data = new SharedData();
		UpThread t = new UpThread(data, "UP Thread");
		DownThread t2 = new DownThread(data, "Down Thread");

		t.start();
		t2.start();
	}
}


//public void up (String name){ 로 임계영역에 접근한 경우
//Down Thread: 0를 -1로 감소시킴
//UP Thread: 0를 0로 증가시킴
//Down Thread: 0를 -1로 감소시킴
//UP Thread: 0를 0로 증가시킴
//Down Thread: 0를 -1로 감소시킴
//UP Thread: 0를 0로 증가시킴
//Down Thread: 0를 -1로 감소시킴
//UP Thread: 0를 0로 증가시킴


//public synchronized void down (String name){ 로 안전하게 임계영역에 접근한 경우
//UP Thread: 0를 1로 증가시킴
//Down Thread: 1를 0로 감소시킴
//UP Thread: 0를 1로 증가시킴
//Down Thread: 1를 0로 감소시킴
//UP Thread: 0를 1로 증가시킴
//Down Thread: 1를 0로 감소시킴
//UP Thread: 0를 1로 증가시킴
//Down Thread: 1를 0로 감소시킴