/* ����ȭ, ĸ��ȭ - Ŭ���� �и�
 * 
 * MyClass.java
 * MyClassMain.java
 * */

public class MyClassMain {

	public static void main(String[] args) {
		// ������
		
		MyClass mc1 = new MyClass();		
		
		//���������ڰ� private�̱� ������ ȣ�� �Ұ���
		//mc1.name = "ȫ�浿";
		//mc1.age = 18;
		
		mc1.setName("ȫ�浿");
		mc1.setAge(18);
		System.out.println(mc1.getName() + " / " + mc1.getAge());		
		
		MyClass mc2 = new MyClass("������");
		System.out.println(mc2.getName() + " / " + mc2.getAge());
		
		MyClass mc3 = new MyClass("�±Ǻ���",  30);
		System.out.println(mc3.getName() + " / " + mc3.getAge());

	}
}
