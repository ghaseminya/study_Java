/* ������ ���� ���� - java.util.Random Ŭ����
 * 
 * .nextInt()
 * 
 * */



package com.mathex;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n===============================");
		//					0			1				2					3			4			5
		String[] luck = {"�ζ� ��÷", "�����Ϸ� ����", "�����ο� �Ϸ�", "��ſ� ����", "�׳ɱ׳�", "��~"};
		Random r1 = new Random();
		//0���� ���ڷ� ���޵� ���� �������� ������ �����߻�
		int idx2 = r1.nextInt(5); System.out.println("�߻��� ����: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("�߻��� ����: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("�߻��� ����: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("�߻��� ����: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("�߻��� ����: " + idx2);
		idx2 = r1.nextInt(5); System.out.println("�߻��� ����: " + idx2);
		System.out.println("������ ���: " + luck[idx2]);
	}
}