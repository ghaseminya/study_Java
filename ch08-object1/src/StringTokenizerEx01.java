import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	StringTokenizer st;
	
	public StringTokenizerEx01(String str){
		System.out.println("str : " + str);
		st = new StringTokenizer(str);
	}
	public StringTokenizerEx01(String str, String delim){
		System.out.println("str : " + str);
		st = new StringTokenizer(str, delim);
	}
	
	public void print(){
		System.out.println("Token count : " + st.countTokens());
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("-----------------------------");
	}

	public static void main(String[] args) {

//		String s1="Happy day";
//		StringTokenizerEx01 st1 = StringTokenizerEx01(s1);		
		StringTokenizerEx01 st1 = new StringTokenizerEx01("Merry Christmas!!!");

		st1.print();
		StringTokenizerEx01 st2 = new StringTokenizerEx01("2020/12/25", "/");
		st2.print();
	}
	

}
