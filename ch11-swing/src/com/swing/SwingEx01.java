/*

Swing JButton확인

-------------------------
JFrame이 상속하는 클래스중 하나는 java.awt.Container 클래스! 이 클래스를
상속하는 컴포넌트는 다른 Swing 컴포넌트를 얹을 수 있다.
Container 클래스는 배치와 관렦된 클래스이다. 따라서 setLayout 메소드 역시 Container 클래스의 메소드이다.

*/

package com.swing;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class SwingEx01
{	
	public static void main(String[] args)
	{
		JFrame frm=new JFrame("Swing Button");	//골격이 되는 창은 JFrame의 인스턴스
		//x좌표, y좌표, 가로, 세로
		frm.setBounds(120, 120, 400, 100);
		//FlowLayout 인스턴스가 장착되어 컴포넌트의 배치를 관리하게 됩니다. 
		//단순히 add 메소드의 호출을 통해서 컴포넌트를 얹으면 FlowLayout 인스턴스가 적절히 배치합니다.
		frm.setLayout(new FlowLayout());	//배치관리자, 레이아웃관리자
		
		JButton btn1=new JButton("Button One");
		JButton btn2=new JButton("Button Two");
		JButton btn3=new JButton("Button Three");
		
		//JFrame에 버튼 추가
		frm.add(btn1);		
		frm.add(btn2);		
		frm.add(btn3);
		//setVisible 메소드 호출을 통해서 작성한 JFrame을 눈에 보이게 합니다
		frm.setVisible(true);
	}
}