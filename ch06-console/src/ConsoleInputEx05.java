//Scanner 클래스를 이용하여 입력을 받을 때 버퍼에 남은 데이터를 비우기

//입력전에 버퍼를 비워주는 구문을 삽입해 줍니다.
//	• input.nextLine();
//	• input.skip("[\\r\\n]+");
//	• 정수를 문자열로 입력받는 방법 (그래서 입력시 화이트문자가지 입력받아옵니다.)


public class ConsoleInputEx05 {

	public static void main(String[] args) {

	java.util.Scanner input = new java.util.Scanner(System.in);

	//문제발생
//	System.out.println("정수입력 > ");
//	int n = input.nextInt();
//	System.out.println("n: " + n);
//	System.out.println("원하는 요일을 입력하세요(영문 소문자) > ");
//	String str = input.nextLine();
//	System.out.println("str: " + str);
	//콘솔입력을 받는게 아니라 버퍼에 있는 데이터를 가져오게 된다. 즉, 버퍼에 있는 \n문자를 가져오게 됩니다
	//숫자형 데이터 입력을 받은 직후 문자를 입력받아야 한다면 버퍼를 비워준후 입력을 받아야 합니다.
	
	
	//방법 1 - input.nextLine();
	System.out.println("정수입력 > ");
	int n = input.nextInt();
	System.out.println("n: " + n);
	System.out.println("원하는 요일을 입력하세요(영문 소문자) > ");
	
	input.nextLine();	//버퍼비우기 
						//버퍼에 입력된 문자열을 개행문자 \n 까지 가져오기
	String str = input.nextLine();
	System.out.println("str: " + str);

	
	
	//방법 2 - input.skip("[\\r\\n]+");
//	System.out.println("정수입력 > ");
//	int n = input.nextInt();
//	System.out.println("n: " + n);
//	System.out.println("원하는 요일을 입력하세요(영문 소문자) > ");
//	
//	input.skip("[\\r\\n]+");	//버퍼비우기
//								//입력 버퍼에 남아있는 개행문자 '\r\n' 제거하기
//	String str = input.nextLine();
//	System.out.println("str: " + str);

	
	
	//방법 3 - input.nextLine() & Integer.parseInt()
//	System.out.println("정수입력 > ");
//	
//	String s_num = input.nextLine();    // 입력받을 숫자를 문자열로 입력받고
//	int i_num = Integer.parseInt(s_num);    // 형변환 시켜준다
//	System.out.println("i_num > " + i_num);
//		
//	System.out.println("원하는 요일을 입력하세요(영문 소문자) > ");
//	String str = input.nextLine();
//	System.out.println("str> " + str);
	
	input.close();
	}
}
	
//----------------------------------------------------------	
	//방법 -안됨, IOException처리 필요
//	System.out.println("정수입력 > ");
//	int n = input.nextInt();
//	System.out.println("n: " + n);
//	System.out.println("원하는 요일을 입력하세요(영문 소문자) > ");
//	
//	System.in.read(); System.in.read(); //버퍼비우기
//	//표준 입력 메소드인 System.in.read()는 표준 입력 장치인 키보드로부터 한 개의 단순 문자를 입력받아 임시 메모리 버퍼에 저장되어져 있는 데이터를 읽어 들입니다.
//	//이때에 입력 버퍼에 남아있는 개행문자 '\r\n' 을 완전히 제거하기 위해서는 System.in.read() 입력을 두 번 더 사용해야 한다.
//	String str = input.nextLine();
//	System.out.println("str: " + str);
	
	
	//방법 -안됨, IOException처리 필요
//	System.out.println("정수입력 > ");
//	int n = input.nextInt();
//
//	System.out.println("n: " + n);
//	System.out.println("원하는 요일을 입력하세요(영문 소문자) > ");
//	
//	System.in.skip(System.in.available());//버퍼비우기
//	System.in.skip(2); //버퍼비우기
//	
//	String str = input.nextLine();
//	System.out.println("str: " + str);
//
