/* TV 채널변경하기 - 객체 생성후 객체의 멤버메소드 호출을 통한 멤버 변수 변경
 *  
 */

//주 클래스만 public지정 할 수 있다.
class Tv{	
	//멤버 변수(속성)
	String color;	//색상
	boolean power;	//전원유무
	int channel;	//채널
	
	//멤버 메소드(동작)
	//전원 유무 변환 시키기
	public void power(){
		power = ! power;		
	}
	
	//채널 올리기
	public void channelUp(){
		++channel;
	}
	
	//채널 내리기
	public void channelDown(){
		--channel;
	}
}

// 주 클래스
public class TvTest {
	
	//main은 객체에 포함되지 않음.
	//그냥 메인함수로만 취급
	//클래스 로더가 main을 메모리에 올리고 
	//그 다음 객체를 생성합니다. 멤버 메소드만 객체에 포함됩니다.
	public static void main(String[] args) {
		Tv t = new Tv();
		
		System.out.println("TV 실행 유무 : " + t.power);
		// 전원 켜기
		t.power();
		System.out.println("TV 실행 유무 : " + t.power);		
		
		System.out.println();
		System.out.println("현재 채널 : " + t.channel);
		//채널 변경하기
		t.channel = 7;
		System.out.println("변경된 채널 : " + t.channel);
				
		//채널 업/다운
		t.channelDown();
		System.out.println("변경된 채널 : " + t.channel);
		
		t.channelUp();
		System.out.println("변경된 채널 : " + t.channel);		
		
		System.out.println();
		// TV전원 끄기
		t.power();
		System.out.println("TV 실행 유무 : " + t.power);
		
		t.color = "blue";
	}
}
