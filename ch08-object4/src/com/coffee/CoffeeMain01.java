/* Ŀ�� ���Ǳ� �����
 * 
 * Ŀ�� ���Ž� �����Ǵ� �翡 ���� ��� ����
 * import 
 * 
 * 
 * ��ü ������ try~catch{}ó��
 *  
 * -------------------------------------------
 * ����: ���Ǳ� ���α׷�

�޴�: 1) Ŀ���ֹ�	2) ������ ���	3) ����
�޴�1) Process
1-1�����ֱ�
1-2����
1-3��Ŀ�� / ����Ŀ�� / ����Ŀ��
1-4�ܵ�

���Ǳ� ���� ����: 
Ŀ�Ǿ� -10 / ������ -5 / ������ -3
�ܵ� = 10000 / ���Ե� �� =

��������:
Ŀ�Ǿ�/������/������/�ܵ��� 0�� �ɰ�� ��������
���Ǳ� ���μ��� -> ��� ���� ó��
�޴� ���� -> �޼ҵ� ó��
 
 */

package com.coffee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CoffeeMain01 {
	
	//��� ���� - Ŀ�� ���Ž� �����Ǵ� ��
	public static final int PRICE = 300;
	public static final int CONTENT_COFFEE = 5;
	public static final int CONTENT_CREAM = 3;
	public static final int CONTENT_SUGAR = 1;	
	
	//���� ����
	int amount = 0;				//Ŀ�Ǹ� �Ǹ��� ���ͱ�
	int change = 5000;			//���� �Ž�����
	int quantityCoffee = 20;	//���� ���� Ŀ�Ǿ�
	int quantityCream = 20;		//���� ���� ũ����
	int quantitySugar = 20;		//���� ���� ������
	
	
	BufferedReader br;		//�޴� �ޱ�
	java.util.Scanner input;//����, �� �ޱ� 
	
	//
	int order = 0;	//�ֹ�����
	int money = 0;	//������ �ݾ�
	int changeYou =0; //�� �ܵ�
	boolean b_money=true;		//�ܵ� ó������ ����
	boolean b_quantity=true;	//Ŀ�� �������� ����
	
	//������
	public CoffeeMain01(){
		 
		br = new BufferedReader(new InputStreamReader(System.in));
		input = new java.util.Scanner(System.in);		
		
	}
	
	//�Է� �޼ҵ�
	public void input() throws IOException{		
		
		while(true){
			System.out.print("1:Ŀ�� �ֹ�, 2:������ ���, 3:����");
			
			String str = br.readLine();
			
			if(str.equals("1")){
				//Ŀ�� �ֹ�
				System.out.println("Ŀ�� �ֹ��� �����մϴ�.");
				
				//������ ��������
				System.out.print("�����Դϴ�. ���� �ּ���?");
				money = input.nextInt();
				//���� �ܼ��� �Է��ϼ���
				System.out.print("�� ���� �ٱ��?");
				order = input.nextInt();
				
				//���Ǳ� ��ȿ�� �˻�
				verifyCoffee();
				
				//Ŀ�� �ֹ� ó��
				processCoffee();
				

			}else if(str.equals("2")){
				//������ ���
				System.out.print("������ ����Դϴ�");
				//break;
				
			}else if(str.equals("3")){
				//����
				System.out.print("Ŀ�� �ֹ��� ��Ĩ�ϴ�.");
				System.exit(0);
				
			}else{
				System.out.print("�߸� �Է��Ͽ����ϴ�.");
			}			
		}
	}
	
	
	//Ŀ�� �ֹ����� �޼ҵ�(Ŀ�� �ֹ��� ����/�ֹ����� �ľ�->Ŀ��,����,���� ����/�Աݱݾ׿��� �ֹ��ݾ� ������ �Ž����� ���)
	public void processCoffee(){
		//Ŀ�� �ֹ��� ����
		//���ұݾ� - ���Աݾ� = �ܵ�
		changeYou = money - (PRICE * order);
		amount += (PRICE * order);
		
		//�ֹ����� �ľ�->Ŀ��,����,���� ����
		quantityCoffee -= (order * CONTENT_COFFEE);
		quantityCream -= (order * CONTENT_CREAM);
		quantitySugar -= (order * CONTENT_SUGAR);
		
		//�Աݱݾ׿��� �ֹ��ݾ� ������ �Ž����� ���
		change -= changeYou;
		
		print();
	}

	//������ ���Ǳ� ���� ���� ���(Ŀ�Ǿ�/������/������/�Ž����� �����ݾ�/���紩���ݾ�)
	public void print(){
		//Ŀ�Ǿ�
		//������
		//������
		//�Ž����� �����ݾ�
		//���紩���ݾ�
		System.out.println("-------------------------------------");
		System.out.println("���� ���� Ŀ�Ǿ�: " + quantityCoffee);
		System.out.println("���� ���� ũ����: " + quantityCream);
		System.out.println("���� ���� ������: " + quantitySugar);
		System.out.println("���� �Ž�����: " + change);
		System.out.println("Ŀ�Ǹ� �Ǹ��� ���ͱ�: " + amount);

	}
	
	//��ȿ�� �˻� - ���� �ֹ����� ���� Ŀ���Ǹ� ���ɿ��� �˻�
	public void verifyCoffee() throws IOException{
		
		if( (change - (money - (PRICE * order))) >= 0 ){
			b_money = true;			
		}else{			
			b_money = false;
			System.out.println("������ �Ž������� ���ڶ� �ֹ��� �Ϸ��� �� �����ϴ�.");
			print();
			System.exit(0);			
		}
		
		if( (quantityCoffee - (order * CONTENT_COFFEE) >=0) && 
				(quantityCream - (order * CONTENT_CREAM))>=0 && (quantitySugar - (order * CONTENT_SUGAR))>=0 ){
			b_quantity = true;
		}else{
			b_quantity = false;
			System.out.println("���� ��ᰡ �����Ͽ� Ŀ�Ǹ� ������ ���մϴ�.");
			print();
			System.exit(0);
		}		
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMain01 ilc = new CoffeeMain01();
		try{
			ilc.input();			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}		
	}
}