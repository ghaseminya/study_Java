package com.graphic;
/*
자바 AWT에서는 컴포넌트를 그릴때 update(Graphics g) 메서드와 paint(Graphcis g) 메서드 오버라이딩을 하여 그리게 됩니다.
update() 메서드와 paint() 메서드는 시스템에서 자동으로 호출됩니다.
update() 메서드는 내부적으로 paint() 메서드를 호출을 하는데, 
언제 update() 메서드가 호출되고, 언제 paint() 메서드가 호출되는지 코드를 통해서 직접 확인할 수 있습니다..


출력결과
우측 상단의 최소화 버튼, 최대화 버튼 클릭, 창의 사이즈를 변경, 창을 위치를 변경, 다른 화면에 가려졌다가 다시 보여질 경우 paint()가 호출됩니다.
[화면 새로고치기] 버튼을 클릭하면 update(), paint()메소드가 순차적으로 실행됩니다.

*/
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicEx04 extends Frame {

	public GraphicEx04(){
		// Frame의 제목 설정
		super("AWT paint() Test");
		// Frame의 배치관리자를 BorderLayout으로 설정
		setLayout(new BorderLayout());

		
		// 패널객체를 생성하면서 배치관리자를 FlowLayout으로 설정
		Panel p = new Panel(new FlowLayout());
		p.add(new Label("update(), paint()"));
		
		
		// 버튼 생성
		Button btnReflesh = new Button("화면 새로고치기");
		// 패널에 추가
		p.add(btnReflesh);
		
		//버튼에 클릭 이벤트 처리하기
		//"화면 새로고치기" 버튼을 누르면 repaint()가 호출됩니다.
		//repaint() 메서드는 내부적으로 update() 메서드를 호출하게 되므로, paint() 메서드도 실행이 되게 된다.
		btnReflesh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				repaint();	
			}
		});
		add("North", p);   
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("paint()");
		super.paint(g);
		
		// 직사각형 그리기
		g.drawRect(50, 80, 200, 100); // x, y, width, height
		g.drawString("paint()", 120, 130);
	}

	//repaint() -> update() -> paint()
	@Override
	public void update(Graphics g) {
		System.out.println("update()");
		super.update(g); // 상위 update 메소드에서 paint() 메소드 호출됩니다.
		//TODO:
		//super.update() 메소드 링크를 클릭하여 상위 클래스인 Container클래스의 update()메소드에서 paint() 메소드가 호출되는 것 확인하기
	}

	public static void main(String[] args) {
		GraphicEx04 ge = new GraphicEx04();
		ge.setSize(300,200);
		ge.setVisible(true);
	}
}
