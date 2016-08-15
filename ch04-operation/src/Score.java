/*
//성적처리프로그램
 
 한글 변수 사용, 
 데이터검증(중요), 
 소숫점자리 포멧지정 (소수점이하 2째자리까지)

//-------------------------
//유효한 점수 인지 체크하기 (과목별로 )한후  유효한 점수 인지 체크하기 (과목 전체)로 바꿔보기
*/

public class Score {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int 국어 = 0, 영어 = 0, 수학 = 0, 총점 = 0;
		char  학점;
		float 평균1;
		float 평균2;		
		
		//유효한 점수 인지 체크하기 (과목 전체)
		/*do{
			System.out.print("국어 : ");
			국어 = input.nextInt();
			
			System.out.print("영어 : ");
			영어 = input.nextInt();
			
			System.out.print("수학 : ");
			수학 = input.nextInt();
			
			
		}while(국어 < 0 || 국어 > 100  ||
				영어 < 0 || 영어 > 100 ||
				수학 < 0 || 수학 > 100);*/
		
		
		//유효한 점수 인지 체크하기 (과목별로 ) - 데이터 검증 (중요)
		do{
			System.out.print("국어 : ");
			국어 = input.nextInt();
		}while(국어 < 0 || 국어 > 100);
		
		do{
			System.out.print("영어 : ");
			영어 = input.nextInt();
		}while(영어 < 0 || 영어 > 100);
		
		do{
			System.out.print("수학 : ");
			수학 = input.nextInt();
		}while(수학 < 0 || 수학 > 100);				
		
		총점 = 국어 + 영어 + 수학;
		
		
		//데이터 처리
		//float = int / int;
		평균1 = 총점/3;				// int -> float 형변환 (65 -> 65.0)
		평균2 = (float)총점/3.0F;	// int -> float 형변환 (65 -> 65.0)
		//평균2 = 총점/3.0F;			// int -> float 형변환 (65 -> 65.0), 상동		
		
		System.out.println();
		System.out.println("총점 = " + 총점);
		System.out.println("평균1 = " + 평균1);
		//System.out.println("평균2 = " + 평균2);	//출력 후 줄바꿈
		System.out.printf("평균2 = %.2f \n", 평균2);	//출력할 데이터의 포멧 지정, SDK ver5.0이상	
		
		//등급 판별
		switch((int)평균2/10){
			case 10:
			case 9:{
				학점 = 'A';
				break;
			}
			
			case 8:{
				학점 = 'B';
				break;	
			}
			case 7:{
				학점 = 'C';
				break;
			}
			case 6:{
				학점 = 'D';
				break;
			}
			default:{
				학점 = 'F';
				break;			
			}
		}
		
		System.out.println("학점 = " + 학점);
		
		input.close();
	}
}
