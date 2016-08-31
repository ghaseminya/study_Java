package com.nonblock;
/*
File Info
package com.nonblock;
-> Abortable.java	종료를 나타내는 클래스
Client.java			클라이언트 프로그램
Server.java			서버 프로그램
*/
public class Abortable {
	
	public boolean done = false;
	
	public Abortable(){
		init();
	}

	public void init(){
		done = false;
	}
	
	public boolean isDone(){
		return done;
	}
}
