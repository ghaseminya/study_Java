package lambda02;

import java.util.ArrayList;
import java.util.List;

/* 람다
같은 검색조건에 대해 람다를 이용하면 메소드 지정도 필요 없으므로 더 간결하게 표현할 수 있습니다.

내부클래스, 익명클래스, 람다가 불필요하게 복잡해 보일 수 있지만 다양한 기능을 구현하다보면 람다를 쓰는게 더 효율적일 수 있습니다.
 */

public class CarDealer04 {

	public static void main(String[] args){
		//Car객체를 만들어서 cars에 넣습니다.
		List<Car> cars = new ArrayList<>();
		cars.add( new Car("작은차",2,800,3) );
		cars.add( new Car("봉고차",12,1500,8) );
		cars.add( new Car("중간차",5,2200,0) );
		cars.add( new Car("비싼차",5,3500,1) );

		CarDealer04 carDealer04 = new CarDealer04();
		carDealer04.printCar(cars, 
				//인터페이스 CheckCar의 test메소드에 대응하는 람다를 만듭니다.
				(Car car) -> { return car.capacity >= 4 && car.price < 2500; }
				);
	}

	public void printCar(List<Car> cars, CheckCar tester){
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
