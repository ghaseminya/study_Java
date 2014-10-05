/* Adapter Class - 외부 클래스를 이용하여 이벤트 처리
 * 
 * 
 * 필요한 자원 import
 * 
 * Frame 제목 설정 
 * Panel 생성
 * Button 생성
 * Panel에 컨트롤 추가
 * Frame에 각 Panel을 BorderLayour영역에 등록
 * Frame의 위치, 넓이, 높이 설정
 * Frame 노출여부 설정
 * 
 * 
 * implements ActionListener
 * 이벤트 리스너 연결 - Button의 이벤트
 * @Override 	public void actionPerformed(ActionEvent e){}
 * 
 * 별도의 클래스 생성 - KeyAdapter 클래스를 상속하는
 * 이벤트 리스너 연결 - KeyEvent
 * @Override 	public void keyTyped(KeyEvent e){}
 * 
 * 별도의 클래스 생성 - WindowAdapet클래스를상속하는
 * 이벤트 리스너 연결 - WindowEvent
 * @Override	public void windowClosing(WindowEvent e){}
 * 
 * 
 * ----------------------------------------------------------------------------------------
 * Frame이 상속되어 있어서 Adapter클래스를 상속하지 하지 못한다. 자바는 단일 상속만 지원하므로
 * 별도의 클래스에서 상속받아서 이벤트리스너를 연결해 주어야 합니다.
 * 그래서, 모든 이벤트 핸들러를 구현할 필요없음
 * 
 * 
 * 클래스 다중상속 불가, 단일상속
 * 인터페이스 다중상속 지원
 * 
 * 
 *  필요한 자원 import
 *  화면구성
 *  이벤트 처리
 *  - adapter클래스를 별도의 클래스에 상속받아
 *  - 이벤트리스너에 연결시 객체 생성하여 필요인자넘겨주면서 생성함
 *   
 */

package com.adapter1;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;	
import java.awt.event.KeyEvent;

import java.awt.event.KeyAdapter;		//Adapter class
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;	//Adapter class

public class AdapterEx extends Frame implements ActionListener{
	
	Panel p1, p2, p3;
	TextField tf;
	TextArea ta;
	Button bClear, bExit;
	
	public AdapterEx(){
		//Frame 제목 설정
		super("Adapter Class Test");
		
		//Panel 생성
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		//TextField, TextArea 생성
		tf = new TextField(35);
		ta = new TextArea(10, 35);
		
		//Button 생성
		bClear = new Button("Clear");
		bExit = new Button("Exit");
		
		//Panel에 컨트롤 추가
		p1.add(tf);
		p2.add(ta);
		p3.add(bClear);
		p3.add(bExit);
		
		//Frame에 각 Panel을 BorderLayour영역에 등록
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		//Frame의 위치, 넓이, 높이 설정
		setBounds(300,  200,  300,  300);
		//Frame 노출여부 설정
		setVisible(true);
		
		//이벤트 리스너 연결 - Button의 이벤트
		bClear.addActionListener(this);
		bExit.addActionListener(this);
		
		//이벤트 리스너 연결 - KeyEvent
		//같은 클래스가 아니라서 생성자를 통해 데이터를 넘겨줘야 합니다.
		//별도의 클래스에서 adapter클래스를 상속받아 객체를 생성해서 이벤트 리스너에 연결시켜줍니다.
		tf.addKeyListener(new KeyEventHandlers(tf, ta));		
		
		//이벤트 리스너 연결 - WindowEvent		
		addWindowListener(new WindowEventHandlers());		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		if( str.equals("Clear") ){
			/*ta.setText(" ");
			tf.setText(" ");
			tf.requestFocus();*/
			
			//JAVA 현재버전에서 포커스 오류 수정
			ta.setText(" ");
			tf.setText(" ");
			ta.setText("");
			tf.setText("");
			//tf.requestFocus();
		}else if(str.equals("Exit")){
			System.exit(0);
		}		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdapterEx();
	}
}


//별도의 클래스 생성 - KeyAdapter 클래스를 상속하는
class KeyEventHandlers extends KeyAdapter{
	//원하는 메소드만 재정의
	TextField tf;
	TextArea ta;
	
	//클래스가 달라 멤버 변수를 호출할 수 없어 생성자를 통해서 멤버변수를 입력받을 수 있도록 합니다.
	public KeyEventHandlers(TextField tf, TextArea ta){
		this.tf = tf;
		this.ta = ta;
	}	
	@Override
	public void keyTyped(KeyEvent e){
		if(e.getKeyChar()==KeyEvent.VK_ENTER){
			ta.append(tf.getText() + "\n");
			tf.setText("");
		}
	}	
}

//별도의 클래스 생성 - WindowAdapet클래스를상속하는
class WindowEventHandlers extends WindowAdapter{
	//종료버튼 클릭시 프로그램 종료
	@Override
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}