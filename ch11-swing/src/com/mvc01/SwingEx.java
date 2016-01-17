
//델리게이트 모델에서 뷰-컨트롤러 역할 (SwingEx)
//모델 역할(ModelEx)

package com.mvc01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
//JTable 컴포넌트를 사용하기 위해 javax.swing.table 패키지를 import
import javax.swing.JTable;

public class SwingEx extends JFrame{ //뷰(컨트롤러) 역할
	
	public SwingEx(){
		//모델에 해당하는 클래스 객체를 생성(ModelEx.java)
		ModelEx se = new ModelEx();
		
		//모델을 인자로 하여 테이블 객체를 생성
		JTable tbl = new JTable(se);
		//테이블의 기본 크기를 가로 600, 세로 400으로 정의
		tbl.setPreferredScrollableViewportSize(new Dimension(600, 400));
		//객체를 생성하고 테이블이 스크롤 가능하도록 지정
		JScrollPane sp = new JScrollPane(tbl);
		//컨테이너를 생성
		Container cp = this.getContentPane();
		setLayout(new BorderLayout());
		//컨테이너에 부착
		cp.add(sp);
		
	}
	
	public static void main(String[] args){
		//객체를 생성하여 화면에 나타나게 합니다.
		SwingEx  mvc = new SwingEx();
		mvc.setSize(300, 200);
		mvc.setVisible(true);
	}

}
