/*
자바 7버전으로 쓰레드 생성하기

*/
public class lambdaEx01 {
	
	//클래스 정의
	public static class JavaSeven implements Runnable{

		@Override
		public void run() {
			System.out.println("JavaSeven Thread!");
		}
		
	}
	
	
	public static void main(String[] args) {
		//new JavaSeven() 생성자 호출을 통해 객체 생성
		new Thread(new JavaSeven()).start();
	}
}
