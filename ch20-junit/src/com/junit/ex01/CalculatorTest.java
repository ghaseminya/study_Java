package com.junit.ex01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		//fail("Not yet implemented");
		
		double result;
		
		//Calculator.sum(a,b)를 통해서 두수를 더한 값을 반환
		//예시 값으로 임의의 값 사용 (a:4, b:5)
		result = Calculator.sum(4,  5);
		//assertTrue를 통해 result가9 인지 확인
		assertTrue("The result should be 9.", (result==9));
	}

	@Test
	public void testSubstract() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.substract(5,  4);
		assertTrue("The result should be 1.", (result==1));
	}

	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.multiply(4,  5);
		assertTrue("The result should be 20.", (result==20));
	}

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.divide(15,  3);
		assertTrue("The result should be 5.", (result==5));
	}

	@Test
	public void testCeil() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.ceil(3.6);
		assertTrue("The result should be 4.", (result==4));
	}

	@Test
	public void testFloor() {
		//fail("Not yet implemented");
		
		double result;
		//내림 함수
		result = Calculator.floor(3.6);
		//TODO : 단위테스트 실패를 보기위해 실패를 유도한 코드
		//내림 함수 함수여서 3.6을 인자로 주면 3.0이라는 결과가 예상되지만 4라고 테스트해서 단위 테스트 결과 확인해보기
//		assertTrue("The result should be 4.", (result==4));
		
		//TODO : Test실패 확인 후 수정한 정상적인 코드
		assertTrue("The result should be 3.", (result==3));
	}

	@Test
	public void testAbs() {
		//fail("Not yet implemented");
		
		double result;
		
		result = Calculator.abs(10);
		assertTrue("The result should be 10.", (result==10));
	}

}
