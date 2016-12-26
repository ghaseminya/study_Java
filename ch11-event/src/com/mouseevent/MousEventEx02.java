package com.mouseevent;
/* MouseMotionEvent 
//포인터 좌표 출력하기
//윈도우 안에서 마우스 버튼을 클릭할  때마다 이벤트를 발생시켜 클릭 시점의 마우스 포인터  X, Y좌표를 콘솔에 출력시키는 프로그램
	• 좌표의 범위는 윈도우의 크기와 동일합니다.
	• 좌표의 범위는 윈도우의 크기와 동일합니다.
	• MouseMotionListener를 사용하여 마우스가 움직일 때마다 콘솔에 현재 마우스 좌표를 출력하는 프로그램


MouseMotionEvent
	• MouseMotionEvent는 컴포넌트의 영역 내에서 마우스를 움직였을 때 발생하는 이벤트로 
	자체적으로 처리해 주는 클래스가 존재하지 않으며 MouseEvent 클래스를 그대로 사용합니다.
	• MouseMotionEvent는 마우스가 이동할 때마다 발생하기때문에 필요한 경우에만 이벤트를 처리하는 것이 좋습니다.  


MouseMotionListener
	• 마우스와 관련 있는 이벤트 중 MouseMotionEvent를 처리하는 이벤트 리스너


java.awt.Point
	• Point 클래스는 좌표 상의 어떤 위치를 나타내는데 사용
	• 각종 프레임이나 다른 컴퓨넌트의 위치를 설정할 때 사용
	• x와 y좌표값을 저장하기 위한 멤버변수를 가지고 있습니다.
	
*/

import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousEventEx02 extends Frame implements ActionListener, MouseMotionListener{
	//Label 객체 생섬, 초기설정
	Label move = new Label("***********", Label.CENTER);
	Button btnExits = new Button("종료");	
	
	public MousEventEx02() {
		//Frame 타이틀 지정
		setTitle("MouseEvent Test");
		
		//Label의 전경색 및 배경색 설정
		move.setForeground(Color.WHITE);
		move.setBackground(Color.RED);
		
		//컴포넌트가 이벤트 발생시 이동하게 처리하려면 레이아웃을 사용하지 말아야 합니다.
		//Layout을 비활성화 합니다.
		setLayout(null);
		
		//Button을 이벤트리스너 연결
		btnExits.addActionListener(this);
		
		//Frame을 이벤트리스너에 연결
		addMouseMotionListener(this);
		
		//Label, Button에 좌표, 넓이, 높이 설정
		move.setBounds(100, 50, 150, 20);
		btnExits.setBounds(250,  500,  50,  30);
		
		//Frame에 Label과 버튼 등록
		add(move);
		add(btnExits);
		
		//Frame 좌표, 넓이, 높이 설정
		setBounds(300,  300,  300,  300);
		
		//Frame 노출 여부 설정
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	
	@Override
	public void mouseMoved(MouseEvent e){
		//마우스 x, y좌표를 Point 객체에 저장후
		Point p = e.getPoint();
		
		//저장된 마우스 x,y좌표를 Label의 x,y좌표에 넣어줍니다.
		move.setLocation(p);		
	}
	
	public void mouseDragged(MouseEvent e){		
	}	

	public static void main(String[] args) {
		new MousEventEx02();

	}
}
