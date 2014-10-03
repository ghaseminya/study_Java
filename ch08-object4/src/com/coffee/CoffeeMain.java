package com.coffee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CoffeeMain {

	//��� (Ŀ�� ���Ž� �����Ǵ� ��)
	public static final int PRICE = 300;
	public static final int CONTENT_COFFEE = 5;
	public static final int CONTENT_CREAM = 3;
	public static final int CONTENT_SUGAR = 1;

	int amount = 0; //�Ա��� ���� ����
	int change = 1000; //�Ž�����
	int coffeeQuantity = 10;//Ŀ�� ��
	int creamQuantity = 10; //���� ��
	int sugarQuantity = 10; //���� ��

	BufferedReader br;



	public CoffeeMain(){
		br = new BufferedReader(
				new InputStreamReader(System.in));
	}

	//�Է� �޼���
	public void input()throws IOException{
		while(true){
			System.out.print(
					"1:Ŀ�Ǹ��ñ�,2:������,3:����");
			String str = br.readLine();
			if(str.equals("1")){
				System.out.print("������ ��������(Ŀ�ǰ�"+PRICE+"��)>");
				String coin = br.readLine();

				System.out.print("������ �� �Է�>");
				String count = br.readLine();

				try{
					isSale(Integer.parseInt(coin),Integer.parseInt(count));
				}catch(NumberFormatException e){
					System.out.println("���ڸ� �Է°���!");
				}catch(Exception e){
					System.out.println(e.getMessage());
				}

			}else if(str.equals("2")){
				//������
			}else if(str.equals("3")){
				System.out.println("�ȴ�~~~");
				break;
			}else{
				System.out.println(
						"�߸� �Է��߽��ϴ�.");
			}
		}
	}

	//Ŀ�� �ֹ� ���� �޼���
	public void processCoffee(int coin,int count){
		//�Ž����� ó��
		int real_change = coin-PRICE*count;

		change -= real_change;
		System.out.println("�Ž����� : " + real_change);

		//Ŀ��,����,���� �� ����, amount ����
		coffeeQuantity-=CONTENT_COFFEE*count;
		creamQuantity-=CONTENT_CREAM*count;
		sugarQuantity-=CONTENT_SUGAR*count;
		amount+=coin;

		System.out.println("�� ���� Ŀ�ǰ� " + count + "�� �غ�Ǿ����ϴ�.");
		print();
	}

	public void isSale(int coin,int count)throws Exception{
		if(coin<PRICE*count){
			throw new Exception("������ �����մϴ�.");
		}
		if((coin-PRICE)/count>change){
			throw new Exception("�Ž������� �����մϴ�.");
		}
		if(coffeeQuantity<CONTENT_COFFEE*count){
			throw new Exception("Ŀ�ǰ� �����մϴ�.");
		}
		if(creamQuantity<CONTENT_CREAM*count){
			throw new Exception("������ �����մϴ�.");
		}
		if(sugarQuantity<CONTENT_SUGAR*count){
			throw new Exception("������ �����մϴ�.");
		}
		processCoffee(coin,count);
	}

	//���� ���Ǳ� ���� ���
	public void print(){
		System.out.println("===���� ���Ǳ� ����===");
		System.out.println("Ŀ�Ǿ� : " + coffeeQuantity);
		System.out.println("������ : " + creamQuantity);
		System.out.println("������ : " + sugarQuantity);
		System.out.println("�Ž����� �����ݾ� : " + change);
		System.out.println("�����ݾ� : " + amount);
	}
	public static void main(String[] args){
		CoffeeMain cm = new CoffeeMain();
		try {
			cm.input();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
