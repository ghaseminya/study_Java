package lambda01;
/*
File Info
*Compare.java	• interface Compare
				• compareTo()라는 메소드를 가지고 있는 Compare 인터페이스
				 
LambdaEx.java	• class LambdaEx
				• Compare 인터페이스를 이용하는 클래스
*/

//TODO 1: compareTo()라는 메소드를 가지고 있는 Compare 인터페이스 정의
public interface Compare {
    //추상 메소드 정의 - 2개의 값을 비교하여 어떤 값이 더 큰지 구하는 메소드
    public int compareTo(int value1, int value2);

}
