
//동기화 메소드에 접근하기 위해 만든 스레드 클래스
//ThreadEx01클래스에서 사용하기 위한 클래스. 따라서, main() 메소드가 없습니다.

package com.thread.sync;

//Thread 클래스를 상속
public class ThreadEx02 extends Thread{

	//ThreadEx01 클래스 타입을 선언
	ThreadEx01 sys;
	//스레드 이름으로 사용될 멤버변수
	String name;
	
	//인자 2개로 구성된 생성자
	//첫 번째 인자는 ThreadEx01 클래스의 인스턴스 이며, 두 번째 인자는 “예금” 이 넘어오게 됩니다.
	public ThreadEx02(ThreadEx01 system, String threadname){
		this.sys = system;
		name = threadname;
		
	}
	
	//1초 간격으로 스레드가 동작
	@Override
	public void run() {
		super.run();
		
		while(true){
			try{
				sleep(1000);
			}catch(Exception e){
			}
			sys.plus(name);
		}
	}
	
	

}
