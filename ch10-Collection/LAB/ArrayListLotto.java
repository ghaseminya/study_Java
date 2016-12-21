/* Lotto 프로그램 - ArrayList 

contains()메소드를 이용해서 중복체크
Colloections.sort() 메소드를 이용해서 정렬

 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListLotto {

	public static void main(String[] args) {
		
		//ArrayList 객체 생성
		List<Integer> list = new ArrayList<Integer>();
		
		//Random 객체 생성
		Random random = new Random();		
		
		//객체 생성 및 초기화
		Integer it = null;
		
		
		//조건 체크		
		while(list.size() < 6){
			//난수 생성후 Integer 타입으로 저장
			it = new  Integer(random.nextInt(45)+1);	// 1~45
			
			//contains()메소드를 이용해서 중복체크
			if(!list.contains(it)){ //포함되어 있지 않으면 list에 추가
				list.add(it);
			}
		}
		
		//Colloections.sort() 메소드를 이용해서 정렬
		Collections.sort(list);;
		
		//출력
		for(Integer i : list){
			System.out.println(i);
		}
	}
}