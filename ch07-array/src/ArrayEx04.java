//1차원 배열을 이용하여 한명에 대한 성적처리 프로그램 

public class ArrayEx04 {

	public static void main(String[] args) {
		
		//총점
		int sum=0;
		
		//평균 (결과값 확인을 위해 변수 2개 선언, 강제형변환한것과 안한것 결과값 확인)
		float average1 = 0.0F; //강제형변환 안한 값 저장
		float average2 = 0.0F; //강제형변환한 값 저장
		
		//배열 선언 및 생성, 초기화 (암시적 배열 생성)
		int[] score = {100, 88, 88, 100, 90};
		
		//총점 구하기
		for(int i=0; i < score.length; i++){
			sum += score[i];
		}
		
		//평균 구하기
		average1 = sum/score.length;
		average2 = (float)sum/score.length;	// int -> float
		
		System.out.println("average1 : " + average1); //average1 : 93.0
		System.out.println("average2 : " + average2); //average2 : 93.2
		
		System.out.println();
		System.out.println("총점 : " + sum); //총점 : 466
		System.out.println("평균 : " + average2); //평균 : 93.2
		
		System.out.println(score.length); //5
//		System.out.println(score[score.length]);
		//배열의  index요소를 넘어서 접근하려고 하기 때문에 예외가 발생합니다. score[5]
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	}
}


//출력결과
//average1 : 93.0
//average2 : 93.2
//
//총점 : 466
//평균 : 93.2