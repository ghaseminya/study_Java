/* ������ ���� ���� - java.lang.Math.random()
 *    
 * Math.random()�� ������ ��Ȯ�� *  
 * double�� ������ ���� ���� int������ ����ó���ϱ�
 * 
 * */

package com.mathex;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		//					0		   1			2 			3			4
		String[] gift = {"����Ʈ��", "��Ʈ��", "������ī�޶�", "�׺�", "���(��)"};
		
		double ran= Math.random();
		//0.0 ~1.0�̸��� ����(0.0~0.9999999999999)
		System.out.println(ran);
		
		//double�� int�������� ����ó���ϱ�
		int idx1 = (int)(ran*5);	//ĳ�����ϸ� ������ ���� -> 0~4���� ����
		System.out.println("�߻��� ����: " + idx1);
		System.out.println("�߻��� ����: " + gift[idx1]);
		
		
		

	}

}
