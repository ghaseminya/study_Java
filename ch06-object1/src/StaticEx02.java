/* �ν��Ͻ� ������ Static����
 * 
 * */

public class StaticEx02 {
	
	String s1 = "�ν��Ͻ� ����";
	static String s2 ="STATIC";
	
	public static String getString(){
		return s2;
	}	

	public static void main(String[] args) {		
		
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem:	Cannot make a static reference to the non-static field s1
		�ν��Ͻ� ������ ��ü ����  ȣ�� ����*/
		//System.out.println(s1);
		
		//Static ���� ȣ��
		System.out.println(StaticEx02.s2);
		System.out.println(s2);
		
		//Static �޼ҵ� ȣ��
		System.out.println(StaticEx02.getString());
		
		StaticEx02 st = new StaticEx02();
		System.out.println(st.s1);
		

	}

}
