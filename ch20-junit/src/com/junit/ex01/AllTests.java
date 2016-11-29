package com.junit.ex01;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestSuite;
/*
테스트 러너(Test Runner)
	• JUnit프레임 워크에서 테스트 클래스 내에 존재하는 각각의 테스트 메소드 실행을 담당하고 있는 클래스
	• 테스트 러너는 테스트 클래스의 구조에 맞게 테스트 메소드들을 실행하고 결과를 표시하는 역할을 합니다.
	• 테스트 케이스를 이클립스에서 실행하면 내부적으로 Junit의 BlockJUnit4ClassRunner라는 테스트 러너 클래스가 실행되고
	 이클립스는 그 결과를 해석해서 개발자에게 화면으로 보여줍니다.

@RunWith
	• @RunWith 어노테이션은 JUnit에 내장된 기본 테스트 러너인 BlockJUnit4ClassRunner대신에 
	@RunWith로 지정된 클래스를 이용해 클래스 내의 테스트 메소드들을 수행하도록 지정해주는 어노테이션
	• JUnit 프레임워크의 확장
	• 이를 이용하여 자신에게 필요한 테스트 러너를 직접 만들어서 자신만의 고유한 기능을 추가해 테스트를 수행할 수 있습니다.
	• 스프링 프레임워크(Spring Framework)에서 제공하는 SpringJUnit4ClassRunner클래스가 이 확장 기능을 이용한 대표적인 사례입니다. @RunWith로 SpringJUnit4ClassRunner.class를 지정하면 @Repeat, @ProfileValueSourceConfiguration, @IfProfileValue등 스프링에서 자체적으로 만들어 놓은 추가적인 테스트 기능을 이용할 수 있습니다.
	• JUnit 내부에서도 기본 러너를 확장하 클래스가 있는데 대표적인 것이 SuiteClassses입니다.

@SuiteClasses
@SuiteClasses 애노테이션을 이용하면 여러 개의 테스트 클래스를 일괄적으로 수행할 수 있습니다.

@SuiteClasses({ CalculatorTest.class, BTest.class, CTest.class })
CalculatorTest.class, BTest.class, CTest.class 세개의 클래스를 순차적으로 실행하겠다는 의미입니다.
*/
@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class })
public class AllTests {

}
