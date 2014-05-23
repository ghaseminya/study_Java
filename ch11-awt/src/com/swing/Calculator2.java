/* 사칙연산기 - 문자 입력 예외처리
 * 
 * 
 * 숫자만 입력되어야되는데 문자가 입력되는지 검증
 * charAt()과 아스키코드 활용
 * 
 *  
 * 51 -> 5십이
 *       01 2   
 *  
 * charAt(i)
 * 아스키코드값: 숫자의 범위 48~57(0~9)안에 있으면 숫자이고 이 범위이면 문자라고 알려준다.
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


public class Calculator2 extends JFrame implements ActionListener{
	
	JButton button1, button2;
	JTextField text1, text2, text3;
	JPanel panel1, panel2;
	JComboBox combo;
	int num1, num2, result;
	String str1, str2, com;
	
	public Calculator2(){
		super("사칙연산기");
		
		Container contentPane = getContentPane();		
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		text1= new JTextField(5);
		text2= new JTextField(5);
		text3= new JTextField(5);
		
		String[] op ={"+", "-", "*", "/"};
		combo = new JComboBox(op);
		
		panel1.add(text1);
		panel1.add(combo);
		panel1.add(text2);
		panel1.add(new JLabel("="));
		panel1.add(text3);
		
		//결과값이 보여지는 TextField 수정 불가
		text3.setEditable(false);
		
		button1 = new JButton("확인");
		button2 = new JButton("취소");
		
		panel2.add(button1);
		panel2.add(button2);
		
		contentPane.add(panel1, BorderLayout.NORTH);
		contentPane.add(panel2, BorderLayout.CENTER);

		//익명내부클래스로 x버튼 한것이랑 동일
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//x, y
		setLocation(500, 400);	
		
		//사이즈를 명시하지 않고 pack()사용하면 컴포넌트의 크기를 인식해서 자동적으로 사이즈를 계산		
		pack();
		
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
						
			
			//String -> int 시 예외처리 방법 2
			int check =0;
			for(int i=0; i<str1.length(); i++){
				
				//'1' -> 49
				check = str1.charAt(i);
				
				//아스키코드 48~59인지 체크
				if( check >= 48 || check <=59){
					num1 = Integer.parseInt(str1);					
				}else
				{
					showErrMsg(text2, "숫자만 입력가능합니다");
				}				
			}			
			
			
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
		new Calculator2();
	}
	
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
	
	private void showErrMsg(JTextField text, String str){
		text2.requestFocus();
		text2.setText("");
		// 에러 발생시 합계를 지움
		text3.setText("");
								//부모컴포넌트, 에러문구(메시지), 메시지 타이틀, 아이콘타입(메시지타입)
		JOptionPane.showMessageDialog(this, str, "에러 메시지", JOptionPane.ERROR_MESSAGE);
		
	}
}
