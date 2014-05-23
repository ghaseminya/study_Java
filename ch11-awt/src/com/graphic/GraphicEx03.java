/* 그림판 그리기 - 문자를 통해 간단하게 그림판 구현
 * 
 * import
 * 그림을 그리기 위해 사용할 문자셋팅
 * implements MouseMotionListener
 * Frame에 마우스 이벤트리스너 연결
 * @Override public void mouseMoved(MouseEvent e){ } 구현
 * @Override public void mouseDragged(MouseEvent e){ } 구현 및 재정의
 * repaint();	// 내부적으로 paint(Graphics g)를 자동적으로 호출 위해 *  
 * update()를 재정의
 * ----------------------------------------------------------------------
 * paint(Graphics g) 매번 갱신, 현재데이터만 표시합니다.
 * 그림판은 계속 누적되어져야 함, 누적시키기 위해 Frame의 update()를 재정의해야 합니다.
 * 
 * mouseMoved() {} 이벤트로 문자가 마우스를 따라다니는 것을 확인
 * mouseMoved() {} -> mouseDragged {} 메소드 내용 옮겨 그림이 그려지는 것확인
 * 
 */
package com.graphic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GraphicEx03 extends Frame implements MouseMotionListener{
	int x=0;
	int y=0;	
	
	public GraphicEx03(){
		super("그래픽 데스트3");
		
		//x버튼 이벤트 처리
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});			
				
		setBounds(100, 100, 500, 500);
		setVisible(true);
		
		//Frame에 마우스 이벤트리스너 연결
		addMouseMotionListener(this);
	}
	
	public void paint(Graphics g){
		//그림을 그리기 위해 사용할 문자셋팅
		g.setFont(new Font("Serif", Font.PLAIN, 15));
		g.setColor(Color.GREEN);
		g.drawString("*", x, y);		
	}
	
	@Override
	public void mouseMoved(MouseEvent e){		
	}	
	
	@Override
	public void mouseDragged(MouseEvent e){
		//움직일때 마다 마우스 커서의 좌표
				x = e.getX();
				y = e.getY();
				
				//paint()메소드를 통해 직접 graphics 객체를 넣어줄수 없다.
				//그대신, repaint()를 사용하게 되면 내부적으로 paint(Graphics g)를 자동적으로 호출한다.
				// repaint() -> update(Graphics g) -> paint(Graphics g)
				repaint();
	}
	
	//그림판은 계속 이전 그린 흔적이 누적되어져야 함, 
	//누적시키기 위해 Frame의 update()를 재정의
	@Override
	public void update(Graphics g){
		paint(g);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicEx03();
	}
}
