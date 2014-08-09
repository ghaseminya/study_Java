/* ���׸�
 * Ŭ������ ���� �� ���� v�� ������ Ÿ���� Ȯ������ �ʰ� 
 * �ν��Ͻ��� ������ �� ������ Ÿ���� �����ϴ� ��� 
*/

import static java.lang.System.out;

// Ŭ������ ���� �� �� ������ Ÿ���� Ȯ������ �ʽ��ϴ�.
class GenericsEx<T>{
	// T��� ������ Ÿ���� �������� ����. �� ���� �Ʒ� �ڵ��� T���� ��������.
	T[] v;
	
	public void set(T[] str){
		v = str;
	}
	public void print(){
		for(T s:v)
			out.println(s);
	}
}

//ǥ�� �����
public class GenericsEx01 {

	public static void main(String[] args){
		
		//Ŭ���� ����ο� ����T�� �Ʒ� �ڵ��� <> �ȿ� ������ ������ Ÿ�Կ� ���ؼ� ���� 
		//�ν��Ͻ��� �����Ҷ� t�� ������ Ÿ���� �����˴ϴ�.
		GenericsEx<String> t = new GenericsEx<String>();
		
		String[] aStr ={"��", "��", "��", "��", "��", "��", "��"};
		t.set(aStr);
		t.print();
	}
}

/*
//���� ��� �ƴ�
public class GenericsEx01 {

	public static void main(String[] args){
		
		GenericsEx t = new GenericsEx();
		
		String[] aStr ={"��", "��", "��", "��", "��", "��", "��"};
		t.set(aStr);
		t.print();
	}
}
*/
