/* Unit �߻�Ŭ����/�߻� �޼ҵ� ����
 * 
 * Protoss, Terran, Zerg Ŭ�������� UnitŬ������ ��ӹޱ�
 * Unit �߻�Ŭ������ �߻� �޼ҵ带 ��� ���� ������ �Ϲ�Ŭ�������� ��üȭ �ϱ�
 * main���� ������ Ŭ������ ���� ��ü�� �����ϰ� 
 * �߻� �޼ҵ带 �������̵��� �޼ҵ带 ȣ�� 
 * 
 * */


package com.abs2;

public class UnitTest {
	
	public static void main(String[] args){
		Protoss pt = new Protoss("�����佺", 100, true);
		pt.decEnergy();
		System.out.println("Protoss ������ ������ :\t" + pt.getEnergy());		
		
		Terran tr = new Terran("�׶�", 100, false);
		tr.decEnergy();
		System.out.println("Terran ������ ������ :\t" + tr.getEnergy());
		
		Zerg zg = new Zerg("����", 100, true);
		zg.decEnergy();
		System.out.println("Terran ������ ������ :\t" + zg.getEnergy());
		
	}
}
