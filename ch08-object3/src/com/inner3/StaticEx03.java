//Nested Class - NestedClass가 private으로 선언된 경우


package com.inner3;

class OuterClassOne
{
	OuterClassOne()
	{
		NestedClass nst=new NestedClass();
		nst.simpleMethod();
	}
	
	static class NestedClass
	{
		public void simpleMethod()
		{
			System.out.println("Nested Instance Method One");
		}
	}
}

class OuterClassTwo
{
	OuterClassTwo()
	{
		//NestedClass는 private로 되어 있어 
		//선언된 클래스 내부(OuterClassTwo)에서만 인스턴스를 생성할 수 있습니다.
		NestedClass nst=new NestedClass();
		nst.simpleMethod();		
	}
	
	//NestedClass가 private으로 선언되면, 선언된 클래스 내부에서만 인스턴스를 생성할 수 있습니다.
	private static class NestedClass
	{
		public void simpleMethod()
		{
			System.out.println("Nested Instance Method Two");
		}
	}
}

class StaticEx03
{	
	public static void main(String[] args)
	{
		OuterClassOne one=new OuterClassOne();
		OuterClassTwo two=new OuterClassTwo();
		
		OuterClassOne.NestedClass nst1=new OuterClassOne.NestedClass();
		nst1.simpleMethod();

		//NestedClass가 private으로 선언되면, 선언된 클래스 내부에서만 인스턴스를 생성할 수 있습니다.
		//ERROR-The type OuterClassTwo.NestedClass is not visible
//		OuterClassTwo.NestedClass nst2=new OuterClassTwo.NestedClass(); 
//		nst2.simpleMethod();
	}
}


/*//출력결과
Nested Instance Method One
Nested Instance Method Two
Nested Instance Method One
*/
