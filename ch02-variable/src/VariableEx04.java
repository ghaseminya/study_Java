/*
���� �ڷ��� char 
*/
public class VariableEx04 {

	public static void main(String[] args)
	{
		//��ǻ�ʹ� ���ڸ� ǥ���� �� �����Ƿ�
		//2byte������ �����Ǵ� ������ �����ڵ� ������ �ڵ� ��ȯ�˴ϴ�.
		char ch1='A';			//'A'�� 16������ 0x41
		char ch2='��';			//'��'�� 16������ 0xD55C
		char ch3=54620;			//54620�� 16������ 0xD55C
		char ch4=0x3081;
		char ch5=0x3082;
		char ch6='1';
		char ch7=1;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
	}
}
