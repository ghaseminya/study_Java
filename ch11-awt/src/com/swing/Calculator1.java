/* Swing - 사칙연산기
 * 
 * 
 * 화면 구성 작업
 * 
 * 컴포넌트의 크기에 맞춰 크기조정ㄴ 
 * 옛날 MAC스타일로 표시
 * 조건체크
 * 연산 수행 - doCalc()
 * 에러메시지 출력 - showErrMsg() 
 * implements ActionListener
 * 버튼에 Action이벤트 리스너를 연결
 * @Override	public void actionPerformed(ActionEvent e){ }
 *  
 * ---------------------------------------------------------
 * swith~case문에서 조건 체크시 문자열을 문자로 추출하는 함수 
 * "+" -> charAt(0) -> '+'
 *  
 * try ~ catch 문자 체크
 * 
 */

package com.swing;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;	//Dialog box


public class Calculator1 extends JFrame implements ActionListener{
	
	JButton button1, button2;
	JTextField text1, text2, text3;
	JPanel panel1, panel2;
	JComboBox combo;
	int num1, num2, result;
	String str1, str2, com;
	
	public Calculator1(){
		//Frame에 제목 설정
		super("사칙연산기");
		
		Container contentPane = getContentPane();		
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		text1= new JTextField(5);
		text2= new JTextField(5);
		text3= new JTextField(5);
		
		//연산 기호를 담은 String객체 생성
		String[] op ={"+", "-", "*", "/"};
		//연산 기호를 ComboBox에 저장
		combo = new JComboBox(op);
		
		//panel1에 사직연산을 위한 컴포넌트 등록
		panel1.add(text1);
		panel1.add(combo);
		panel1.add(text2);
		panel1.add(new JLabel("="));
		panel1.add(text3);
		
		//결과값이 보여지는 TextField 수정 불가
		text3.setEditable(false);
		
		//Button 생성
		button1 = new JButton("확인");
		button2 = new JButton("취소");
		
		//panel2에 확인, 취소 버튼 등록
		panel2.add(button1);
		panel2.add(button2);
		
		//panel1, panel2를 Frame의 Boraderlayout영역 위쪽과 중앙영역에 등록
		contentPane.add(panel1, BorderLayout.NORTH);
		contentPane.add(panel2, BorderLayout.CENTER);

		//x버튼 클릭시 종료 - 익명내부클래스로 x버튼 한것이랑 동일
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//x, y
		setLocation(500, 400);	
		
		//사이즈를 명시하지 않고 pack()사용하면 컴포넌트의 크기를 인식해서 자동적으로 사이즈를 계산		
		pack();
		
		//버튼에 Action이벤트 리스너를 연결
		button1.addActionListener(this);
		button2.addActionListener(this);
				
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		//객체 자체를 불러오기
		Object obj = e.getSource();
		
		if( obj == button1 ){	//확인
			str1 = text1.getText();
			str2 = text2.getText();
			com = (String)combo.getSelectedItem();			
						
			/* String -> int
			num1 = Integer.parseInt(str1);
			num2 = Integer.parseInt(str2);*/
			
			//String -> int 시 예외처리
			try{
				num1 = Integer.parseInt(str1);
				
			}catch(NumberFormatException ne){
				showErrMsg(text1, "숫자만 입력가능합니다");
				return;
			}			
			try{
				num2 = Integer.parseInt(str2);
				
			}catch(NumberFormatException ne){
				showErrMsg(text2, "숫자만 입력가능합니다");
			}
			
			//연산 수행 메소드 호출
			doCalc();			
			
		}else{	//취소
			text1.setText("");
			text2.setText("");
			text3.setText("");			
		}
	}

	public static void main(String[] args) {
		// 옛날 MAC스타일로 표시
		JFrame.setDefaultLookAndFeelDecorated(true);
		new Calculator1();
	}
	
	//연산 수행
	private void doCalc(){
		try{
			switch(com.charAt(0)){
				case '+': result = num1 + num2; break;
				case '-': result = num1 - num2; break;
				case '*': result = num1 * num2; break;
				default : result = num1 / num2; break;			
			}
			//int -> Sting
			//text3.setText( String.valueOf(result) );
			text3.setText(result + "");
		}catch(ArithmeticException ae){
			showErrMsg(text2, "0으로 나눌 수 없습니다!");
		}
	}
	
	//에러메시지 출력
	private void showErrMsg(JTextField text, String str){
		text2.requestFocus();
		text2.setText("");
		// 에러 발생시 합계를 지움
		text3.setText("");
								//부모컴포넌트, 에러문구(메시지), 메시지 타이틀, 아이콘타입(메시지타입)
		JOptionPane.showMessageDialog(this, str, "에러 메시지", JOptionPane.ERROR_MESSAGE);		
	}
}
