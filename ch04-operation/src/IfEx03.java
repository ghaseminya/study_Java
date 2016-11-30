/* //LAB
조건문 - 다중 if문 (성적 등급 처리)
단일 if문 학점 출력한 후 다중 if문으로 변환하기


[학점 등급표]
100~90	A
89~80	B
79~70	C
69~60	D
59~0	F

//--------------------------------------------

if~else if문
	• 중간에 else if가 추가된 만큼 if~else문이 중첩된 형태입니다.
	• if의 분기조건이 세 개 이상이 되는 경우에 사용
	• 조건 만족 여부에 따라서 하나의 수행영역만 실행됩니다.


[if~else if문 형식]
if(true or false){
     //true시 수행되는 영역
}else if(true or false){
     //true시 수행되는 영역
}else if(true or false){
     //true시 수행되는 영역
}else if(true or false){
     //true시 수행되는 영역
}else if(true or false){
     //true시 수행되는 영역
}else if(true or false){
     //true시 수행되는 영역
}else{
     //false시 수행되는 영역
}

*/
public class IfEx03 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade; //char grade ='?'; //초기화 필요할 수 있습니다.
		
		System.out.print("성적을 입력하세요 > ");
		//nextInt(): 입력값을 int형으로 가져온다
		score = input.nextInt();
		
		//if~else로 구현한 코드
		if( score >= 90 && score <=100 ){
			grade ='A';
		}else if(score >= 80 && score <=89){
			grade ='B';
		}else if(score >= 70 && score <=79){
			grade ='C';
		}else if(score >=60 && score <=69){
			grade = 'D'; 
		}else if(score < 60){
			grade ='F';			
		}else{
			grade ='?';
			System.out.println("성적을 다시 입력하세요.");
		}
		
		//if로 구현한 코드
//		if( score >= 90 && score <=100 ){
//			grade ='A';
//		}if(score >= 80 && score <=89){
//			grade ='B';
//		}if(score >= 70 && score <=79){
//			grade ='C';
//		}if(score >=60 && score <=69){
//			grade = 'D'; 
//		}if(score < 60){
//			grade ='F';			
//		}else{
//			grade ='?';
//			System.out.println("성적을 다시 입력하세요.");
//		}
		
		
		System.out.println("성적 : " + score);
		System.out.println("등급: " + grade);
		
		input.close();
	}
}

/*
성적을 입력하세요 > 88
성적 : 88
등급: B


if~else과 if을 같이 쓸 경우 아래와 같이 나옵니다. 
성적을 입력하세요 > 88
성적을 다시 입력하세요.
성적 : 88
등급: ?

*/