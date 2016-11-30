//형 변환

public class OperatorEx03 {
	public static void main(String[] args){
		
		int a = 10;
		float b = 10.0F;
		
		// int == float
		if( a == b){	
			//a: int -> float (10 -> 10.0F)
			//10.0F == 10.0F
			//b: 10.0F
			System.out.println("a와 b는 같다.");
			System.out.println("a : " + a);	//a : 10
			System.out.println("b : " + b);	//b : 10.0
		}
/*
a와 b는 같다.
a : 10
b : 10.0
*/
		
		System.out.println("");
		char c ='0';
		int d = 0;
		//char != int
		if(c != d){		//char -> int ('0' -> 48)
						//2byte -> 4byte
			//48 != 0
			System.out.println("c와 d는 같지 않다.");
			System.out.println("c : " + c);	//c : 0
			System.out.println("d : " + d);	//d : 0
		}
/*
c와 d는 같지 않다.
c : 0
d : 0
*/
		
		System.out.println("");
		//char == int
		char e = 'A'; 
		int f= 65;
		if( e == f){	//char -> int ('A' -> 65)
			//65 == 65
			System.out.println("e와 f는 같다.");
			System.out.println("e : " + e);	//e : A
			System.out.println("f : " + f);	//f : 65
		}
	}
}

/*
e와 f는 같다.
e : A
f : 65
*/