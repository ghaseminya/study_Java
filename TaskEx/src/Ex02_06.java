
public class Ex02_06 {
	public static void main(String[] args){
		
		/*1) 10, 20, 30, 40, 50을 초기값으로 갖는 1차원 배열을 test란 이름으로 선언하라.
		2) 배열의 3번째 원소(인덱스가 2)인 원소를 출력하라.
		3) 반복문을 사용하여 모든 원소를 출력하라.
		4) 4번 째 원소(인덱스가 3)의 값을 100으로 변경하라.
		5) 마지막 원소의 값을 200으로 변경하라.
		6) 반복문을 사용하여 모든 원소를 0으로 초기화하라. */
		
		int[] test = new int[5];
		
		
//		1) 10, 20, 30, 40, 50을 초기값으로 갖는 1차원 배열을 test란 이름으로 선언하라.
		for(int i=0; i<test.length; i++){
			for(int gab=10; gab <60; gab+=10){
				test[i]=gab;
			}			
		}		
		
//		2) 배열의 3번째 원소(인덱스가 2)인 원소를 출력하라.		
		System.out.println("인덱스가 2인 원소의 값 : " + test[2]);
		
		
//		3) 반복문을 사용하여 모든 원소를 출력하라.
		for(int i=0; i<test.length; i++){
			System.out.println("test["+ i + "]: " + test[i]);			
		}
		
		
//		4) 4번 째 원소(인덱스가 3)의 값을 100으로 변경하라.
		System.out.println("인덱스가 3인 원소의 값(변경 전) : " + test[3]);
		test[3] = 100;		
		System.out.println("인덱스가 3인 원소의 값(변경 후) : " + test[3]);
		
		
//		5) 마지막 원소의 값을 200으로 변경하라.
		System.out.println("마지막 인덱스 값(변경 전) : " + test[test.length-1]);
		test[test.length-1] = 200;		
		System.out.println("마지막 인덱스 값(변경 후) : " + test[test.length-1]);

		
//		6) 반복문을 사용하여 모든 원소를 0으로 초기화하라.
		for(int i=0; i<test.length; i++){
			test[i] = 0;
			System.out.println("test[" + i + "] = " +test[i]);
		}
		
	}
}
