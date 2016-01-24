/*
람다식을 만드는 기본적인 표현 방법


*/
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

public class lambdaEx07 {

	public static void main(String[] args) {

		//인자가 전혀 없는 람다식
		//‘()’와 같이 비어 있는 소괄호를 사용하여 인자가 없다는 것을 나타낸다. 
		//이 람다식은 Runnable 인터페이스(이것의 메소드는 run이다)를 구현하는 하나의 함수로, 인자 없이 실행되고 반환 타입은 void
		Runnable noArguments = () -> System.out.println("Hello World");

		
		//빈 괄호가 제거되고 하나의 인자를 가지는 람다식
		ActionListener oneArgument = event -> System.out.println("button clicked");

		
		//간단한 한 줄짜리 람다식을 사용하지 않고, 중괄호({})로 둘러싸인 람다식
		//중괄호({})로 둘러싸인 하나의 큰 코드 블록을 사용한다. 이 함수 블록은 일반 함수와 동일한 규칙을 따른다.
		//필요한 값을 반환할 수도 있고 예외를 블록 밖으로 던질 수도 있습니다. 
		//물론, 한 줄짜리 람다식에서도 중괄호로 람다식의 시작과 끝을 분명히 해줄 수 있습니다.
		Runnable multiStatement = () -> { 
			System.out.print("Hello");
			System.out.println("World");
		};

		//하나 이상의 인자를 가진 메소드를 표현하는 람다식
		//두 숫자를 더하는 코드가 아니라 두 숫자를 더해서 반환하는 함수를 생성합니다.
		//즉, add는 두 숫자를 더한 결과값을 가지는 BianryOperator<Long> 타입의 변수가 아니라 두 수를 더해서 반환하는 함수
		BinaryOperator<Long> add = (x, y) -> x + y;
		
		
		//인자의 타입을 명시하는 람다식
		//람다식의 타입은 컴파일러가 자동으로 추론하지만, 때로는 타입을 직접 명시하는 편이 좋습니다. 
		//명시하려면 인자를 소괄호로 감싸주면 되고, 여러 개의 인자	를 사용할 때에는 반드시 괄호 안에 넣어야 합니다.
		//람다식 자체의 타입은 해당 람다식이 사용된 문맥에서의 타입을 나타냅니다. 
		//다시 말하면 람다식에 설정된 지역 변수의 타입이나 람다식이 넘겨지는 함수 파라미터의 타입이 됩니다.
		//람다식의 타입은 코드의 맥락에 따라 결정되고, 컴파일러에 의해 추론된다
		BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
		
	}
}
