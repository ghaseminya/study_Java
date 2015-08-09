//최대값 및 최소값 구하기
//배열에 저장된 값중 최대값과 최소값만 출력하기
//LAB

public class ArrayEx03 {

	public static void main(String[] args) {
		
		//암시적 배열 생성
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		//배열안의 값을 기준으로 해야 최대값/최소값을 정확하게 구할 수 있다.
		//배열의 인덱스는 0부터 시작
		int max=score[0];
		int min=score[0];
		
		//최대값, 최소값 구하기
		for( int i=1 ; i < score.length; i++){			
			if(score[i] > max){
				max = score[i];
			}
			if(score[i] < min){								
				min = score[i];
			}		
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
