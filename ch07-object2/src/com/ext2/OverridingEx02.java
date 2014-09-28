/*
오버라이딩 관계에서의 메소드 호출
참조변수의 자료형에 상관없이 오버라이딩 된 메소드는 외부로부터
가려지므로, 마지막으로 오버라이딩 한 메소드가 호출된다

*/
package com.ext2;

class AClass
{
	public void rideMethod(){
		System.out.println("AClass's Method");}
	public void loadMethod(){
		System.out.println("void Method");}
}

class BClass extends AClass
{
	public void rideMethod(){
		System.out.println("BClass's Method");}
	public void loadMethod(int num){
		System.out.println("int Method");}
}

class CClass extends BClass
{
	public void rideMethod(){
		System.out.println("CClass's Method");}
	public void loadMethod(double num){
		System.out.println("double Method");}
}


public class OverridingEx02 {

	public static void main(String[] args) {
		AClass ref1=new CClass();		
		BClass ref2=new CClass();
		CClass ref3=new CClass();
		
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
//		참조변수의 자료형에 상관없이 오버라이딩 된 메소드는 외부로부터
//		가려지므로, 마지막으로 오버라이딩 한 메소드가 호출된다
		
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.2);
	}
}
