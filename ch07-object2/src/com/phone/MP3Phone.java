package com.phone;

//MP3 기능 추가
public class MP3Phone extends CellPhone{
	
	private int size;		//음악 저장용 용량
	private String color;	//색상
	
	public MP3Phone(String model, String number, int bellsound, int size, String color){
		this.model = model;
		this.number = number;
		this.bellsound = bellsound;
		
		this.size = size;
		this.color = color;
	}
	
	public int getSize(){
		return size;
	}
	
	public String getColor(){
		return color;
	}

}
