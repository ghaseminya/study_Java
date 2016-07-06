package com.basic;
/*
//Runnable 인터페이스를 구현해서 무작위로 Frame 화면에 원 그리기

AWT(Abstract Window Toolkit)
GUI 프로그래밍을 제작하기 위해 자바에서 제공하는 라이브러리를 모아놓은 것
*/


import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

//Frame 클래스를 상속받았으므로 더 이상 다른 클래스를 상속받을 수 없습니다. 
//그래서, 스레드 기능을 가진 Runnable 인터페이스를 구현하여 작성할 수 있습니다.
public class ThreadEx16 extends Frame implements Runnable{
	
	//좌표 저장 변수
	int x, y;
	
	public ThreadEx16(){
		//프레임의 제목 설정
		setTitle("Thread Test");
		
	}
	
	//update() 메소드를 오버라이딩하여 그리기 작업을 수행
	//update() 메서드와 paint() 메서드는 시스템에서 자동으로 호출되는데
	//update() 메서드는 내부적으로 paint() 메서드를 다시 호출합니다.
	//화면이 갱신될 때 (repaint()를 통해) update()메소드가 호출됩니다.
	//최소화, 최대화, 창 사이즈 조절시 paint() 메서드가 호출됩니다.
	@Override
	public void update(Graphics g){
		//배경을 지우지 않고 x, y 좌표를 원의 중심으로 하여 직경 30픽셀의 원을 그리기
		g.drawOval(x, y, 30, 30);
		
	}
	
	//run() 메소드를 오버라이딩
	@Override
	public void run(){
		while(true){
			//난수 발생
			//Math.random() 메소드는 static 메소드로서 0 과 1 사이의 무작위 실수를 double 형으로 반환합니다.
					//0.0은 포함하지만 1.0은 포함하지 않습니다.  0.0<= math.random() <1.0
			//x, y 는 int 형이므로 명시적 형변환이 필요합니다.
			x = (int)(Math.random()*300); //1~300사이의 랜덤한 숫자 획득
			y = (int)(Math.random()*300);
			
			//0.1초마다 스레드를 중단시키면서 다시 그리기
			//repaint() 메서드는 내부적으로 update() 메서드를 호출합니다.
			repaint();
			try{
				//sleep() 메소드의 인자는 1000을 1초로 계산한다. (100은 0.1초)
				Thread.sleep(100);
			}catch(Exception e){
				
			}
		}
	}

	public static void main(String[] args) {
		//현재 클래스의 인스턴스를 생성
		ThreadEx16 te = new ThreadEx16();
		//프레임의 크기 지정
		te.setSize(300, 300);
		//현재 프레임(윈도우)를 보여주기
		te.setVisible(true);
		
		//Thread 클래스 생성자의 매개변수로 Runnable 인터페이스를 구현한 현재 클래스를 넘기고 있습니다. 
		Thread th = new Thread(te);
		//스레드 시작
		th.start();
	}
}
