/* °´Ã¼ »ı¼º - ¸â¹ö ¸Ş¼Òµå È£Ãâ
 * 
 */

public class Student2 {	
	
	//¸â¹ö º¯¼ö
	String name;
	int korean;
	int math;
	int english;
	int sum;
	int avg;	

	//ÃÑÁ¡ ¸â¹ö ¸Ş¼Òµå
	public int sum(int a, int b, int c){
		return a+b+c;
	}	
	
	//Æò±Õ ¸â¹ö ¸Ş¼Òµå
	public float avg(int a){
		return  a/3;
	}
	
	public static void main(String[] args) {
			
		Student2 student = new Student2();
				
		student.name = "±è¿¬¾Æ";
		student.korean = 100;
		student.math = 90;
		student.english = 80;
		student.sum = student.korean + student.math + student.english;
		student.avg = student.sum / 3;
		

		System.out.println("ÀÌ¸§" + "\t" +  
				"±¹¾î" + "\t" + 
				"¼öÇĞ" + "\t" + 
				"¿µ¾î" + "\t" + 
				"ÃÑÁ¡" + "\t" + 
				"Æò±Õ");
		
		System.out.println(student.name + "\t" +  
				student.korean + "\t" + 
				student.math + "\t" + 
				student.english + "\t" + 
				student.sum + "\t" + 
				student.avg);
	}
}
