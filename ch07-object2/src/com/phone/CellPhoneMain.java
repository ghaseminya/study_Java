/* 상속
 * 
 * 
 * 부모 클래스를 상속받는 자식클래스 정의하고
 * 정의된 클래스를 객체생성한 후 
 * 멤버메소드를 호출하여 출력 
 *  */

package com.phone;

public class CellPhoneMain {

	public static void main(String[] args) {
		
		DicaPhone dp = new DicaPhone("A1001", "N1001", 1001, "800만", "F1.8");
		
		MP3Phone mp = new MP3Phone("B1001", "M1001", 2001, 1024, "red");
		
		System.out.println("모델\t 번호\t 코드\t 옵션(화소수/사이즈/색상 등)");
		System.out.print(dp.getModel()+"\t");
		System.out.print(dp.getNumber()+"\t");
		System.out.print(dp.getBellSound()+"\t");
		System.out.print(dp.getPixel()+" , ");
		System.out.println(dp.getLens());
		
		
		System.out.print(mp.getModel()+"\t");
		System.out.print(mp.getNumber()+"\t");
		System.out.print(mp.getBellSound()+"\t");
		System.out.print(mp.getSize()+" , ");
		System.out.println(mp.getColor());
		
	}

}
