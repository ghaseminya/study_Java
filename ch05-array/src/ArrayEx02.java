
public class ArrayEx02 {

	public static void main(String[] args) {
		// �迭 ����, ����, �ʱ�ȭ(�Ͻ������� �迭 ����)
		
		//�Ͻ��� �迭 ����
		int[] a = {10, 20, 30, 40, 50, 60, 70};
		
		System.out.print("�迭�� ��� :");	//16���� ����ũ�� ������(�޷θ� ���� �ƴ� ������ ������)
		System.out.println(a);
		
		
		System.out.println();
		System.out.println("�迭 ��� :");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ "\t");
			
		}
	}
}
