/* Graphic - paint()로 다양한 도형그리기
 *  
 * x버튼 클릭시 종료처리 - 익명 클래스 이용
 * Frame 위치, 넓이, 높이 설정
 * Frame 노출여부 설정
 * paint로 그림을 그릴수 있는 공간을 만들고 Graphics를 통해 그림을 그립니다
 * 


Graphics 클래스
	• 그래픽을 관련 기능을 구현한 클래스로 Graphics 클래스와 이를 상속하는 Graphics2D 클래스가 있습니다.
	• Graphics2D 클래스는 JDK1.2 이후에 추가된 것으로 2D(평면) 그래픽 환경을 강력히 지원하는 API입니다.



paint()
	• 컴포넌트의 paint 메소드는 자신을 그릴 때 호출되는 메소드이다. 이 메소드는 컴포넌트가 다시 그려질 필요가 있을 때 자동으로 호출됩니다. 
	예를 들어 컴포넌트의 일부가 어떤 것에 의해 가려진 후, 다시 보여지면 가려졌던 부분을 다시 그릴 필요가 있습니다. 
	이때 자동 호출되어 집니다.  (paint 메소드는 필요에 의해 자동으로 호출됩니다.)
	• paint 메소드의 인수로 Graphics 객체(일반적으로 Graphic context라고 함)가 넘어옵니다.
	• 컴포넌트의 일부를 다시 그릴 필요가 있으면 Graphics 객체를 이용하여 컴포넌트를 그립니다.
	• 프로그래머는 paint() 메소드를 오버라이드해서 컴포넌트에 원하는 그림이나 도형을 그릴 수 있습니다.

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

import com.awt01.FrameEx03;

import java.awt.event.WindowAdapter;

public class GraphicEx01 extends Frame {

	Graphics g;

	public GraphicEx01() {
		// Frame 타이틀 설정
		super("Graphic Test");

		// Frame 위치, 넓이, 높이 설정
		setBounds(100, 100, 400, 300);

		// Frame 노출여부 설정
		setVisible(true);

		
		// x버튼 클릭시 종료처리 - 익명 클래스 이용
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	// paint()가 호출되면 인자로 전달된 Graphics 인스턴스를 통해 그림을 그립니다.
	@Override
	public void paint(Graphics g) {
		
		// 글자 (옵션)
		// 글자의 글꼴, 스타일, 크기 지정
		g.setFont(new Font("Serif", Font.PLAIN, 15));
		// drawString(표시할 글자, 위치x, 위치y)
		g.drawString("Graphics를 이용해서 그림을 그립니다", 10, 50);

		
		// 원
		// x, y, width, height 원 그리기
		g.drawOval(50, 60, 50, 50);
		// 색깔을 지정
		g.setColor(Color.BLUE);
		// 지정된 색깔로 원을 채웁니다.
		g.fillOval(100, 100, 50, 50);

		
		// 선
		g.setColor(Color.RED);
		// 시작x좌표, 시작y좌료, 종료x좌표, 종료y좌표
		g.drawLine(300, 100, 50, 50);

		
		// 사각형
		g.setColor(Color.CYAN);
		g.fillRect(160, 100, 50, 50);
		// x, y, width, height, 모서리를 둥글게 할 넓이와 높이
		// g.fillRoundRect(220, 100, 120, 80, 30, 30);
		g.fillRoundRect(220, 100, 120, 80, 100, 100); // 적당한 라운드의 사작형 그리기

		
		// 다각형
		g.setColor(Color.MAGENTA);
		// 꼭지점 x좌표 배열, 꼭지점y좌표 배열, 꼭지점 갯수
		g.fillPolygon(new int[] { 50, 100, 150, 200 }, new int[] { 250, 200, 200, 250 }, 4);

		
		// 원호
		g.setColor(Color.PINK);
		// x, y, width, height, 시작각도, 끝각도
		// g.fillArc(250, 200, 100, 100, 0, 120);
		g.fillArc(250, 200, 100, 100, 0, 240);

	}

	public static void main(String[] args) {
		new GraphicEx01();
	}
}
