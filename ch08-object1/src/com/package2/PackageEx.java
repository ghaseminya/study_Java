/*
//File Info
//package com.package1;	PackOneIcecreamsandwich.java	다른 패키지의 클래스 생성
//package com.package1;	PackOneJellybeans.java		 	다른 패키지의 클래스 생성
//package com.package2;	PackTwoKitKat.java			 	같은 패키지내의 클래스 생성
//package com.package2;	PackTwoLollipop.java			같은 패키지내의 클래스 생성
//package com.package2;	PackageEx						main부, 클래스 호출
 * 														(같은 패키지의 클래스 호출, 다른 패키지의 클래스 호출)

//----------------------
//TODO : 같은 패키지의 클래스 호출
//TODO : 다른 패키지의 클래스 호출



패키지(package)
	• 자바에서 이야기하는 패키지는 서로 관련 있는 클래스와 인터페이스를 하나의 단위로 묶는 것을 의미하며, 
	     일종의 Library(자료실)와 비슷
	• 클래스의 중복 문제를 해결하기 위한 수단
	• 패키지는 폴더로 관리되어 집니다


패키지 선언 형식
package 패키지경로명;


eclipse를 통한 패키지 선언
eclipse를 사용하면 클래스 생성시 지정한 패키지이름으로 자동 컴파일이 되어 집니다.


인스턴스 생성시
패키지 선언 후 인스턴스 생성시 패키지 전체 경로로만 인스턴스를 생성할 수 있습니다.


패키지 선언 조건
	• 패키지문은 반드시 한번만 사용가능
	• 클래스 선언보다 먼저 선언
	• 패키지명은 계층 구조를 가지고 있습니다.
	• 중복되면 안되며 패키지명은 도메인 형식으로 지정하는 것이 일반적입니다.
	• 서로 다른 패키지로 만든 클래스들끼리는 서로 접근할 수 없습니다.
	• JDK에서 제공하는 API도 패키지로 제공됩니다.
	• 패키지로 만든 클래스 파일은 일반 컴파일이 아닌 패키지 컴파일을 해야 합니다.


패키지 사용 방법
	• 패키지에 있는 특정한 클래스를 사용하려면 import문을 추가해야 합니다.
	• import는 '수입하다'란 뜻이므로 현재 객체에서 원하는 다른 객체를 가져다 사용할 때 사용하는 예약어 입니다.
	• 자바 인터프리터는 import하는 패키지 경로의 클래스들을 환결설정시 등록한 CLASSPATH환경변수에 지정된 경로를 우선적으로 검색합니다.


import 선언 형식 (패키지 사용 형식)
	• import 선언
	• * 통한 import 선언
	• 잘못된 import선언


o import 선언
package문 아래에 선언

import 패키지명.클래스명;

import University.Korea.Student;
University.Korea패키지의 Student클래스를 의미하며 앞의 경로는 생략하고 Student 클래스 이름만으로 표시하고 사용하겠다는 의미입니다.


o * 통한 import 선언

import [패키지경로.*]; 

import University.Korea.*;
University.Korea로 묶어져 있는 클래스의 인스턴스 생성시 패키지 이름은 생략하고 클래스의 이름만으로 명시하겠다는 의미


o 잘못된 import선언
	• 클래스명 중복
	• 패키지 명이 생략되므로

import University.Korea.Student;
import University.America.Student; 

*/
package com.package2;

import com.package1.PackOneJellybeans;

//클래스 여러개 import: 해당 패키지내의 모든 클래스가 import 됩니다.
//import com.package1.*;

public class PackageEx {

	public static void main(String[] args) {
		//TODO : 같은 패키지의 클래스 호출
//		com.package2.PackTwoKitKat p2k = new com.package2.PackTwoKitKat(); 
		//같은 패키지의 클래스를 호출할 때는 패키지 생략가능
		PackTwoKitKat p2k = new PackTwoKitKat();
		System.out.println(p2k.str);

		PackTwoLollipop p2l = new PackTwoLollipop();
		System.out.println(p2l.str);

		
		//TODO : 다른 패키지의 클래스 호출
		//다른 패키지의 클래스를 호출할 때는 패키지명 전체를 명시해야 합니다.
//		PackOneIcecreamsandwich p1i = new PackOneIcecreamsandwich(); //ERROR-PackOneIcecreamsandwich cannot be resolved to a type
		//com.package1.PackOneIcecreamsandwich p1i = new com.package1.PackOneIcecreamsandwich();

		//다른 패키지의 인스턴스 변수를 직접 호출할 수 없음 (public으로 선언하거나 getter메소드 사용하면 호출가능)
//		System.out.println( p1i.str ); //ERROR-p1i cannot be resolved to a variable
		
		com.package1.PackOneIcecreamsandwich p1i = new com.package1.PackOneIcecreamsandwich();
		System.out.println(p1i.getStr()); //getter메소드 사용하여 호출 (강추)

		System.out.println( p1i.msg ); //public으로 선언된 인스턴스 변수 직접 호출 (비추)
		
		
		//클래스 상단에 import문을 이용해 패키지와 클래스(패키지 포함)를 등록하면 코드 작성시 클래스명만 기재할 수 있습니다.
		PackOneJellybeans p1j = new PackOneJellybeans();
		System.out.println(p1j.getStr());
	}
}
