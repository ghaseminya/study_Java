package com.ext1;

public class DicaPhone extends CellPhone{
	private String pixel;
	
	
	
	public DicaPhone(String model, String number, int chord, String pixel){
		this.model = model;
		this.number = number;
		this.chord = chord;
		this.pixel = pixel;
	}
	
	public String getPixel(){
		return pixel;
	}

}
