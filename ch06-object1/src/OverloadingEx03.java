
public class OverloadingEx03 {

	public static void main(String[] args) {
		OverloadingEx03 oe3 = new OverloadingEx03();

		oe3.getLength(1000);
		oe3.getLength(3.14f);
		oe3.getLength("10000");

	}



	public void getLength(int n){
		String s = String.valueOf(n);
		getLength(s);
	}
	void getLength(float n){
		String s = String.valueOf(n);
		getLength(s);
	}
	private int getLength(String str){
		System.out.println("입력한 값의 길이 : "+str.length());
		return 0;

	}
}