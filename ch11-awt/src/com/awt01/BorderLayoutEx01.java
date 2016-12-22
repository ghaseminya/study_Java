package com.awt01;
/* 버튼 생성 - BorderLayout사용
크기 조정시 버튼 크기가 확장됩니다.
확장되지 않게 하기 위해서는 Panel사용

//---------------------
BorderLayout
	• 컨테이너의 영역을 동, 서, 남, 북, 중앙으로 된 5개의 영역으로 분할하여 컴포넌트를 배치하는 관리자
	• 각 영영에는 하나의 컴포넌트만 배치할 수 있는 구조입니다.
	• 컨테이너의 크기가 변경되면 컴포넌트의 위치는 고정된 상태에서 크기가 변하게 됩니다.
	• 컴포넌트를 BorderLayout에 붙일 때 아무런 영역을 지정하지 않을 경우에는 기본적으로 CENTER영역에 붙이게 됩니다. 
	• CENTER영역은 다른영역에 아무것도 존재하지않으면 그 영역까지 포함해서 영역이 잡히게 됩니다. 
	• SOUTH, NORTH영역은 컴포넌트의 높이는 제대로 나타나지만 폭의 길이는 제대로 인정되지 않고 그 영역의 길이만큼 잡히게 됩니다. 
	• WEST, EAST영역은 컴포넌트의 폭의 길이는 제대로 나타나지만 높이는 제대로 인정되지 않고 항상 그 영역의 길이만큼 잡히게 됩니다. 


값					설명			영역
BorderLayout.NORTH	북(North)	높이
BorderLayout.WEST	서(West)		폭
BorderLayout.CENTER	중앙(Center)	기본값
BorderLayout.EAST	동(East)		폭
BorderLayout.SOUTH	남(South)	높이


BorderLayout  배치 기준
http://codedragon.tistory.com/4692
http://cfile10.uf.tistory.com/image/21201C41585B984101BE42

*/

import java.awt.Component;
import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.Panel;

public class BorderLayoutEx01 extends Frame{
	
	
	public BorderLayoutEx01(){
		//Frame 설정
		setTitle("BorderLayout Test");
		setSize(300, 300);
		//Frame에는 기본 레이아웃이 BorderLayout으로 지정되어 있어
		//BorderLayout사용시 레이아웃 설정 생략가능
		//setLayout(new BorderLayout());
	
		//Panel 생성
		Panel pc = new Panel();
		Panel pe = new Panel();		
				
		//Button 생성
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

/*
//출력결과
버튼은 해당 영역의 표현영역의 크기를 차지한 크기로 영역을 차지합니다. 
반면, Panel에 포함된 컨텐츠의 크기만큼 영역을 차지합니다. 그 컨텐츠인 버튼은 버튼 레이블 크기만큼 영역을 차지하고 있습니다. 
그래서 center, east는 작게 표시가 됩니다.
*/