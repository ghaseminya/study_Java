/* �������̽� - �������̽��� ��� ȣ��
 * */

package com.inter1;

interface A1{
	//���
	public static final int W = 10;	// ���� ����
	int X =20;						//������ public static final int X=20;�ε� public static final������ ����
	static int Y = 30;				//public static final������ ����
	final int Z = 40;				//public static final������ ����
}


public class InterEx01 {

	public static void main(String[] args) {
		// �������̽� ��ü���� �Ұ�
		//A1 aa1 = new A1();	//ERROR: Cannot instantiate the type A1
		
		//public�ϰ� static�� ����̹Ƿ�
		//�������̽��� dot�����ڸ� ���� ȣ��
		System.out.println("W = " + A1.W);
		System.out.println("W = " + A1.X);
		System.out.println("W = " + A1.Y);
		System.out.println("W = " + A1.Z);
		
	}
}
