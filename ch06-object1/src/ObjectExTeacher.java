/*
public class ObjectExTeacher {

}



public class ObjectEx01 {

	public static void main(String[] args) {

	}

}

class Teacher{
	final int JAVA_CHAPTHER = 12;
	int numOfJavaChapter = 12;
	int teachedNumber = 0;
	int result = 0;
	
	public int teach(int chapter){
		int result = JAVA_CHAPTHER - chapter;
		numOfJavaChapter -= result;
		return result;
	}
	
	public void showLecture(){
		System.out.println("현재 JAVA강의 수: " + teachedNumber + "번째 강의" );
		System.out.println("남은 강의 수: " + scope + "장씩 나갑니다." );
	}
	
}


class Student{
	int numOfJavaKnowlege = 0;
	int learnedNumber = 0;
	
	public void learnJava(Teacher teacher, int chapter){
		numOfJavaKnowlege += teacher.teach(chapter);
		learnedNumber++;
	}
	
	public void showStudy(){
		
	}
}
*/