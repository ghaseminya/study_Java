/* Date Ȯ��
 * 
 * Date()
 * deprecated�� toLocaleString() �޼ҵ� ȣ��
 * 
 * SimpleDateFormatŬ���� ����� ���� import
 * SimpleDateFormat ��ü�� ���� today���
 */


package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DateŬ������ ����� �ú��ʸ� �Ѳ����� ����� �� ���
		//����� �ú��ʸ� ���� ���� ��쿡�� CalendarŬ������ ���
		Date now = new Date();
		System.out.println(now);
		
		
		//deprecated�� toLocaleString()ȣ��
		//deprecated�� ������ �����Ϸ��� �˷���
		//�ᵵ ������ ���� ������  ��¿�� ���� ��츦 �����ϰ�� deprecated�� �޼ҵ�� ������ ������� ����
		System.out.println(now.toLocaleString());

		//MM�� ������ �빮��(��)
		//mm�� ������ �ҹ���(��)
		//��� ���� ������ ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh:mm:ss");
		String today = sdf.format(now);
		System.out.println(today);	
	}
}
