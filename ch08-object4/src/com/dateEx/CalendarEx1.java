/* CalendarŬ���� - Date���� �޼ҵ�
 * 
 * �޷��̳� �ð� �ۼ��� �ַ� ���
 * 
 * import
 * Calendar ��ü ����
 * ��ü ���
 *  
 *  
 */



package com.dateEx;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		
		int year = today.get(Calendar.YEAR);		
		//int month = today.get(Calendar.MONTH)+1;
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		
		System.out.println(year +"��" + month + "��"+ date + "��");
		
		//Calendar MONTH�� 0~11�� ������ �׷��� �������� ���� ����ҷ��� +1����� �մϴ�.��	
		month = month +1;
		System.out.println(year +"��" + month + "��"+ date + "��");
		
		
		//���� ����ϱ�
		//Calendar.DAY_OF_WEEK: ���� 1(��) ~ 7(��)
		int day = today.get(Calendar.DAY_OF_WEEK);
		String nday = "";	//���ڿ� �ʱ�ȭ		
		
		System.out.println(day);
		switch(day){
		case 1: nday = "��"; break;
		case 2: nday = "��"; break;
		case 3: nday = "ȭ"; break;
		case 4: nday = "��"; break;
		case 5: nday = "��"; break;
		case 6: nday = "��"; break;
		case 7: nday = "��"; break;		
		}
		System.out.println(nday + "����");
		
		
		//����/���� ǥ��
								//����:0, ����:1
		int amPm = today.get(Calendar.AM_PM);
		String msg_amPm = (amPm == Calendar.AM) ? 
								"����" : "����";
		int hour = today.get(Calendar.HOUR);	//��
		int min = today.get(Calendar.MINUTE);	//��
		int sec = today.get(Calendar.SECOND);	//��
		System.out.println(msg_amPm + " " + hour + "��" + min + "��" + sec + "��");

	}

}
