/* �޷� �����
 * 
 * ������ �����Ͽ� �޷¸����
 */

package com.dateEx;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		// ���� �Է¹ޱ� ����
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//Calender��ü ����
		Calendar cal = Calendar.getInstance();
		
		//��� ��, �� �Է¹ޱ�
		System.out.println("��� ������ ���� �Է��ϼ���(ex ����: 2020, ��: 2)");
		System.out.println("����: ");
		int year = input.nextInt();
		System.out.println("��: ");
		int month = input.nextInt();
		
		//��, ��, ���� ǥ��		
		System.out.println("\n[" + year + "��" + month + "��]");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
				 
		//�����, ��, �� ����
		//Calendar MONTH�� 0~11�� ������
		cal.set(year, month-1, 1);
		
		//���� ������ ��¥ ���ϱ�
		int lastofDate = cal.getActualMaximum(Calendar.DATE);
		
		//Calendar.DAY_OF_WEEK: ���� 1(��) ~ 7(��)
		//ù���� ����
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println("week: " + week);
				
		//1���� ������ �����ؼ� �ش� ���������� ����ó��
		for(int i=1; i<week; i++){
			System.out.print("\t");				
		}
		
		//���� �ٹٲ��ϱ� ����
		for(int i=1; i <= lastofDate; i++){
			System.out.print(i+"\t");			
			if( week%7 ==0)
				System.out.println();
			week ++;
		}
		
		System.out.println("\n======================");
	}
}
