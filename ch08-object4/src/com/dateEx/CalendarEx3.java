/* �޷� �����
 * 
 * �����̽��� ���ڿ� �����Ͽ� �޷� �����
 */


package com.dateEx;

import java.util.Calendar;

public class CalendarEx3 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		System.out.println("��� ������ ���� �Է��ϼ���(ex ����: 2020, ��: 2)");
		System.out.println("����: ");
		int year = input.nextInt();
		
		System.out.println("��: ");
		int month = input.nextInt();
		
		System.out.println("\n[" + year + "��" + month + "��]");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		
		//Calendar MONTH�� 0~11�� ������ 
		//�����, ��, �� ����
		cal.set(year, month-1, 1);
		
		//���� ������ ��¥
		int lastofDate = cal.getActualMaximum(Calendar.DATE);
		
		//Calendar.DAY_OF_WEEK: ���� 1(��) ~ 7(��)
		//ù���� ����
		int week = cal.get(Calendar.DAY_OF_WEEK);
				
		//1���� ������ �����ؼ� �ش� ���������� ����ó��
		for(int i=1; i<week; i++){
			System.out.print("    ");				
		}
		
		for(int i=1; i <= lastofDate; i++){
			System.out.print( (i<10) ? "   "+i : "  "+i );			
			if( week%7 ==0)
				System.out.println();
			week ++;
		}		
		System.out.println("\n======================");

	}

}
