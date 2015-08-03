//원의 넓이와 길이를 소수점을 지정하여 출력

import java.text.DecimalFormat;
import java.util.Scanner;

public class VariableEx09 {

	public static void main(String[] args)
	{
		int radius;
		double area, circumference;

		Scanner scan = new Scanner(System.in);

		// 원의 반지름을 입력받는다.
		System.out.print("원의 반지름을 입력하세요 : ");
		radius = scan.nextInt();

		// 원의 넓이 : 반지름의 제곱 * 파이
		area = Math.PI * Math.pow(radius, 2);

		// 원의 길이 : 지름(반지름*2) * 파이
		circumference = 2 * Math.PI * radius;


		// 원의 넓이와 길이 값을 출력한다.
		System.out.println("원의 넓이 : " + area);
		System.out.println("원의 길이 : "+circumference);
		System.out.println("");


		// DecimalFormat으로 "0.###" 패턴을 생성한다.
		DecimalFormat fmt = new DecimalFormat("0.###");

		System.out.println("Format 적용 후 (0.###)");

		// 원의 넓이와 길이에 "0.###" 패턴을 적용하여 출력한다.
		System.out.println("원의 넓이(Format적용) : " 
				+ fmt.format(area));
		System.out.println("원의 길이(Format적용) : "
				+ fmt.format(circumference));
		System.out.println("");



		// DecimalFormat 패턴을 "000.#" 으로 변경한다.
		fmt.applyPattern("000.#");

		System.out.println("Format 변경 후 (000.#)");

		// 원의 넓이와 길이에 "000.#" 패턴을 적용하여 출력한다.
		System.out.println("원의 넓이(Format 변경 후) : " 
				+ fmt.format(area));
		System.out.println("원의 길이(Format 변경 후) : "
				+ fmt.format(circumference));
	}
}
