
public class ForEx05 {

	public static void main(String[] args) {
		// ���� for�� �̿� ������ ¥��
		
		for( int dan = 1; dan <10; dan ++){			
			System.out.print(dan + "��:  ");
			for( int i = 1; i<10; i++){
				System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
			}
			System.out.println();
		}
		
		
		//(����) ���� ���� 
		/*for( int dan = 1; 1 <10; dan ++){			
			System.out.print(dan + "��:  ");
			for( int i = 1; i<10; i++){
				System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
			}
			System.out.println();
		}*/
	}
}
