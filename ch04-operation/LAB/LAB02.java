/* //LAB
//성적등급 처리하기
//	• case레이블을 하나의 그룹으로 묶어서 처리하기
//	• char형 조건값 비교하기


제한사항
	• 정수를 입력받아서 해당하는 성적의 등급을 표시하세요
	• 10점단위로 등급 구분하고 60점 미만은 F학점 처리
98/10=9
83/10=8, 84/10=8


학점 등급표
100~90		A
89~80		B
79~70		C
69~60		D
59~0		F




예상출력결과
정수형 성적을 입력하세요 >
95
성적: 95
등급: A


//--------------------------------

[switch 다른 응용 형식]
	• 조건값1 , 조건값2, 조건값3인 경우를 하나의 그룹으로 묶어 처리하고
	• 조건값4, 조건값5인 경우를 또 하나의 그룹으로 묶어서 처리하고
	• 조건값6인 경우를 하나의 경우로 처리하게 됩니다.

switch(인자값) {
case 조건값1 : 
case 조건값2 :
case 조건값3 :
        수행문; 
        break;
case 조건값4 :
case 조건값5 :
        수행문; 
        break;
case 조건값6 :
        수행문; 
        break; 
}
*/
public class LAB02 {

	public static void main(String[] args) {
		// switch()문 (성적 등급 처리하기)
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score; //점수
		char grade; //등급
		
		System.out.println("정수형 성적을 입력하세요 > ");
		score = input.nextInt();
		
		//score/10	: 27/10 = 2
		//System.out.println(score/10);
		switch(score/10){
		case 10: // break문은 조건값마다 넣어주는 것을 권장하며 만약 없을 시에는 
				 // 다음 break문을  만날 때까지 모든 수행문을 처리합니다
		case 9:{
			// 10, 9레이블을 하나의 그룹으로 묶어서 처리하게 됩니다.
			grade ='A';
			break;
		}
		case 8:{
			grade ='B';
			break;
		}
		case 7:{
			grade ='C';
			break;
		}
		case 6:{
			grade ='D';
			break;
		}
		default:
			grade ='F';			
		}
		
		System.out.println("성적 : " + score);
		System.out.println("등급: " + grade);
		
		input.close();
	}
}
