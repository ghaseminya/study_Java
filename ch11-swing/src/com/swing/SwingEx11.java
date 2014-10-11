/*
WindowEvent 

*/
package com.swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx11 {

	public static void main(String[] args) {
		JFrame frmOne=new JFrame("Frame One");
		JFrame frmTwo=new JFrame("Frame Two");
		
		frmOne.setBounds(120, 120, 250, 150);		
		frmTwo.setBounds(380, 120, 250, 150);
	
		frmOne.addWindowListener(new WindowEventHandler("Frame One"));
		frmTwo.addWindowListener(new WindowEventHandler("Frame Two"));
	
		frmOne.add(new JButton("Button One"));
		frmTwo.add(new JButton("Button Two"));
	
		frmOne.setVisible(true);
		frmTwo.setVisible(true);
	}
}

class WindowEventHandler implements WindowListener {
	String frameInfo;
	
	public WindowEventHandler(String info) {
		frameInfo=info;
	}	
	
	//GUI창이 처음 오픈될 때 호출
		public void windowOpened(WindowEvent e) {
			System.out.println(frameInfo+" windowOpened");		
		} 
	
	
	//GUI창이 활성화될 때 호출 (포커스된 상태)
	public void windowActivated(WindowEvent e) {
		System.out.println(frameInfo+" windowActivated");
	}
	
	//GUI창이 비활성화될 때 호출
		public void windowDeactivated(WindowEvent e) {
			System.out.println(frameInfo+" windowDeactivated");	
		}
	
	
	//X 버튼이 눌려서 창이 보이지 않는다고 해서 창이 소멸된 것은 아닙니다. 프로세스 존재함
	//우 상단의 X 버튼이 눌리면 호출
	public void windowClosing(WindowEvent e) {
		JFrame frm=(JFrame)e.getWindow();
		frm.dispose();	//windowClosed 함수의 호출로 이어짐
		System.out.println(frameInfo+" windowClosing");
	}
	
	//창이 소멸되면서 호출
	public void windowClosed(WindowEvent e) {
		System.out.println(frameInfo+" windowClosed");
	}
	
	
	
	//우측 상단의 최소화 버튼이 눌릴 때 호출
	public void windowIconified(WindowEvent e) {
		System.out.println(frameInfo+" windowIconified");		
	}	
	
	//최소화 후 다시 복원 되었을 때 호출
	public void windowDeiconified(WindowEvent e) {
		System.out.println(frameInfo+" windowDeiconified");		
	}
}