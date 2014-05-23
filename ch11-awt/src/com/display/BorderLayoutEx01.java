/* 버튼 생성 - BorderLayout사용
 * 
 * 
 * 
 *  크기 조정시 버튼 크기가 확장됩니다.
 *  확장되지 않게 하기 위해서는 Panel사용
 */

package com.display;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.Panel;

public class BorderLayoutEx01 extends Frame{
	
	
	public BorderLayoutEx01(){
		//Frame 설정
		setTitle("BorderLay Test");
		setSize(300, 300);
		//Frame에는 기본 레이아웃이 BorderLayout으로 지정되어 있어
		//BorderLayout사용시 레이아웃 설정 생략가능
		//setLayout(new BorderLayout());
	
		//Panel 생성
		Panel pc = new Panel();
		Panel pe = new Panel();		
				
		//Button 추가
		Button  btnEast= new Button("east");
		Button  btnWest= new Button("west");
		Button  btnSouth= new Button("south");
		Button  btnNorth= new Button("north");
		Button  btnCenter= new Button("center");
		
		//center를 Panel에 등록
		pc.add(btnCenter);
		//p.add(east);
		pe.add(btnEast);
		
		//Frame에 버튼 추가
		add(pe, BorderLayout.EAST);
		add(btnWest, BorderLayout.WEST);
		add(btnSouth, BorderLayout.SOUTH);
		add(btnNorth, BorderLayout.NORTH);
		add(pc, BorderLayout.CENTER);			
		
		//Frame 노출여부 설정
		setVisible(true);
	}

	public static void main(String[] args) {				
		new BorderLayoutEx01();
	}
}
