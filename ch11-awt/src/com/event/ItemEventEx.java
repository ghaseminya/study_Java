/* Item 컴포넌트
 * 
 * 
 */


package com.event;

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Checkbox;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemEventEx extends Frame implements ActionListener, ItemListener {
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	TextArea ta = new TextArea(5, 20);
	Button exit = new Button("종료");
	Checkbox cb1 = new Checkbox("축구");
	Checkbox cb2 = new Checkbox("농구");
	Checkbox cb3 = new Checkbox("야구");
	Checkbox cb4 = new Checkbox("족구");
	Checkbox cb5 = new Checkbox("배구");
	Checkbox cb6 = new Checkbox("수영");

	
	//생성자 생성	
	public ItemEventEx(){
		//제목 설정
		super("ItemEvent Test");
		
		//체크박스를  Panel 1에 등록
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		p1.add(cb5);
		p1.add(cb6);
		
		//Button을 Panel 2에 등록
		p2.add(exit);
		
		//Panel을 Frame에 등록
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(ta, BorderLayout.CENTER);
				
		//Button과 이벤트 리스너 연결
		exit.addActionListener(this);
		
		//Checkbox와 이벤트 리스너 연결
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		
		//Frame 위치,크기 지정
		setBounds(300, 300, 300, 300);		
		
		setVisible(true);		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	@Override
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){	//선택한 경우
			ta.append(e.getItem() + "을 선택\n\n");
		}else if(e.getStateChange() == ItemEvent.DESELECTED){	//선택해제된 경우
			ta.append(e.getItem() + "을 취소\n\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemEventEx();
	}
}
