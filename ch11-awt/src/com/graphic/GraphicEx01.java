/* Graphic - paint()로 다양한 도형그리기
 *  
 * x버튼 클릭시 종료처리 - 익명 클래스 이용
 * Frame 위치, 넓이, 높이 설정
 * Frame 노출여부 설정
 * paint로 그림을 그릴수 있는 공간을 만들고 Graphics를 통해 그림을 그립니다
 * 
 * 
 * 
 * ------------------------------------------------------------------
 * 그림을 그릴수 있는 특별한 공간있어야 하는데 
 * paint( )메소드로 그 공간을 만들어 주고 Graphics객체를 통해 그림을 그립니다.
 * 
 * 
 * 
 */

package com.graphic;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import com.display.FrameEx01;

public class GraphicEx01 extends Frame {
	
	Graphics g;	
	
	public GraphicEx01(){
		//Frame 타이틀 설정
		super("Graphic Test");
		
		//x버튼 클릭시 종료처리 - 익명 클래스 이용
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});	
		
		//Frame 위치, 넓이, 높이 설정
		setBounds(100, 100, 400, 300);
		
		//Frame 노출여부 설정
		setVisible(true);		
	}
	//paint로 그림을 그릴수 있는 공간을 만들고 Graphics를 통해 그림을 그립니다.
	@Override
	public void paint(Graphics g){
		//글자
		//글자의 글꼴, 스타일, 크기 지정
		g.setFont(new Font("Serif", Font.PLAIN, 15));
		//표시할 글자, 위치(x, y)
		g.drawString("Graphics를 이용해서 그림을 그립니다", 10, 50);
		
		//원
		//x, y, width, height 원 그리기
		g.drawOval(50, 60, 50, 50);
		//색깔을 지정
		g.setColor(Color.BLUE);
		//지정된 색깔로 원을 채웁니다.
		g.fillOval(100, 100, 50, 50);
		
		//선
		g.setColor(Color.RED);
		//시작x좌표, 시작y좌료, 종료x좌표, 종료y좌표
		g.drawLine(300, 100, 50, 50);
		
		//사각형
		g.setColor(Color.CYAN);
		g.fillRect(160, 100, 50, 50);
		//x, y, width, height, 모서리를 둥글게 할 넓이와 높이
		//g.fillRoundRect(220, 100, 120, 80, 30, 30);
		g.fillRoundRect(220, 100, 120, 80, 100, 100);	//적당한 라운드의 사작형 그리기
		
		//다각형
		g.setColor(Color.MAGENTA);
		//꼭지점 x좌표 배열, 꼭지점y좌표 배열, 꼭지점 갯수
		g.fillPolygon(new int[]{50,100,150,200}, new int[]{250,200,200,250}, 4);
						
		//원호
		g.setColor(Color.PINK);
		//x, y, width, height, 시작각도, 끝각도
		//g.fillArc(250, 200, 100, 100, 0, 120);
		g.fillArc(250, 200, 100, 100, 0, 240);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicEx01();
	}

}
