/* �������̽� - �߻� �޼ҵ� ��üȭ
 * 
 * �������̽� ����
 * class�� implements�ϰ� �������̽� �߻� �޼ҵ� ��üȭ
 * class�� ��ü ����
 * ��ü�� ���� �޼ҵ� ȣ��
 * */

package com.inter1;

interface A2{
	//�߻� �޼ҵ�
	public abstract void getB();	//�߻� �޼ҵ� ���� ����
	void getC();					//public abstract������ ����
}

//A2�������̽��� B2�� ����
class B2 implements A2{
	@Override
	public void getB(){
		System.out.println("getB �޼ҵ�");		
	}
	
	@Override
	public void getC(){
		System.out.println("getC �޼ҵ�");		
	}
}

public class InterEx02 {

	public static void main(String[] args) {
		B2 b2b2 = new B2();
		b2b2.getB();
		b2b2.getC();
	}
}
