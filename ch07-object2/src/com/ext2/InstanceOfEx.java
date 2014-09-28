/*


instanceof 연산자
	• 형변환이 가능한지를 묻는 연산자입니다.
	• 형변환이 가능하면 true를 가능하지 않으면 false를 반환합니다.

*/
package com.ext2;

class Box
{
	public void simpleWrap(){System.out.println("simple wrap");}
}

class PaperBox extends Box
{
	public void paperWrap() {System.out.println("paper wrap");}
}

class GoldPaperBox extends PaperBox
{
	public void goldWrap() {System.out.println("gold wrap");}
}

public class InstanceOfEx {

	public static void wrapBox(Box box)
	{
		if(box instanceof GoldPaperBox)		//box가 GoldPaperBox로 형변환 가능하다면
			((GoldPaperBox)box).goldWrap();
		else if(box instanceof PaperBox)	//box가 PaperBox로 형변환 가능하다면
			((PaperBox)box).paperWrap();
		else
			box.simpleWrap();
	}
	
	public static void main(String[] args)
	{
		Box box1=new Box();
		PaperBox box2=new PaperBox();
		GoldPaperBox box3=new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

}
