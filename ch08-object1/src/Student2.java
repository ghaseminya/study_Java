//객체 생성 - 멤버 메소드 호출

public class Student2 {	
	
	//멤버 변수
	String name;
	int korean;
	int math;
	int english;
	int sum;
	int avg;	

	//총점 멤버 메소드
	public int sum(int a, int b, int c){
		return a+b+c;
	}	
	
	//평균 멤버 메소드
	public float avg(int a){
		return  a/3;
	}
	
	public static void main(String[] args) {
			
		Student2 student = new Student2();
				
		student.name = "김연아";
		student.korean = 100;
		student.math = 90;
		student.english = 80;
		student.sum = student.korean + student.math + student.english;
		student.avg = student.sum / 3;
		

		System.out.println("이름" + "\t" +  
				"국어" + "\t" + 
				"수학" + "\t" + 
				"영어" + "\t" + 
				"총점" + "\t" + 
				"평균");
		
		
		System.out.println(student.name + "\t" +  
				student.korean + "\t" + 
				student.math + "\t" + 
				student.english + "\t" + 
				student.sum + "\t" + 
				student.avg);
		
	}
}
