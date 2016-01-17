package com.mvc01;

import javax.swing.table.AbstractTableModel;

//AbstractTableModel 클래스를 상속받고 있다.
//추상 클래스로서 getColumnCount, getRowCount, getValueAt 메소드를 오버라이딩 해야 합니다.
public class ModelEx extends AbstractTableModel {

	private Object[][]data = {
			{"1", "홍길동", "서울"},
			{"2", "김철수", "부산"},
			{"3", "이영희", "제주"}
	};
	
	//열의 개수를 설정한다
	public int getColumnCount(){
		return 3;
	}

	//행의 개수를 설정한다
	public int getRowCount(){
		return 3;
	}
	
	//주어진 행과 열을 이용하여 데이터 배열을 설정
	public Object getValueAt(int row, int col){
		return data[row][col];
	}
	
	
}
