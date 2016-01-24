/*
자바 8버전으로 쓰레드 생성하기

lambdaEx01.java -> 람다식으로 변경
*/
public class lambdaEx02 {
	
	public static void main(String[] args) {
		//람다식
		new Thread(()->{
			System.out.println("JavaEight Thread!");
		}).start();
	}

}
