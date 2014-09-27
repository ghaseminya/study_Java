
public class EscapeSequenceEx01 {

	public static void main(String[] args) {
		//System.out.println("나의 이름은 "홍길동"이라고 합니다.");
		//안의 끝 따음표를 문자열 시작과 끝으로만 인식하여 Error
		
		System.out.println("나의 이름은 \"홍길동\"이라고 합니다.");
		// \"	:문자열 내에서 큰 따음표로 인식(")
	}

}
