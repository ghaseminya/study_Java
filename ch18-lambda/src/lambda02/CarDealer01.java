package lambda02;
/*
main에서는 다양한 조건의 Car객체를 만들어서 cars라는 리스트 생성합니다.
cars 리스트에 있는 차를 검색해서 조건에 맞는 차를 출력하는 예제

가격이 2000보다 싼 차량을 검색해서 이름을 출력하는 showCarCheaperThan이라는 함수가 있습니다.
*/

import java.util.ArrayList;
import java.util.List;

public class CarDealer01 {
	
	public static void showCarCheaperThan(List<Car> cars, int price){
	    for(Car car : cars){
	      if(car.price < price){
	        System.out.println(car);
	      }
	    }
	  }

	public static void main(String[] args) {

		//Car객체를 만들어서 cars에 넣습니다.
	    List<Car> cars = new ArrayList<>();
	    cars.add( new Car("작은차",2,800,3) );
		cars.add( new Car("봉고차",12,1500,8) );
		cars.add( new Car("중간차",5,2200,0) );
		cars.add( new Car("비싼차",5,3500,1) );

	    showCarCheaperThan(cars, 2000);
	}

}
