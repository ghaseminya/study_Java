//TODO 1: 비교인자값 1씩 감소 증가시키기
//TODO 2: 비교인자값 2씩 증가 시키기 (방법1)
//TODO 3: 비교인자값 2씩 증가 시키기 (방법2)

public class ForEx02 {

	public static void main(String[] args) {
		
		//TODO 1: 비교인자값 감소
		//초기값 5인 for문
		System.out.println("비교 인자값 1씩 감소 시키기:");
		for(int i=5; i>=1; i--){
			System.out.print("\t"+ i);
		}
		System.out.println();
		System.out.println("\t프로그램 종료!");
		
		
		//--------------------
		//TODO 2: 비교인자값 2씩 증가시켜서 출력시키기 방법2
		System.out.println();
		System.out.println("비교 인자값 2씩 증가시키기 2:");
		for(int i=0; i<=10; i++){
			if(i%2 == 0){
				System.out.print("\t"+ i);
				}					
		}
		System.out.println();
		System.out.println("\t프로그램 종료!");
		
		
		//LAB
		//TODO 3: 비교인자값 2씩 증가시켜서 출력시키기 방법1
		//초기값은 0 
		//10보다 작은 동안 for문 수행
		System.out.println();
		System.out.println("비교 인자값 2씩 증가시키기 1:");
		for(int i=0; i<=10; i+=2){
			System.out.print("\t"+ i);					
		}
		System.out.println();
		System.out.println("\t프로그램 종료!");

	}
}


//출력결과
//비교 인자값 1씩 감소 시키기:
//	5	4	3	2	1
//	프로그램 종료!
//
//비교 인자값 2씩 증가시키기 1:
//	0	2	4	6	8	10
//	프로그램 종료!
//
//비교 인자값 2씩 증가시키기 2:
//	0	2	4	6	8	10
//	프로그램 종료!
