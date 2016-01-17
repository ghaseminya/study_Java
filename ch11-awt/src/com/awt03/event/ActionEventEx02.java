/* Event 처리
 * 
 * Panel 객체 생성
 * Button객체 생성
 * TextArea 객체 생성
 * Button을  Panel에 등록
 * Frame에 Panel과 TextAreas등록
 * 
 * implements ActionListener	(ActionListener갇고 있는 이벤트 처리가능  ActionEventEx가 리스너의 기능을 갇게된다. )
 * @Override 	public void actionPerformed(ActionEvent ae){}	//ActinListern가 actionPerfored()호출ㄴ
 * 이벤트 소스와 이벤트 리스너 연결
 * 
 * ---------------------------------------
 * 이벤트 처리 순서 (Java와 Android 동일)
 * TODO 1.이벤트 소스 선정
 * TODO 2.이벤트 리스너를 구현
 * TODO 3.이벤트 소스와 이벤트 리스너 연결
 * TODO 4.이벤트 핸들러 내용 구현
 * 
 */

package com.awt03.event;

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO 2.이벤트 리스너를 구현
//extends Frame: Frame상속
//implements ActionListener: ActionEventEx가 ActionListner역할을 함
public class ActionEventEx02 extends Frame implements ActionListener{
	
	Panel p;
	Button input, exit;
	TextArea ta; //다중 텍스트 상자 생성
	
	
	public ActionEventEx02() {		
		super("ActionEvent 테스트");
		
		//Panel객체 생성
		p = new Panel();
		
		//TODO 1.이벤트 소스 선정
		//Button객체 생성 (이벤트 소스)
		input = new Button("입력");
		exit = new Button("종료");
		
		//TODO 3.이벤트 소스와 이벤트 리스너 연결
		//이벤트 소스(Button)와 이벤트 리스너(ActionEventEx) 연결
		input.addActionListener(this);
		exit.addActionListener(this);
		
		
		//TextArea 객체 생성
		ta = new TextArea();
		
		//Button을  Panel에 등록
		p.add(input);
		p.add(exit);
		
		
		//Frame에 등록
		//위쪽에 버튼이 포함되어 있는 Panel를 배치하고 중앙에 다중 텍스트 상자를 배치합니다.
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		
		//x, y, width, height 설정
		setBounds(300, 300, 300, 300);		
		
		//Frame 노출여부 설정
		setVisible(true);		
	}
	
	//TODO 4.이벤트 핸들러 내용 구현
	//이벤트 핸들러(이벤트가 발생하면 호출됨)
	@Override
	public void actionPerformed(ActionEvent ae){ //ActionEvent: Button이 눌려졌을 때 발생되는 이벤트
		//이벤트가 발생한 이벤트 소스의 명령 문자열을 구함
		String name = ae.getActionCommand();
		if(name.equals("입력")){
			ta.append("버튼을 클릭하였습니다.\n");
			
		}else{//종료			
			//프로그램 종료
			System.exit(0);
		}		
	}	
	

	public static void main(String[] args) {
		// Frame을 상속받은 클래스의 객체 생성
		new ActionEventEx02();
	}
}
