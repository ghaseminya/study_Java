/* MathŬ���� - ���а��� �޼ҵ�
 * 
 * ���밪 ���ϱ�
 * �ø�
 * ����(����)
 * �ݿø�
 * �ִ밪
 * �ּҰ� 
 */

package com.mathex;

public class MathEx {

	public static void main(String[] args) {
		// ���밪 ���ϱ�
		int i = Math.abs(-10);
		System.out.println(i);
		
		// �ø�
		double d = Math.ceil(3.3);
		System.out.println(d);
		
		// ����(����)
		d = Math.floor(3.7);
		System.out.println(d);

		// �ݿø�
		i = Math.round(4.7F);
		System.out.println(i);
		
		// �ִ밪
		i = Math.max(5, 9);
		System.out.println(i);
				
		// �ּҰ�
		i = Math.min(6, 8);
		System.out.println(i);
	}
}
