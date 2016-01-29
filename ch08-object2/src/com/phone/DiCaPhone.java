package com.phone;

//카메라 기능 추가
public class DiCaPhone extends CellPhone{
	
	private String pixel;	//화소
	private String lens;	//렌즈
	
	public DiCaPhone(String model, String number, int bellsound, 
			String pixel, String lens){
		this.model = model;
		this.number = number;
		this.bellsound = bellsound;
		
		this.pixel = pixel;
		this.lens=lens;
	}
	
	public String getPixel(){
		return pixel;
	}

	public String getLens(){
		return lens;
	}
}
