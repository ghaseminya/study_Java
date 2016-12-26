package com.itemevent;
/*
//위쪽의 리스트 항목을 더블 클릭하면 아래쪽의 TextArea에 선택된 항목의 문자열이 추가되는 프로그램

*/


import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//윈도우 프로그램이 만들기 위해 Frame 클래스를 상속받습니다. 
public class ListEventEx02 extends Frame{
	
	//List 타입의 변수 선언
	List sports;
	//TextArea 타입의 변수 선언
	TextArea ta;
	
	public ListEventEx02(){
		//레이아웃 관리자를 BorderLayout 으로 설정
		setLayout(new BorderLayout());
		setTitle("Most popular sports in the World");
		
		//List와 TextArea 를 생성
		sports = new List();
		ta = new TextArea();
		
		//리스트에 항목을 추가
		sports.add("Soccer");
		sports.add("Cricket");
		sports.add("Field Hockey");
		sports.add("Tennis");
		sports.add("Volleyball");
		sports.add("Table Tennis");
		sports.add("Baseball");
		sports.add("Golf");
		sports.add("Basketball");
		sports.add("American Football");
		
		//프레임의 위쪽에 List 를 부착
		add("North", sports);
		//프레임의 중앙에 TextArea 를 부착
		add("Center", ta);
		
		//sports 변수(리스트)를 이벤트 소스로 하여 핸들러 클래스에 연결합니다. 
		//처리하기 위한 이벤트는 ActionEvent 이며, 리스트의 특정 항목을 더블클릭할 때 발생합니다.
		sports.addActionListener(new SportsHandler());
		
	}
	
	//sports 변수의 ActionEvent 를 처리하기 위한 핸들러 클래스
	public class SportsHandler implements ActionListener {
		//ActionListener 인터페이스를 구현했을 경우 actionPerformed() 메소드를 반드시 구현해야 합니다.
		//인터페이스는 메소드를 정의만 할 뿐 실제 내용을 가지고 있지 않습니다.
		@Override
		public void actionPerformed(ActionEvent e) { //이벤트가 발생되었을 경우 실제 수행하는 부분
			//다중텍스트상자에 리스트에서 더블클릭된 항목을 가져와 추가하기
			ta.append(sports.getSelectedItem() + "\n");
		}
	}
	
	public static void main(String[] args) {
		ListEventEx02 le = new ListEventEx02();
		le.setSize(300, 200);
		le.setVisible(true);
	}
}
