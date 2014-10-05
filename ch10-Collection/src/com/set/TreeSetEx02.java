/*
정렬의 기준을 정하는 Comparable<T> 인터페이스 구현

---------------------------------------------------------------------
compareTo 메소드 구현 기준
-다음의 기준으로 구현을 해야 하며 작다’, ‘크다’, ‘같다’의 기준은 프로그래머가 결정해야 합니다.
인자로 전달된 obj가	작다면	양의 정수를 반환.
인자로 전달된 obj가	크다면	음의 정수를 반환.
인자로 전달된 obj와	같다면	0을 반환.

*/
package com.set;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet<E> 인스턴스에 저장이 되려면 Comparable<T> 인터페이스를 구현해야 합니다.
class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    
    public void showData() {
    	System.out.printf("%s %d \n", name, age);
    }
    
    //Person 클래스의 comareTo 메소드는 정렬의 기준을 ‘나이의 많고 적음’으로 구현 하였다.
    public int compareTo(Person p) {
        if(age>p.age)
            return 1;	//크다
        else if(age<p.age)
            return -1;	//작다
        else	
            return 0;	//같다
    }
}

class TreeSetEx02 {
	public static void main(String[] args) {
		TreeSet<Person> sTree=new TreeSet<Person>();
		sTree.add(new Person("Juliet", 29));
		sTree.add(new Person("Chloe", 24));
		sTree.add(new Person("Hannah", 18));
		sTree.add(new Person("Victoria", 34));
		
		Iterator<Person> itr=sTree.iterator();
		while(itr.hasNext())
			itr.next().showData();
	}
}