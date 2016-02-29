package lambda02;

import java.util.ArrayList;
import java.util.List;

/* 익명내부 클래스
같은 검색조건에 대해 익명 클래스를 이용하면 별도 클래스를 만들 필요가 없으므로 코드가 조금 더 짧아집니다.

 */
public class CarDealer03 {

	public static void main(String[] args){
		List<Car> cars = new ArrayList<>();
		cars.add( new Car("작은차",2,800,3) );
		cars.add( new Car("봉고차",12,1500,8) );
		cars.add( new Car("중간차",5,2200,0) );
		cars.add( new Car("비싼차",5,3500,1) );

		printCar(cars, 
				//인터페이스 CheckCar를 구현하는 익명클래스를 만듭니다.
				new CheckCar(){
			public boolean test(Car car){
				return car.capacity >= 4 && car.price < 2500;
			}
		});
	}

	public static void printCar(List<Car> cars, CheckCar tester){
		for(Car car : cars){
			if (tester.test(car)) {
				System.out.println(car);
			}
		}
	}

	interface CheckCar{
		boolean test(Car car);
	}  

}
