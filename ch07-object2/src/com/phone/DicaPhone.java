package com.phone;

public class DicaPhone extends CellPhone{
	
	private String pixel;
	private String lens;
	
	public DicaPhone(String model, String number, int bellsound, String pixel, String lens){
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
