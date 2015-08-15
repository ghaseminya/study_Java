
//File Info
//package com.package1;	PackOneIcecreamsandwich.java 다른 패키지의 클래스 생성
//package com.package1;	PackOneJellybeans.java		다른 패키지의 클래스 생성
//package com.package2;	PackTwoKitKat.java			같은 패키지내의 클래스 생성
//package com.package2;	PackTwoLollipop.java		같은 패키지내의 클래스 생성
//package com.package2;	PackageEx					main부, 	클래스 호출(같은 패키지의 클래스 호출, 다른 패키지의 클래스 호출)

//------------------
//같은 패키지의 클래스 호출
//다른 패키지의 클래스 호출

package com.package2;

import com.package1.PackOneJellybeans;

//클래스 여러개 import: 해당 패키지내의 모든 클래스가 import 됩니다.
//import com.package1.*;

public class PackageEx {

	public static void main(String[] args) {
		//com.sample.PackThree p3 = new com.sample.PackThree();
		//같은 패키지의 클래스를 호출할 때는 패키지 생략가능
		PackTwoKitKat p2k = new PackTwoKitKat();
		System.out.println(p2k.str);

		PackTwoLollipop p2l = new PackTwoLollipop();
		System.out.println(p2l.str);

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
