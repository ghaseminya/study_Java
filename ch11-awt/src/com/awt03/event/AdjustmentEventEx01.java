package com.awt03.event;
/*
//스크롤 이벤트


AdjustmentEvent
스크롤바를 좌우로 또는 상하로 움직여 스크롤바의 상태가 변화될때 발생하는 이벤트


AdjustmentListener
AdjustmentEvent를 처리하는 이벤트 리스너

*/

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AdjustmentEventEx01 extends Frame{
	
	Scrollbar sb;
	TextField tf;
	
	public AdjustmentEventEx01(){
		//레이아웃 관리자를 BorderLayout 으로 설정
		setLayout(new BorderLayout());
		setTitle("AdjustmentEvent Test");
		
		//스크롤바 생성
		//Scrollbar(스크롤바표현방식,현재값,막대가로길이,최소값,최대값)
		sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
		tf = new TextField();
		
		//프레임의 위쪽에 List 를 부착
		add("North", sb);
		//프레임의 중앙에 TextArea 를 부착
		add("Center", tf);
		sb.addAdjustmentListener(new ScrollbarHandler());
	}
	
	//핸들러 클래스 생성
	public class ScrollbarHandler implements AdjustmentListener{

		//AdjustmentListener 인터페이스에서 반드시 구현해 주어야 하는 메소드
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			//스크롤바에 의해 변화된 값을 텍스트상자에 출력하기
			tf.setText(sb.getValue() + "");
		}
	}
	
	
	public static void main(String[] args) {
		AdjustmentEventEx01 ae = new AdjustmentEventEx01();
		ae.setSize(300, 200);
		ae.setVisible(true);
	}
}
