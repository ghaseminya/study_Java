/*
FlowLayout

----------------------------------------------------------
getPreferredSize()메소드는 JButton 클래스가 상속하는 상위 클래스에 정의된 메소드로써, 
GUI창에 그려질 컴포넌트 의 적절한 크기정보를 반환합니다. 
그리고 FlowLayout 배치 관리자는 이 메소드를 호출해서 반환되는 값을 참조하여 컴포넌트를 배치합니다.

*/
package com.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx05 {

	public static void main(String[] args) {
		JFrame frm=new JFrame("FlowLayout Demo");
		frm.setBounds(120, 120, 400, 200);
		frm.setLayout(new FlowLayout());
		
		frm.add(new JButton("Button 1 - Small"));
		frm.add(new JButton("Button 2"));
		frm.add(new JButton("small"));
		
		frm.add(new LargeButton("Large"));
		frm.add(new LargeButton("Large Button"));
		frm.add(new LargeButton("Button 6 - Large"));
			
		frm.setVisible(true);
	}
}

class LargeButton extends JButton
{
	public LargeButton(String str) {
		super(str);
	}
	
	//GUI창에 그려질 컴포넌트 의 적절한 크기정보를 반환합니다. 
	//그리고 FlowLayout 배치 관리자는 이 메소드를 호출해서 반환되는 값을 참조하여 컴포넌트를 배치합니다.
	@Override
	public Dimension getPreferredSize() {
		//Dimension 클래스의 두 인스턴스 변수는 width와 height이며 직접 접근이 가능
		Dimension largeBtmSz =new Dimension(
		    		super.getPreferredSize().width+30, 
		    		super.getPreferredSize().height+20
		    	);
		
		return largeBtmSz;
	}
}