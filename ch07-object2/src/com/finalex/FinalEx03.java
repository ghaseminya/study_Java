/* 클래스에 final 적용
 * 
 * JAVA API에서 final적용 예)
 * JAVA의 기본클래스는 상속 안 시키게 하였습니다. 
 * 왜냐하면. 원형 그대로 사용하게 하기 위해서 입니다. (기본적인 처리)
 * public final class String
 * public final class System
 *  
 * */


package com.finalex;

//클래스에 final을 명시하면 상속되지 않습니다.
/*final class Me{
	int a = 100;
}*/

class Me{
	int a = 100;
}

// ERROR: The type FinalEx03 cannot subclass the final class Me
public class FinalEx03 extends Me{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
