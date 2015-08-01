//객체 생성 - 멤버 메소드 호출
//데이터를 표준입력받아서 처리하기


public class Student3 {	
	
	String name;
	int korean;
	int english;
	int math;
	
	//총점
	public int getSum(){
		return korean + english + math;		
	}
	
	//평균
	public int getAvg(){
		return getSum()/3;
	}
	
	//출력
	public void gPrint(String str){
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Student3 nStu = new Student3();
				
		nStu.gPrint("국어 점수를 입력하세요 > ");
		nStu.korean = input.nextInt();
		
		nStu.gPrint("영어 점수를 입력하세요 > ");
		nStu.english = input.nextInt();
		
		nStu.gPrint("수학 점수를 입력하세요 > ");
		nStu.math = input.nextInt();
		
		input.close();	//자원 해제
		
		
		System.out.println();
		nStu.gPrint("국어 점수: " + nStu.korean);
		nStu.gPrint("수학 점수: " + nStu.math);
		nStu.gPrint("영어 점수: " + nStu.english);		
				
		System.out.println();
		nStu.gPrint("총점은 > " + nStu.getSum()); 
		
		System.out.println();
		nStu.gPrint("평균은> " +nStu.getAvg());		
	}
}
