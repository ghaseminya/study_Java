/* MouseEvent
 * 
 * 컴포넌트가 움직이게 할려면 layout을 비활성화 시켜야 합니다.
 */

package com.event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousEventEx extends Frame implements ActionListener, MouseMotionListener{
	//Label 객체 생섬, 초기설정
	Label move = new Label("***********", Label.CENTER);
	Button btnExits = new Button("종료");	
	
	public MousEventEx() {
		//Frame 타이틀 지정
		setTitle("MouseEvnet Test");
		
		//Label의 전경색 및 배경색 설정
		move.setForeground(Color.WHITE);
		move.setBackground(Color.RED);
		
		//컴포넌트가 이벤트 발생이 이동하게 처리하려면 레이아웃을 사용하지 말아야 합니다.
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
		//마우스 x, y좌표를 Point 저장후
		Point p = e.getPoint();
		
		//저장된 마우스 x,y좌표를 Label의 x,y좌표에 넣어줍니다.
		move.setLocation(p);		
	}
	
	public void mouseDragged(MouseEvent e){		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MousEventEx();

	}

}
