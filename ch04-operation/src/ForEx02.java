
public class ForEx02 {

	public static void main(String[] args) {
		// �����ڰ� ����/2�� ������Ű��
		
		// �����ڰ� ����
		System.out.println("�� ���ڰ� 1�� ���� ��Ű��:");
		for(int i=5; i>=1; i--){
			System.out.print("\t"+ i);
		}
		System.out.println();
		System.out.println("\t���α׷� ����!");
		
		// �����ڰ� 2�� ������Ű��
		System.out.println();
		System.out.println("�� ���ڰ� 2�� ������Ű�� 1:");
		for(int i=0; i<=10; i+=2){
			System.out.print("\t"+ i);					
		}
		System.out.println();
		System.out.println("\t���α׷� ����!");
		
		
		System.out.println();
		System.out.println("�� ���ڰ� 2�� ������Ű�� 2:");
		for(int i=0; i<=10; i++){
			if(i%2 == 0){
				System.out.print("\t"+ i);
				}					
		}
		System.out.println();
		System.out.println("\t���α׷� ����!");

	}
}
