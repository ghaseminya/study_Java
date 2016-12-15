//로또 프로그램 만들기 - 배열이용 - 방법1

//1) 6개의 숫자(배열) 저장
//2) 난수 발생 (1~45)
//3) 중복을 확인하면서 중복되지 않은 데이터만 배열에 삽입
 

package com.lottoarray;

public class LottoArray1 {

	public static void main(String[] args) {
		// 1) 6개의 숫자(배열) 저장할 배열 생성
		int[] lotto = new int[6]; // 0 1 2 3 4 5 
		
		// 2) 난수 발생 (1~45)
		//(int)(Math.random()*45) + 1;	//0~44난수 발생하므로 +1
		
		// 3) 중복을 확인하면서 중복되지 않은 데이터만 배열에 삽입
		for(int i = 0; i < lotto.length; i++){	//배열에 난수 삽입 (6번)
			//lotto[i] = (int)(Math.random()*45) + 1;
			
			int tmp = (int)(Math.random()*10) + 1;
			
			if(i == 0){
			   lotto[i] = tmp;			   
			}
			else{
			   for(int j=0; j< i; j++){				   	
				   	
					if( lotto[j] != tmp){ //중복이 아닌 경우
						lotto[i] = tmp;	
//						System.out.println("lotto[" +j +"]:"+lotto[j]+ "\t"+ "tmp:" +  tmp);
					}				
					else{ //중복인 경우
//						System.out.println("lotto[" +j +"]:"+lotto[j]+ "\t"+ "tmp:" +  tmp + " -> 같습니다");
						i--; //중복되면 i값 증가를 막는다
						break; //이미 중복값을 확인했기 때문에 반복문 탈출
					}
				}						   
			}
//			System.out.println("-------------------------------");
		}
		
		System.out.println("lotto 번호 추출: ");
		for(int i =0; i < lotto.length; i++){
			System.out.println("lott["+i+"]: " + lotto[i]);
		}
		
		System.out.println("\nlotto 당첨번호: ");
		for(int i =0; i < lotto.length; i++){
			System.out.print(lotto[i] + "  " );
		}		
	}
}


/*//출력결과
-------------------------------
lotto[0]:5	tmp:1
-------------------------------
lotto[0]:5	tmp:10
lotto[1]:1	tmp:10
-------------------------------
lotto[0]:5	tmp:10
lotto[1]:1	tmp:10
lotto[2]:10	tmp:10 -> 같습니다
-------------------------------
lotto[0]:5	tmp:6
lotto[1]:1	tmp:6
lotto[2]:10	tmp:6
-------------------------------
lotto[0]:5	tmp:8
lotto[1]:1	tmp:8
lotto[2]:10	tmp:8
lotto[3]:6	tmp:8
-------------------------------
lotto[0]:5	tmp:2
lotto[1]:1	tmp:2
lotto[2]:10	tmp:2
lotto[3]:6	tmp:2
lotto[4]:8	tmp:2
-------------------------------
lotto 번호 추출: 
lott[0]: 5
lott[1]: 1
lott[2]: 10
lott[3]: 6
lott[4]: 8
lott[5]: 2

lotto 당첨번호: 
5  1  10  6  8  2  
*/
