/* �������̽� - ǥ��ȭ
 * 
 * �������̽��� ���� ǥ��ȭ�ؼ� �ڷ������� ���
 * �Ϲ������� �������̽����� ǥ��ȭ�� ���� �մϴ�.
 * 
 * �������̽� ����
 * Ŭ����1, 2 ����
 * Ŭ����1, 2 ���� �������̽� ����
 * Ŭ����3���� �������̽� �ڷ������� �޼ҵ� ó��
 * Ŭ����3 ��ü ���� �� ȣ��
 * */


package com.inter2;

interface I{
	public abstract void play();
}

class B implements I{
	@Override
	public void play(){
		System.out.println("BŬ������ play");
	}	
}

class C implements I{
	@Override
	public void play(){
		System.out.println("CŬ������ play");
	}	
}

class Z{
	//�������̽��� �ڷ������� ����
	public void autoPlay(I i){
		i.play();		
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		Z zp = new Z();
		zp.autoPlay(new B());	// B -> I �ڵ� ����ȯ
		zp.autoPlay(new C());	// C -> I �ڵ� ����ȯ
	}

}
