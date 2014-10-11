/*
setDefaultCloseOperation()통한 프로그램 종료방법

*/
package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingEx12 {

	public static void main(String[] args) throws Exception {
		JFrame frmOne=new JFrame("Frame One");
		JFrame frmTwo=new JFrame("Frame Two");
		
		frmOne.setBounds(120, 120, 250, 150);		
		frmTwo.setBounds(380, 120, 250, 150);
	
		frmOne.add(new JButton("Button One"));
		frmTwo.add(new JButton("Button Two"));
	
		frmOne.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frmTwo.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//setDefaultCloseOperation의 인자로 WindowConstant.DISPOSE_ON_CLOSE가 전달되면
		//X 버튼 눌릴 때 dispose() 메소드 호출과 동일한 결과가 나타납니다.
		 
		frmOne.setVisible(true);
		frmTwo.setVisible(true);
	}
}
