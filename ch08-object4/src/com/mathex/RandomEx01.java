//무작위 숫자 추출 - java.lang.Math.random()
   
//Math.random()의 랜덤한 수확인  (0.0 ~1.0미만의 난수(0.0~0.9999999999999) 발생)
//double형의 무작위 랜덤 수를 int형으로 연산처리하기
//0.0 ~ 0.9

package com.mathex;

public class RandomEx01 {

	public static void main(String[] args) {
		//					0		  1		   2 		  3		   4
		String[] gift = {"스마트폰", "노트북", "디지털카메라", "테블릿", "대박(꽝)"};
		
		double random= Math.random();
		//0.0 ~1.0미만의 난수(0.0~0.999999999999999999) 17개(9)
		System.out.println(random);
		
		//double을 int형식으로 연산처리하기
		int idx = (int)(random*5);	//캐스팅하면 무조건 절삭(int) -> 0~4까지 난수(*5)
		System.out.println("발생한 난수: " + idx);
		System.out.println("발생한 난수: " + gift[idx]);
	}
}	
//== 5단 == 
//5X1 = 5	5X0.1 = 0.5
//5X2 = 10	5X0.2 = 1.0
//5X3 = 15	5X0.3 = 1.5
//5X4 = 20	5X0.4 = 2.0
//5X5 = 25	5X0.5 = 2.3
//5X6 = 30	5X0.6 = 3.0
//5X7 = 35	5X0.7 = 3.5
//5X8 = 40	5X0.8 = 4.0
//5X9 = 45	5X0.9 = 4.5



/*//출력결과
0.23245377413492196
발생한 난수: 1
발생한 난수: 노트북
*/