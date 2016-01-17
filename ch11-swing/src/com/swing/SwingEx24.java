package com.swing;



import java.awt.BorderLayout;
import java.awt.Container;

//Swing 패키지를 import
//AWT 와 관련된 프로그램을 작성하려면 반드시 import 해야 합니다.
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//JFrame 클래스를 상속
public class SwingEx24 extends JFrame{
	
	public SwingEx24(){
		setLayout(new BorderLayout());
		
		//Swing 에 처음 등장하는 내용으로서 Container 객체를 생성한다. 
		//Swing의 컴포넌트는 Container 객체에 부착되도록 한다
		//JFrame 위에는 각종 컴포넌트를 직접 부착할 수 없기 때문에 이와 같이 컨테이너를 만들어서 컨테이너 위에 컴포넌트를 부착해야 합니다. 
		Container cp = this.getContentPane();
		//이미지 아이콘을 생성한다
		ImageIcon btnimg = new ImageIcon("boxer.gif");
		//버튼을 생성
		JButton btn = new JButton();
		//버튼의 아이콘으로 등록(그 외는 AWT의 GUI 기법과 동일)
		btn.setIcon(btnimg);
		cp.add(btn);
 	}
	
	public static void main(String args[]){
		SwingEx24 se = new SwingEx24();
		se.setSize(500, 500);
		se.setVisible(true);
	}
}
